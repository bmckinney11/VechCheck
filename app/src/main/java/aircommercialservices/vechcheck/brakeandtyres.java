package aircommercialservices.vechcheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class brakeandtyres extends AppCompatActivity {

    Button sbtn72,sbtn73,sbtn74,sbtn75,sbtn76,sbtn77,sbtn78,sbtn79,sbtn80,sbtn81,sbtn82,sbtn83,sbtn84,sbtn85,sbtn86,sbtn87;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brakeandtyres);

        sbtn72 = findViewById(R.id.spannerbtn72);
        sbtn73 = findViewById(R.id.spannerbtn73);
        sbtn74 = findViewById(R.id.spannerbtn74);
        sbtn75 = findViewById(R.id.spannerbtn75);
        sbtn76 = findViewById(R.id.spannerbtn76);
        sbtn77 = findViewById(R.id.spannerbtn77);
        sbtn78 = findViewById(R.id.spannerbtn78);
        sbtn79 = findViewById(R.id.spannerbtn79);
        sbtn80 = findViewById(R.id.spannerbtn80);
        sbtn81 = findViewById(R.id.spannerbtn81);
        sbtn82 = findViewById(R.id.spannerbtn82);
        sbtn83 = findViewById(R.id.spannerbtn83);
        sbtn84 = findViewById(R.id.spannerbtn84);
        sbtn85 = findViewById(R.id.spannerbtn85);
        sbtn86 = findViewById(R.id.spannerbtn86);
        sbtn87 = findViewById(R.id.spannerbtn87);

        //opening popup defect activity

        sbtn72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I72 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I72);
            }
        });

        sbtn73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I73 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I73);
            }
        });

        sbtn74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I74 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I74);
            }
        });

        sbtn75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I75 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I75);
            }
        });

        sbtn76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I76 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I76);
            }
        });

        sbtn77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I77 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I77);
            }
        });

        sbtn78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I78 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I78);
            }
        });

        sbtn79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I79 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I79);
            }
        });

        sbtn80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I80 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I80);
            }
        });

        sbtn81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I81 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I81);
            }
        });

        sbtn82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I82 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I82);
            }
        });

        sbtn83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I83 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I83);
            }
        });

        sbtn84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I84 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I84);
            }
        });

        sbtn85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I85 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I85);
            }
        });

        sbtn86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I86 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I86);
            }
        });

        sbtn87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I87 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I87);
            }
        });

    }
}