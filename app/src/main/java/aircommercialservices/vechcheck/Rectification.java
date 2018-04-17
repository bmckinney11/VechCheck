package aircommercialservices.vechcheck;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static aircommercialservices.vechcheck.R.layout.activity_rectification;

public class Rectification extends AppCompatActivity {

    TableLayout t1;
    String feature, defectdescription, radiochoice;
    TextView info, radiobtnsTV;
    Button btnCreate;
    int checked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_rectification);

        //create pdf
        btnCreate = findViewById(R.id.button2);
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                createPdf();
            }
        });


        //pulling message value from inspection activities
        Intent intent = getIntent();
        String notdefective = intent.getStringExtra("notdefective");
        ((TextView) findViewById(R.id.help)).setText(notdefective);

        //TODO SIGNIUTRE
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void createPdf() {
        // create a new document
        PdfDocument document = new PdfDocument();

        PdfDocument.PageInfo pageInfo = new PdfDocument.PageInfo.Builder(100,100,1).create();

        //starting the page
        PdfDocument.Page page = document.startPage(pageInfo);

        Canvas canvas = page.getCanvas();

        Paint paint = new Paint();
        paint.setColor(Color.RED);
        canvas.drawCircle(50, 50,30, paint);

        // finish the page
        document.finishPage(page);

        //create the second page
        pageInfo = new PdfDocument.PageInfo.Builder(500,500,2).create();
        page = document.startPage(pageInfo);
        canvas = page.getCanvas();
        paint = new Paint();
        paint.setColor(Color.BLUE);
        canvas.drawCircle(200,200,100,paint);
        document.finishPage(page);

        //write the document content
        String targetPdf = "/sdcard/tst.pdf";
        File filePath = new File(targetPdf);

        try{
            document.writeTo(new FileOutputStream(filePath));
            Toast.makeText(this, "Inspection PDF created", Toast.LENGTH_LONG).show();
        }catch (IOException e){
            e.printStackTrace();
            Toast.makeText(this, "Something went wrong:" + e.toString(),Toast.LENGTH_LONG).show();
        }

        //close the document
        document.close();
    }
}
