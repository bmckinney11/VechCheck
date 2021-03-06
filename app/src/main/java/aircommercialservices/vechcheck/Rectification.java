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
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

import static aircommercialservices.vechcheck.R.layout.activity_rectification;

public class Rectification extends AppCompatActivity {

    ImageView imagev;
    ListView list;
    Button Logout;
    private FirebaseAuth nAuth;
    FirebaseDatabase database;
    DatabaseReference dbReference;
    ArrayList<String> defectlist;
    ArrayAdapter<String> adapter;
    defectivelist defectivelist;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_rectification);

        imagev = findViewById(R.id.imageviewpdf);
        list = findViewById(R.id.list);
        Logout = findViewById(R.id.logout4);
        defectivelist = new defectivelist();
        database = FirebaseDatabase.getInstance();
        dbReference = database.getReference("Defects");
        defectlist = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, R.layout.defect_info, R.id.defectinfo, defectlist);

        //taking list of defects from the database
        dbReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot snapshot: dataSnapshot.getChildren()){

                    defectivelist = snapshot.getValue(defectivelist.class);
                    assert defectivelist != null;
                    defectlist.add(defectivelist.getFeature()+ "  "+ defectivelist.getDefectdescript()+ "  "+ defectivelist.getDefectrank());
                }
                list.setAdapter(adapter);
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        //Logout method
        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent logoutintent = new Intent(Rectification.this,LoginScreen.class);
                startActivity(logoutintent);
            }
        });
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
