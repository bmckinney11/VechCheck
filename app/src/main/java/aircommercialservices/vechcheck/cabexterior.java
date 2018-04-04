package aircommercialservices.vechcheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cabexterior extends AppCompatActivity {

    Button sbtn20,sbtn21,sbtn22,sbtn23,sbtn24,sbtn25,sbtn26,sbtn27,sbtn28;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabexterior);

        sbtn20 = findViewById(R.id.spannerbtn20);
        sbtn21 = findViewById(R.id.spannerbtn21);
        sbtn22 = findViewById(R.id.spannerbtn22);
        sbtn23 = findViewById(R.id.spannerbtn23);
        sbtn24 = findViewById(R.id.spannerbtn24);
        sbtn25 = findViewById(R.id.spannerbtn25);
        sbtn26 = findViewById(R.id.spannerbtn26);
        sbtn27 = findViewById(R.id.spannerbtn27);
        sbtn28 = findViewById(R.id.spannerbtn28);

        //opening pop up defect activity

        sbtn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I20 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I20);
            }
        });

        sbtn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I21 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I21);
            }
        });

        sbtn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I22 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I22);
            }
        });

        sbtn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I23 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I23);
            }
        });

        sbtn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I24 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I24);
            }
        });

        sbtn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I25 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I25);
            }
        });

        sbtn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I26 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I26);
            }
        });

        sbtn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I27 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I27);
            }
        });

        sbtn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I28 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I28);
            }
        });

    }
}
