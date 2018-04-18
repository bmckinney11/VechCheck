package aircommercialservices.vechcheck;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

import static aircommercialservices.vechcheck.R.layout.activity_rectification;

public class Rectification extends AppCompatActivity {

    int checked;
    ArrayList<String> TV;
    ImageView imagev;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_rectification);

        imagev = findViewById(R.id.imageviewpdf);

        TV = Objects.requireNonNull(getIntent().getExtras()).getStringArrayList("message");

        //TODO SIGNIUTRE
    }

    public void pickImage(View view){

        Intent picintent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(picintent, 120);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 120 && resultCode == RESULT_OK && data != null)
        {

            Uri selectedimageduri = data.getData();

            String[] filepath = {MediaStore.Images.Media.DATA};
            Cursor curso = getContentResolver().query(Objects.requireNonNull(selectedimageduri), filepath, null,null,null);
            Objects.requireNonNull(curso).moveToFirst();

            int columnIndex = curso.getColumnIndex(filepath[0]);
            String mypath = curso.getString(columnIndex);
            curso.close();

            Bitmap bitmap = BitmapFactory.decodeFile(mypath);

            imagev.setImageBitmap(bitmap);

            // create a new document
            PdfDocument document = new PdfDocument();

            PdfDocument.PageInfo pageInfo = new PdfDocument.PageInfo.Builder(100,100,1).create();

            //starting the page
            PdfDocument.Page page = document.startPage(pageInfo);

            Canvas canvas = page.getCanvas();

            Paint paint = new Paint();
            paint.setColor(Color.parseColor("#FFFFFF"));
            canvas.drawPaint(paint);
            bitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), true);
            paint.setColor(Color.BLUE);
            canvas.drawBitmap(bitmap, 0,0, null);

            //adding text
            String text = "some text added";
            TextPaint textpaint = new TextPaint();
            textpaint.setAntiAlias(true);
            textpaint.setTextSize(4 * getResources().getDisplayMetrics().density);
            textpaint.setColor(0xFF000000);

            int width = (int)textpaint.measureText(text);
            StaticLayout staticLayout = new StaticLayout(text, textpaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0, false);
            staticLayout.draw(canvas);

            // finish the page
            document.finishPage(page);

            //save pdf to file
            File root = new File(Environment.getExternalStorageDirectory(), "Safety Inspections");
            if(!root.exists()){
                root.mkdir();
            }

            File file = new File(root, "defect.pdf");

            try{
                document.writeTo(new FileOutputStream(file));
                Toast.makeText(this, "Inspection PDF created", Toast.LENGTH_LONG).show();
            }catch (IOException e){
                e.printStackTrace();
                Toast.makeText(this, "Something went wrong:" + e.toString(),Toast.LENGTH_LONG).show();
            }

            //close the document
            document.close();
        }
    }

}
