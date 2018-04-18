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

public class groundlevel extends AppCompatActivity {

    Button sbtn35,sbtn36,sbtn37,sbtn38,sbtn39,sbtn40,sbtn41, glfinish;
    CheckBox CB35, CB36,CB37,CB38,CB39, CB40, CB41;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groundlevel);

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

        sbtn35 = findViewById(R.id.spannerbtn35);
        sbtn36 = findViewById(R.id.spannerbtn36);
        sbtn37 = findViewById(R.id.spannerbtn37);
        sbtn38 = findViewById(R.id.spannerbtn38);
        sbtn39 = findViewById(R.id.spannerbtn39);
        sbtn40 = findViewById(R.id.spannerbtn40);
        sbtn41 = findViewById(R.id.spannerbtn41);
        glfinish = findViewById(R.id.GLfinish);

        CB35 = findViewById(R.id.roadwheelsvec);
        CB36 = findViewById(R.id.sideguardsunderrun);
        CB37 = findViewById(R.id.vehicletotrailer);
        CB38 = findViewById(R.id.wingssprayrear);
        CB39 = findViewById(R.id.secconditionbody);
        CB40 = findViewById(R.id.containerscranes);
        CB41 = findViewById(R.id.tippinggearvec);

        //opening pop up defect activity

        sbtn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I35 = new Intent(getApplicationContext(), defectActivity.class);
                I35.putExtra("message","Road wheels and hubs");
                startActivity(I35);
            }
        });

        sbtn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I36 = new Intent(getApplicationContext(), defectActivity.class);
                I36.putExtra("message","Sideguards and rear underrun guards");
                startActivity(I36);
            }
        });

        sbtn37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I37 = new Intent(getApplicationContext(), defectActivity.class);
                I37.putExtra("message","Vehicle to trailer coupling");
                startActivity(I37);
            }
        });

        sbtn38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I38 = new Intent(getApplicationContext(), defectActivity.class);
                I38.putExtra("message","Condition of wings/spray suppression(rear)");
                startActivity(I38);
            }
        });

        sbtn39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I39 = new Intent(getApplicationContext(), defectActivity.class);
                I39.putExtra("message","Security and condition of the body");
                startActivity(I39);
            }
        });

        sbtn40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I40 = new Intent(getApplicationContext(), defectActivity.class);
                I40.putExtra("message","Security of body, containers and crane support legs");
                startActivity(I40);
            }
        });

       sbtn41.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
                Intent I41 = new Intent(getApplicationContext(), defectActivity.class);
                I41.putExtra("message","Tipping gear- hydraulic rams, pivots and safety devices");
                startActivity(I41);
           }
        });

        CB35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(groundlevel.this, "Road Wheels and Hubs not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(groundlevel.this, "Sideguards and Rear underrun guards not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(groundlevel.this, "Trailer coupling, hoses and self sealing valves not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(groundlevel.this, "Condition of the rear wings and spray suppression not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(groundlevel.this, "Security and condition of the body not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(groundlevel.this, "Security of body containers and crane support legs not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(groundlevel.this, "Tipping gear not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

       glfinish.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               finish();
           }
       });


    }
}
