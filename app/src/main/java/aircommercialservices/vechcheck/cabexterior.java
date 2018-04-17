package aircommercialservices.vechcheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import static aircommercialservices.vechcheck.R.layout.activity_cabexterior;

public class cabexterior extends AppCompatActivity {

    Button sbtn20,sbtn21,sbtn22,sbtn23,sbtn24,sbtn25,sbtn26,sbtn27,sbtn28, CEfinish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_cabexterior);

        //changing the display to popup
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (height * .7));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y = -20;

        getWindow().setAttributes(params);

        sbtn20 = findViewById(R.id.spannerbtn20);
        sbtn21 = findViewById(R.id.spannerbtn21);
        sbtn22 = findViewById(R.id.spannerbtn22);
        sbtn23 = findViewById(R.id.spannerbtn23);
        sbtn24 = findViewById(R.id.spannerbtn24);
        sbtn25 = findViewById(R.id.spannerbtn25);
        sbtn26 = findViewById(R.id.spannerbtn26);
        sbtn27 = findViewById(R.id.spannerbtn27);
        sbtn28 = findViewById(R.id.spannerbtn28);
        CEfinish = findViewById(R.id.CEfinish);

        //opening pop up defect activity

        sbtn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I20 = new Intent(getApplicationContext(), defectActivity.class);
                I20.putExtra("message","Bumper(front)");
                startActivity(I20);
            }
        });

        sbtn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I21 = new Intent(getApplicationContext(), defectActivity.class);
                I21.putExtra("message","Condition of wings/spray suppresion(front)");
                startActivity(I21);
            }
        });

        sbtn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I22 = new Intent(getApplicationContext(), defectActivity.class);
                I22.putExtra("message","Cab security including tilt warning");
                startActivity(I22);
            }
        });

        sbtn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I23 = new Intent(getApplicationContext(), defectActivity.class);
                I23.putExtra("message","Cab doors including hinges and locks");
                startActivity(I23);
            }
        });

        sbtn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I24 = new Intent(getApplicationContext(), defectActivity.class);
                I24.putExtra("message","Cab floor and steps");
                startActivity(I24);
            }
        });

        sbtn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I25 = new Intent(getApplicationContext(), defectActivity.class);
                I25.putExtra("message","Mirrors and indirect vision devices(external)");
                startActivity(I25);
            }
        });

        sbtn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I26 = new Intent(getApplicationContext(), defectActivity.class);
                I26.putExtra("message","Side lights and outline markers");
                startActivity(I26);
            }
        });

        sbtn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I27 = new Intent(getApplicationContext(), defectActivity.class);
                I27.putExtra("message","Headlamps(operation,aim,adjustment mechanism)");
                startActivity(I27);
            }
        });

        sbtn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I28 = new Intent(getApplicationContext(), defectActivity.class);
                I28.putExtra("message","Frong fog and spot lamps,dipped and main beam warning light");
                startActivity(I28);
            }
        });

        CEfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
