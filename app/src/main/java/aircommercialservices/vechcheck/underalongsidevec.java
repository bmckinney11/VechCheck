package aircommercialservices.vechcheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class underalongsidevec extends AppCompatActivity {

    Button sbtn42,sbtn43,sbtn44,sbtn45,sbtn46,sbtn47,sbtn48,sbtn49,sbtn50,sbtn51,sbtn52,sbtn53,sbtn54,sbtn55,sbtn56,sbtn57,sbtn58,sbtn59,sbtn60,sbtn61,sbtn62,sbtn63,sbtn64,sbtn65,sbtn66,sbtn67,sbtn68,sbtn69,sbtn70,sbtn71, uafinish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_underalongsidevec);

        sbtn42 = findViewById(R.id.spannerbtn42);
        sbtn43 = findViewById(R.id.spannerbtn43);
        sbtn44 = findViewById(R.id.spannerbtn44);
        sbtn45 = findViewById(R.id.spannerbtn45);
        sbtn46 = findViewById(R.id.spannerbtn46);
        sbtn47 = findViewById(R.id.spannerbtn47);
        sbtn48 = findViewById(R.id.spannerbtn48);
        sbtn49 = findViewById(R.id.spannerbtn49);
        sbtn50 = findViewById(R.id.spannerbtn50);
        sbtn51 = findViewById(R.id.spannerbtn51);
        sbtn52 = findViewById(R.id.spannerbtn52);
        sbtn53 = findViewById(R.id.spannerbtn53);
        sbtn54 = findViewById(R.id.spannerbtn54);
        sbtn55 = findViewById(R.id.spannerbtn55);
        sbtn56 = findViewById(R.id.spannerbtn56);
        sbtn57 = findViewById(R.id.spannerbtn57);
        sbtn58 = findViewById(R.id.spannerbtn58);
        sbtn59 = findViewById(R.id.spannerbtn59);
        sbtn60 = findViewById(R.id.spannerbtn60);
        sbtn61 = findViewById(R.id.spannerbtn61);
        sbtn62 = findViewById(R.id.spannerbtn62);
        sbtn63 = findViewById(R.id.spannerbtn63);
        sbtn64 = findViewById(R.id.spannerbtn64);
        sbtn65 = findViewById(R.id.spannerbtn65);
        sbtn66 = findViewById(R.id.spannerbtn66);
        sbtn67 = findViewById(R.id.spannerbtn67);
        sbtn68 = findViewById(R.id.spannerbtn68);
        sbtn69 = findViewById(R.id.spannerbtn69);
        sbtn70 = findViewById(R.id.spannerbtn70);
        sbtn71 = findViewById(R.id.spannerbtn71);
        uafinish = findViewById(R.id.uafinish);

        //opening the pop up defect activity
        sbtn42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I42 = new Intent(getApplicationContext(), defectActivity.class);
                I42.putExtra("message","Chassis");
                startActivity(I42);
            }
        });

        sbtn43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I43 = new Intent(getApplicationContext(), defectActivity.class);
                I43.putExtra("message","Electrical wiring equipment including batteries");
                startActivity(I43);
            }
        });

        sbtn44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I44 = new Intent(getApplicationContext(), defectActivity.class);
                I44.putExtra("message","Electrical connections for trailer");
                startActivity(I44);
            }
        });

        sbtn45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I45 = new Intent(getApplicationContext(), defectActivity.class);
                I45.putExtra("message","Oil Leaks");
                startActivity(I45);
            }
        });

        sbtn46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I46 = new Intent(getApplicationContext(), defectActivity.class);
                I46.putExtra("message","Fuel tanks and system");
                startActivity(I46);
            }
        });

        sbtn47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I47 = new Intent(getApplicationContext(), defectActivity.class);
                I47.putExtra("message","Exhaust System");
                startActivity(I47);
            }
        });

        sbtn48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I48 = new Intent(getApplicationContext(), defectActivity.class);
                I48.putExtra("message","Suspension pins and bushes");
                startActivity(I48);
            }
        });

        sbtn49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I49 = new Intent(getApplicationContext(), defectActivity.class);
                I49.putExtra("message","Suspension units,linkages and dust covers");
                startActivity(I49);
            }
        });

        sbtn50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I50 = new Intent(getApplicationContext(), defectActivity.class);
                I50.putExtra("message","Shock absorbers");
                startActivity(I50);
            }
        });

        sbtn51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I51 = new Intent(getApplicationContext(), defectActivity.class);
                I51.putExtra("message","Wheel bearings and seal");
                startActivity(I51);
            }
        });

        sbtn52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I52 = new Intent(getApplicationContext(), defectActivity.class);
                I52.putExtra("message","Stub axle and wheel bearings");
                startActivity(I52);
            }
        });

        sbtn53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I53 = new Intent(getApplicationContext(), defectActivity.class);
                I53.putExtra("message","Steering mechanism- lock function");
                startActivity(I53);
            }
        });

        sbtn54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I54 = new Intent(getApplicationContext(), defectActivity.class);
                I54.putExtra("message","Steering alignment");
                startActivity(I54);
            }
        });

        sbtn55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I55 = new Intent(getApplicationContext(), defectActivity.class);
                I55.putExtra("message","Steering gear and dust covers");
                startActivity(I55);
            }
        });

        sbtn56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I56 = new Intent(getApplicationContext(), defectActivity.class);
                I56.putExtra("message","Power steering anf fluid level");
                startActivity(I56);
            }
        });

        sbtn57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I57 = new Intent(getApplicationContext(), defectActivity.class);
                I57.putExtra("message","Axle alignment");
                startActivity(I57);
            }
        });

        sbtn58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I58 = new Intent(getApplicationContext(), defectActivity.class);
                I58.putExtra("message","Clutch operation");
                startActivity(I58);
            }
        });

        sbtn59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I59 = new Intent(getApplicationContext(), defectActivity.class);
                I59.putExtra("message","Changing speed mechanism");
                startActivity(I59);
            }
        });

        sbtn60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I60 = new Intent(getApplicationContext(), defectActivity.class);
                I60.putExtra("message","Differential lock- traction control");
                startActivity(I60);
            }
        });

        sbtn61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I61 = new Intent(getApplicationContext(), defectActivity.class);
                I61.putExtra("message","Axle lift device");
                startActivity(I61);
            }
        });

        sbtn62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I62 = new Intent(getApplicationContext(), defectActivity.class);
                I62.putExtra("message","Transmission-drive line- mountiings- dust covers");
                startActivity(I62);
            }
        });

        sbtn63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I63 = new Intent(getApplicationContext(), defectActivity.class);
                I63.putExtra("message","Rear marking and conspicuity markings");
                startActivity(I63);
            }
        });

        sbtn64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I64 = new Intent(getApplicationContext(), defectActivity.class);
                I64.putExtra("message","Rear lamps, outline markers and number plate lamp");
                startActivity(I64);
            }
        });

        sbtn65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I65 = new Intent(getApplicationContext(), defectActivity.class);
                I65.putExtra("message","Rear fog lamps, including warning device");
                startActivity(I65);
            }
        });

        sbtn66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I66 = new Intent(getApplicationContext(), defectActivity.class);
                I66.putExtra("message","Side and rear reflectors");
                startActivity(I66);
            }
        });

        sbtn67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I67 = new Intent(getApplicationContext(), defectActivity.class);
                I67.putExtra("message","Direction/hazard indicators including warning devices");
                startActivity(I67);
            }
        });

        sbtn68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I68 = new Intent(getApplicationContext(), defectActivity.class);
                I68.putExtra("message","Side marker lamps");
                startActivity(I68);
            }
        });

        sbtn69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I69 = new Intent(getApplicationContext(), defectActivity.class);
                I69.putExtra("message","Brake lights");
                startActivity(I69);
            }
        });

        sbtn70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I70 = new Intent(getApplicationContext(), defectActivity.class);
                I70.putExtra("message","Reversing lamps");
                startActivity(I70);
            }
        });

        sbtn71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I71 = new Intent(getApplicationContext(), defectActivity.class);
                I71.putExtra("message","Registration plate- secure,complete and legible");
                startActivity(I71);
            }
        });

        uafinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}

