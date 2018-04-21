package aircommercialservices.vechcheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;


public class insidecab extends AppCompatActivity {

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    Button sbtn1, sbtn2, sbtn3, sbtn4, sbtn5, sbtn6, sbtn7, sbtn8, sbtn9, sbtn10, sbtn11, sbtn12, sbtn13, sbtn14, sbtn15, sbtn16, sbtn17, sbtn18, sbtn19;
    Button finish;
    CheckBox CB1, CB2, CB3, CB4, CB5, CB6, CB7, CB8, CB9, CB10, CB11, CB12, CB13, CB14, CB15, CB16, CB17, CB18, CB19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insidecab);

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
        finish = findViewById(R.id.insidecabfinished);

        CB1 = findViewById(R.id.chassis);
        CB2 = findViewById(R.id.speedlimiterplate);
        CB3 = findViewById(R.id.seatbelts);
        CB4 = findViewById(R.id.cabfloor);
        CB5 = findViewById(R.id.seats);
        CB6 = findViewById(R.id.viewtofront);
        CB7 = findViewById(R.id.conditionglass);
        CB8 = findViewById(R.id.screenwipers);
        CB9 = findViewById(R.id.speedmetertaco);
        CB10 = findViewById(R.id.enginetaco);
        CB11 = findViewById(R.id.audiablewarning);
        CB12 = findViewById(R.id.drivingcontrols);
        CB13 = findViewById(R.id.steeringwheel);
        CB14 = findViewById(R.id.pressure);
        CB15 = findViewById(R.id.servicebrakepedal);
        CB16 = findViewById(R.id.servicebrake);
        CB17 = findViewById(R.id.brakecontrolvalve);
        CB18 = findViewById(R.id.frontfogaux);
        CB19 = findViewById(R.id.cabheater);

        //opening popupwindow with each spannerbtn
        sbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I1 = new Intent(getApplicationContext(), defectActivity.class);
                I1.putExtra("message", "Chassis Plate");
                startActivity(I1);
            }
        });

        sbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I2 = new Intent(getApplicationContext(), defectActivity.class);
                I2.putExtra("message", "Speed Limiter Plate");
                startActivity(I2);
            }
        });

        sbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I3 = new Intent(getApplicationContext(), defectActivity.class);
                I3.putExtra("message", "Seat belts and Supplementary Restraints");
                startActivity(I3);
            }
        });

        sbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I4 = new Intent(getApplicationContext(), defectActivity.class);
                I4.putExtra("message", "Cab Floors and Steps");
                startActivity(I4);
            }
        });

        sbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I5 = new Intent(getApplicationContext(), defectActivity.class);
                I5.putExtra("message", "Seats- Drivers seat adjustments fully functional");
                startActivity(I5);
            }
        });

        sbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I6 = new Intent(getApplicationContext(), defectActivity.class);
                I6.putExtra("message", "View to Front");
                startActivity(I6);
            }
        });

        sbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I7 = new Intent(getApplicationContext(), defectActivity.class);
                I7.putExtra("message", "Condition of Glass");
                startActivity(I7);
            }
        });

        sbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I8 = new Intent(getApplicationContext(), defectActivity.class);
                I8.putExtra("message", "Screen Wipers and Washers");
                startActivity(I8);
            }
        });

        sbtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I9 = new Intent(getApplicationContext(), defectActivity.class);
                I9.putExtra("message", "Speedometer/Tacograph");
                startActivity(I9);
            }
        });

        sbtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I10 = new Intent(getApplicationContext(), defectActivity.class);
                I10.putExtra("message", "Engine Tacometer");
                startActivity(I10);
            }
        });

        sbtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I11 = new Intent(getApplicationContext(), defectActivity.class);
                I11.putExtra("message", "Audiable Warnings- horn");
                startActivity(I11);
            }
        });

        sbtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I12 = new Intent(getApplicationContext(), defectActivity.class);
                I12.putExtra("message", "Driving Controls");
                startActivity(I12);
            }
        });

        sbtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I13 = new Intent(getApplicationContext(), defectActivity.class);
                I13.putExtra("message", "Steering Wheel- free play");
                startActivity(I13);
            }
        });

        sbtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I14 = new Intent(getApplicationContext(), defectActivity.class);
                I14.putExtra("message", "Pressure- build up");
                startActivity(I14);
            }
        });

        sbtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I15 = new Intent(getApplicationContext(), defectActivity.class);
                I15.putExtra("message", "Service brake pedal");
                startActivity(I15);
            }
        });

        sbtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I16 = new Intent(getApplicationContext(), defectActivity.class);
                I16.putExtra("message", "Service brake");
                startActivity(I16);
            }
        });

        sbtn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I17 = new Intent(getApplicationContext(), defectActivity.class);
                I17.putExtra("message", "Hand operated brake control valve");
                startActivity(I17);
            }
        });

        sbtn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I18 = new Intent(getApplicationContext(), defectActivity.class);
                I18.putExtra("message", "Front fog and aux lamp switched");
                startActivity(I18);
            }
        });

        sbtn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I19 = new Intent(getApplicationContext(), defectActivity.class);
                I19.putExtra("message", "Cab heater/demister/air conditioning");
                startActivity(I19);
            }
        });

        CB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(insidecab.this, "Chassis Plate not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(insidecab.this, "Speed limiter plate not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(insidecab.this, "Seat Belts and Restraints not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox)v;
                if (defectcheck.isChecked()){
                    Toast.makeText(insidecab.this, "Cab Floor and Steps not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox)v;
                if (defectcheck.isChecked()){
                    Toast.makeText(insidecab.this, "Seats not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox)v;
                if (defectcheck.isChecked()){
                    Toast.makeText(insidecab.this, "View to front not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox)v;
                if (defectcheck.isChecked()){
                    Toast.makeText(insidecab.this, "Condition of Glass not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox)v;
                if (defectcheck.isChecked()){
                    Toast.makeText(insidecab.this, "Screen wiper and washers not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox)v;
                if (defectcheck.isChecked()){
                    Toast.makeText(insidecab.this, "Speedometer and Tacogrpah not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox)v;
                if (defectcheck.isChecked()){
                    Toast.makeText(insidecab.this, "Engine Tacometer not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox)v;
                if (defectcheck.isChecked()){
                    Toast.makeText(insidecab.this, "Audiable Warnings not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox)v;
                if (defectcheck.isChecked()){
                    Toast.makeText(insidecab.this, "Driving controls not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox)v;
                if (defectcheck.isChecked()){
                    Toast.makeText(insidecab.this, "Steering wheel not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox)v;
                if (defectcheck.isChecked()){
                    Toast.makeText(insidecab.this, "Pressure not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox)v;
                if (defectcheck.isChecked()){
                    Toast.makeText(insidecab.this, "Service brake pedal not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox)v;
                if (defectcheck.isChecked()){
                    Toast.makeText(insidecab.this, "Service Brake not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox)v;
                if (defectcheck.isChecked()){
                    Toast.makeText(insidecab.this, "Hand Operated brake control valve not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox)v;
                if (defectcheck.isChecked()){
                    Toast.makeText(insidecab.this, "Front fog and Aux lamp switch not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox)v;
                if (defectcheck.isChecked()){
                    Toast.makeText(insidecab.this, "Cab heater/demister/air conditioning not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
