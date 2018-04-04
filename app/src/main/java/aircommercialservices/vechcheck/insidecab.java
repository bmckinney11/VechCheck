package aircommercialservices.vechcheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class insidecab extends AppCompatActivity {

    Button sbtn1,sbtn2,sbtn3,sbtn4,sbtn5,sbtn6,sbtn7,sbtn8,sbtn9,sbtn10,sbtn11,sbtn12,sbtn13,sbtn14,sbtn15,sbtn16,sbtn17,sbtn18,sbtn19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insidecab);

        sbtn1 = findViewById(R.id.spannerbtn1);
        sbtn2 = findViewById(R.id.spannerbtn2);
        sbtn3 = findViewById(R.id.spannerbtn3);
        sbtn4 = findViewById(R.id.spannerbtn4);
        sbtn5 = findViewById(R.id.spannerbtn5);
        sbtn6 = findViewById(R.id.spannerbtn6);
        sbtn7 = findViewById(R.id.spannerbtn7);
        sbtn8 = findViewById(R.id.spannerbtn8);
        sbtn9 = findViewById(R.id.spannerbtn9);
        sbtn10 = findViewById(R.id.spannerbtn10);
        sbtn11 = findViewById(R.id.spannerbtn11);
        sbtn12 = findViewById(R.id.spannerbtn12);
        sbtn13 = findViewById(R.id.spannerbtn13);
        sbtn14 = findViewById(R.id.spannerbtn14);
        sbtn15 = findViewById(R.id.spannerbtn15);
        sbtn16 = findViewById(R.id.spannerbtn16);
        sbtn17 = findViewById(R.id.spannerbtn17);
        sbtn18 = findViewById(R.id.spannerbtn18);
        sbtn19 = findViewById(R.id.spannerbtn19);

        //opening popupwindow with each spannerbtn
        sbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I1 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I1);
            }
        });

        sbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I2 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I2);
            }
        });

        sbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I3 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I3);
            }
        });

        sbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I4 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I4);
            }
        });

        sbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I5 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I5);
            }
        });

        sbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I6 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I6);
            }
        });

        sbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I7 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I7);
            }
        });

        sbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I8 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I8);
            }
        });

        sbtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I9 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I9);
            }
        });

        sbtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I10 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I10);
            }
        });

        sbtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I11 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I11);
            }
        });

        sbtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I12 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I12);
            }
        });

        sbtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I13 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I13);
            }
        });

        sbtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I14 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I14);
            }
        });

        sbtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I15 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I15);
            }
        });

        sbtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I16 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I16);
            }
        });

        sbtn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I17 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I17);
            }
        });

        sbtn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I18 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I18);
            }
        });

        sbtn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I19 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I19);
            }
        });

    }
}
