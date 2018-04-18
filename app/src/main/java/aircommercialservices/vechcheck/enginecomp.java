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

public class enginecomp extends AppCompatActivity {

    Button sbtn29,sbtn30,sbtn31,sbtn32,sbtn33,sbtn34, engfinish;
    CheckBox CB29, CB30, CB31, CB32, CB33, CB34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enginecomp);

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

        sbtn29 = findViewById(R.id.spannerbtn29);
        sbtn30 = findViewById(R.id.spannerbtn30);
        sbtn31 = findViewById(R.id.spannerbtn31);
        sbtn32 = findViewById(R.id.spannerbtn32);
        sbtn33 = findViewById(R.id.spannerbtn33);
        sbtn34 = findViewById(R.id.spannerbtn34);
        engfinish = findViewById(R.id.Engfinish);

        CB29 = findViewById(R.id.enginemountings);
        CB30 = findViewById(R.id.oilleaksengine);
        CB31 = findViewById(R.id.fueltanksengine);
        CB32 = findViewById(R.id.exhaustsystemengine);
        CB33 = findViewById(R.id.speedlimiter);
        CB34 = findViewById(R.id.aircompressor);

        //opening pop up defect activty
        sbtn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I29 = new Intent(getApplicationContext(), defectActivity.class);
                I29.putExtra("message","Engine mountings");
                startActivity(I29);
            }
        });

        sbtn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I30 = new Intent(getApplicationContext(), defectActivity.class);
                I30.putExtra("message","Oil leaks");
                startActivity(I30);
            }
        });

        sbtn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I31 = new Intent(getApplicationContext(), defectActivity.class);
                I31.putExtra("message","Fuel tanks and systems");
                startActivity(I31);
            }
        });

        sbtn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I32 = new Intent(getApplicationContext(), defectActivity.class);
                I32.putExtra("message","Exhaust system");
                startActivity(I32);
            }
        });

        sbtn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I33 = new Intent(getApplicationContext(), defectActivity.class);
                I33.putExtra("message","Speed limiter- Condition, seals, linkage");
                startActivity(I33);
            }
        });

        sbtn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I34 = new Intent(getApplicationContext(), defectActivity.class);
                I34.putExtra("message","Air compressor- exhauster, driver belts");
                startActivity(I34);
            }
        });

        CB29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(enginecomp.this, "Engine Mountings not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(enginecomp.this, "Oil leaks not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(enginecomp.this, "Fuel tanks and Systems not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(enginecomp.this, "Exhaust Systens not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(enginecomp.this, "Speed Limiter Plate not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(enginecomp.this, "Air Compressor not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        engfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
