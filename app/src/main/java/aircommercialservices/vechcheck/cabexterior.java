package aircommercialservices.vechcheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import static aircommercialservices.vechcheck.R.layout.activity_cabexterior;

public class cabexterior extends AppCompatActivity {

    Button sbtn20,sbtn21,sbtn22,sbtn23,sbtn24,sbtn25,sbtn26,sbtn27,sbtn28, CEfinish;
    CheckBox CB20, CB21, CB22, CB23,CB24, CB25,CB26,CB27, CB28;

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

        CB20 = findViewById(R.id.bumpervec);
        CB21 = findViewById(R.id.wingssprayfront);
        CB22 = findViewById(R.id.cabsecurity);
        CB23 = findViewById(R.id.cabdoors);
        CB24 = findViewById(R.id.cabfloorex);
        CB25 = findViewById(R.id.mirrors);
        CB26 = findViewById(R.id.sidelightsoutline);
        CB27 = findViewById(R.id.headlamps);
        CB28 = findViewById(R.id.frontfogspot);

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

        CB20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(cabexterior.this, "Front Bumper not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(cabexterior.this, " Front wings and spray supression not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(cabexterior.this, "Cab security not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(cabexterior.this, "Cab doors not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(cabexterior.this, "Exterior cab floor not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(cabexterior.this, "External mirrors and Indirect Vision devices not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(cabexterior.this, "Side Lights and outline markes not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(cabexterior.this, "Headlamps not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(cabexterior.this, "Front fog and Spot lamps not defective", Toast.LENGTH_SHORT).show();
                }
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
