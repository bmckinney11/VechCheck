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

public class brakeandtyres extends AppCompatActivity {

    Button sbtn72,sbtn73,sbtn74,sbtn75,sbtn76,sbtn77,sbtn78,sbtn79,sbtn80,sbtn81,sbtn82,sbtn83,sbtn84,sbtn85,sbtn86,sbtn87, finish;
    CheckBox CB72, CB73,CB74,CB75,CB76,CB77,CB78,CB79,CB80,CB81,CB82,CB83,CB84,CB85,CB86,CB86, CB87;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brakeandtyres);

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

        CB72 = findViewById(R.id.hyfluidlevel);
        CB73 = findViewById(R.id.elecbrakingsystemandstabilitycontrol);
        CB74 = findViewById(R.id.mecbrakecomponentsvec);
        CB75 = findViewById(R.id.vecDLDP);
        CB76 = findViewById(R.id.brakeactuatorsvec);
        CB77 = findViewById(R.id.brakesyscomponentsvec);
        CB78 = findViewById(R.id.trailercoupling);
        CB79 = findViewById(R.id.loadsensingvec);
        CB80 = findViewById(R.id.antilock);
        CB81 = findViewById(R.id.supplydumpvalve);
        CB82 = findViewById(R.id.addbraking);
        CB83 = findViewById(R.id.sizetypetyresvec);
        CB84 = findViewById(R.id.condtyresvec);
        CB85 = findViewById(R.id.tyrepressurevec);
        CB86 = findViewById(R.id.driveaxles);
        CB87 = findViewById(R.id.ancillaryvec);


        //opening popup defect activity

        sbtn72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I72 = new Intent(getApplicationContext(), defectActivity.class);
                I72.putExtra("message","Hydraulic Fluid lvel");
                startActivity(I72);
            }
        });

        sbtn73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I73 = new Intent(getApplicationContext(), defectActivity.class);
                I73.putExtra("message","Electronic braking system/electronic stability control system");
                startActivity(I73);
            }
        });

        sbtn74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I74 = new Intent(getApplicationContext(), defectActivity.class);
                I74.putExtra("message","Mechanical brake components");
                startActivity(I74);
            }
        });

        sbtn75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I75 = new Intent(getApplicationContext(), defectActivity.class);
                I75.putExtra("message","Drums and linings/disc and pads");
                startActivity(I75);
            }
        });

        sbtn76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I76 = new Intent(getApplicationContext(), defectActivity.class);
                I76.putExtra("message","Brake actuators and adjusters- dust covers");
                startActivity(I76);
            }
        });

        sbtn77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I77 = new Intent(getApplicationContext(), defectActivity.class);
                I77.putExtra("message","Brake systems and components");
                startActivity(I77);
            }
        });

        sbtn78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I78 = new Intent(getApplicationContext(), defectActivity.class);
                I78.putExtra("message","Trailer coupling,hoses and function of self sealing valves");
                startActivity(I78);
            }
        });

        sbtn79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I79 = new Intent(getApplicationContext(), defectActivity.class);
                I79.putExtra("message","Load sensing/anti-lock systems");
                startActivity(I79);
            }
        });

        sbtn80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I80 = new Intent(getApplicationContext(), defectActivity.class);
                I80.putExtra("message","Anti-lock device");
                startActivity(I80);
            }
        });

        sbtn81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I81 = new Intent(getApplicationContext(), defectActivity.class);
                I81.putExtra("message","Operation of supply dump valve");
                startActivity(I81);
            }
        });

        sbtn82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I82 = new Intent(getApplicationContext(), defectActivity.class);
                I82.putExtra("message","Additional braking devices");
                startActivity(I82);
            }
        });

        sbtn83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I83 = new Intent(getApplicationContext(), defectActivity.class);
                I83.putExtra("message","Size and type of tyres");
                startActivity(I83);
            }
        });

        sbtn84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I84 = new Intent(getApplicationContext(), defectActivity.class);
                I84.putExtra("message","Condition of tyres");
                startActivity(I84);
            }
        });

        sbtn85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I85 = new Intent(getApplicationContext(), defectActivity.class);
                I85.putExtra("message","Pressure of all tyres");
                startActivity(I85);
            }
        });

        sbtn86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I86 = new Intent(getApplicationContext(), defectActivity.class);
                I86.putExtra("message","Drive axles comply with calibration plaque");
                startActivity(I86);
            }
        });

        sbtn87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I87 = new Intent(getApplicationContext(), defectActivity.class);
                I87.putExtra("message","Ancilliary equipment");
                startActivity(I87);
            }
        });

        CB72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(brakeandtyres.this, "hydraulic fluid level not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(brakeandtyres.this, "Electronic braking system and electronic stability control system not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(brakeandtyres.this, "Mechanic brake components not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(brakeandtyres.this, "Brake drums, linings, discs and pads not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(brakeandtyres.this, "Brake actuators and adjuster not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(brakeandtyres.this, "Braking system and components not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(brakeandtyres.this, "Trailer coupling, hoses and self sealing valves not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(brakeandtyres.this, "Load sensing and antilock system not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(brakeandtyres.this, "Antilock device not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(brakeandtyres.this, "Supply dump valve not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(brakeandtyres.this, "Additional braking devices not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(brakeandtyres.this, "Size and type of tyres correct", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(brakeandtyres.this, "Condition of tyres not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(brakeandtyres.this, "Pressure of tyres correct", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(brakeandtyres.this, "Drive axle tyres comply with calibration plaque", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CB87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(brakeandtyres.this, "Ancilliary equipment not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });




        //back to main inspection when finished this section
        finish = findViewById(R.id.BTfinish);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
