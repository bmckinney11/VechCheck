package aircommercialservices.vechcheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class enginecomp extends AppCompatActivity {

    Button sbtn29,sbtn30,sbtn31,sbtn32,sbtn33,sbtn34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enginecomp);

        sbtn29 = findViewById(R.id.spannerbtn29);
        sbtn30 = findViewById(R.id.spannerbtn30);
        sbtn31 = findViewById(R.id.spannerbtn31);
        sbtn32 = findViewById(R.id.spannerbtn32);
        sbtn33 = findViewById(R.id.spannerbtn33);
        sbtn34 = findViewById(R.id.spannerbtn34);

        //opening pop up defect activty
        sbtn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I29 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I29);
            }
        });

        sbtn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I30 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I30);
            }
        });

        sbtn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I31 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I31);
            }
        });

        sbtn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I32 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I32);
            }
        });

        sbtn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I33 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I33);
            }
        });

        sbtn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I34 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I34);
            }
        });

    }
}
