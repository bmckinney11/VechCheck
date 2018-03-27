package aircommercialservices.vechcheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VehicleInspection extends AppCompatActivity {

    String VCname;
    String Reg;
    String VChassis;
    String VecYear;
    String VNAxles;
    String VBody;
    String VDate;
    TextView vehicleinfo;
    Button sbtn1,sbtn2,sbtn3,sbtn4,sbtn5,sbtn6,sbtn7,sbtn8,sbtn9,sbtn10,sbtn11,sbtn12,sbtn13,sbtn14,sbtn15,sbtn16,sbtn17,sbtn18,sbtn19,sbtn20,sbtn21,sbtn22,sbtn23,sbtn24,sbtn25,sbtn26,sbtn27,sbtn28,sbtn29,sbtn30,sbtn31,sbtn32,sbtn33,sbtn34,sbtn35,sbtn36,sbtn37,sbtn38,sbtn39,sbtn40,sbtn41,sbtn42,sbtn43,sbtn44,sbtn45,sbtn46,sbtn47,sbtn48,sbtn49,sbtn50,sbtn51,sbtn52,sbtn53,sbtn54,sbtn55,sbtn56,sbtn57,sbtn58,sbtn59,sbtn60,sbtn61,sbtn62,sbtn63,sbtn64,sbtn65,sbtn66,sbtn67,sbtn68,sbtn69,sbtn70,sbtn71,sbtn72,sbtn73,sbtn74,sbtn75,sbtn76,sbtn77,sbtn78,sbtn79,sbtn80,sbtn81,sbtn82,sbtn83,sbtn84,sbtn85,sbtn86,sbtn87;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_inspection);

        sbtn1 = (Button)findViewById(R.id.spannerbtn1);
        sbtn2 = (Button)findViewById(R.id.spannerbtn2);
        sbtn3 = (Button)findViewById(R.id.spannerbtn3);
        sbtn4 = (Button)findViewById(R.id.spannerbtn4);
        sbtn5 = (Button)findViewById(R.id.spannerbtn5);
        sbtn6 = (Button)findViewById(R.id.spannerbtn6);
        sbtn7 = (Button)findViewById(R.id.spannerbtn7);
        sbtn8 = (Button)findViewById(R.id.spannerbtn8);
        sbtn9 = (Button)findViewById(R.id.spannerbtn9);
        sbtn10 = (Button)findViewById(R.id.spannerbtn10);
        sbtn11 = (Button)findViewById(R.id.spannerbtn11);
        sbtn12 = (Button)findViewById(R.id.spannerbtn12);
        sbtn13 = (Button)findViewById(R.id.spannerbtn13);
        sbtn14 = (Button)findViewById(R.id.spannerbtn14);
        sbtn15 = (Button)findViewById(R.id.spannerbtn15);
        sbtn16 = (Button)findViewById(R.id.spannerbtn16);
        sbtn17 = (Button)findViewById(R.id.spannerbtn17);
        sbtn18 = (Button)findViewById(R.id.spannerbtn18);
        sbtn19 = (Button)findViewById(R.id.spannerbtn19);
        sbtn20 = (Button)findViewById(R.id.spannerbtn20);
        sbtn21 = (Button)findViewById(R.id.spannerbtn21);
        sbtn22 = (Button)findViewById(R.id.spannerbtn22);
        sbtn23 = (Button)findViewById(R.id.spannerbtn23);
        sbtn24 = (Button)findViewById(R.id.spannerbtn24);
        sbtn25 = (Button)findViewById(R.id.spannerbtn25);
        sbtn26 = (Button)findViewById(R.id.spannerbtn26);
        sbtn27 = (Button)findViewById(R.id.spannerbtn27);
        sbtn28 = (Button)findViewById(R.id.spannerbtn28);
        sbtn29 = (Button)findViewById(R.id.spannerbtn29);
        sbtn30 = (Button)findViewById(R.id.spannerbtn30);
        sbtn31 = (Button)findViewById(R.id.spannerbtn31);
        sbtn32 = (Button)findViewById(R.id.spannerbtn32);
        sbtn33 = (Button)findViewById(R.id.spannerbtn33);
        sbtn34 = (Button)findViewById(R.id.spannerbtn34);
        sbtn35 = (Button)findViewById(R.id.spannerbtn35);
        sbtn36 = (Button)findViewById(R.id.spannerbtn36);
        sbtn37 = (Button)findViewById(R.id.spannerbtn37);
        sbtn38 = (Button)findViewById(R.id.spannerbtn38);
        sbtn39 = (Button)findViewById(R.id.spannerbtn39);
        sbtn40 = (Button)findViewById(R.id.spannerbtn40);
        sbtn41 = (Button)findViewById(R.id.spannerbtn41);
        sbtn42 = (Button)findViewById(R.id.spannerbtn42);
        sbtn43 = (Button)findViewById(R.id.spannerbtn43);
        sbtn44 = (Button)findViewById(R.id.spannerbtn44);
        sbtn45 = (Button)findViewById(R.id.spannerbtn45);
        sbtn46 = (Button)findViewById(R.id.spannerbtn46);
        sbtn47 = (Button)findViewById(R.id.spannerbtn47);
        sbtn48 = (Button)findViewById(R.id.spannerbtn48);
        sbtn49 = (Button)findViewById(R.id.spannerbtn49);
        sbtn50 = (Button)findViewById(R.id.spannerbtn50);
        sbtn51 = (Button)findViewById(R.id.spannerbtn51);
        sbtn52 = (Button)findViewById(R.id.spannerbtn52);
        sbtn53 = (Button)findViewById(R.id.spannerbtn53);
        sbtn54 = (Button)findViewById(R.id.spannerbtn54);
        sbtn55 = (Button)findViewById(R.id.spannerbtn55);
        sbtn56 = (Button)findViewById(R.id.spannerbtn56);
        sbtn57 = (Button)findViewById(R.id.spannerbtn57);
        sbtn58 = (Button)findViewById(R.id.spannerbtn58);
        sbtn59 = (Button)findViewById(R.id.spannerbtn59);
        sbtn60 = (Button)findViewById(R.id.spannerbtn60);
        sbtn61 = (Button)findViewById(R.id.spannerbtn61);
        sbtn62 = (Button)findViewById(R.id.spannerbtn62);
        sbtn63 = (Button)findViewById(R.id.spannerbtn63);
        sbtn64 = (Button)findViewById(R.id.spannerbtn64);
        sbtn65 = (Button)findViewById(R.id.spannerbtn65);
        sbtn66 = (Button)findViewById(R.id.spannerbtn66);
        sbtn67 = (Button)findViewById(R.id.spannerbtn67);
        sbtn68 = (Button)findViewById(R.id.spannerbtn68);
        sbtn69 = (Button)findViewById(R.id.spannerbtn69);
        sbtn70 = (Button)findViewById(R.id.spannerbtn70);
        sbtn71 = (Button)findViewById(R.id.spannerbtn71);
        sbtn72 = (Button)findViewById(R.id.spannerbtn72);
        sbtn73 = (Button)findViewById(R.id.spannerbtn73);
        sbtn74 = (Button)findViewById(R.id.spannerbtn74);
        sbtn75 = (Button)findViewById(R.id.spannerbtn75);
        sbtn76 = (Button)findViewById(R.id.spannerbtn76);
        sbtn77 = (Button)findViewById(R.id.spannerbtn77);
        sbtn78 = (Button)findViewById(R.id.spannerbtn78);
        sbtn79 = (Button)findViewById(R.id.spannerbtn79);
        sbtn80 = (Button)findViewById(R.id.spannerbtn80);
        sbtn81 = (Button)findViewById(R.id.spannerbtn81);
        sbtn82 = (Button)findViewById(R.id.spannerbtn82);
        sbtn83 = (Button)findViewById(R.id.spannerbtn83);
        sbtn84 = (Button)findViewById(R.id.spannerbtn84);
        sbtn85 = (Button)findViewById(R.id.spannerbtn85);
        sbtn86 = (Button)findViewById(R.id.spannerbtn86);
        sbtn87 = (Button)findViewById(R.id.spannerbtn87);

        //text inputed about inspection shown at the top of the inspection
        VCname = getIntent().getExtras().getString("Company Name:");
        Reg = getIntent().getExtras().getString("Vehicle Registration:");
        VChassis = getIntent().getExtras().getString("Chassis Number:");
        VecYear = getIntent().getExtras().getString("Year of Vehicle:");
        VNAxles = getIntent().getExtras().getString("Number of Axles:");
        VBody = getIntent().getExtras().getString("Body Type:");
        VDate = getIntent().getExtras().getString("Date of Inspection:");

        vehicleinfo = (TextView)findViewById(R.id.VehicleInfoTextView);
        vehicleinfo.setText("Company Name:"+" "+VCname+"Vehicle Registration:"+" "+Reg+'\n'+"Chassis Number:"+" "+VChassis+"Year of Vehicle:"+" "+VecYear+'\n'+"Number of Axles:"+" "+VNAxles+"Body Type:"+" "+VBody+'\n'+"Date Of Insepction:"+" "+VDate);

        //opening popupwindow with each spannerbtn
        sbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I1 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I1);
            }
        });

        sbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I2 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I2);
            }
        });

        sbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I3 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I3);
            }
        });

        sbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I4 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I4);
            }
        });

        sbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I5 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I5);
            }
        });

        sbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I6 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I6);
            }
        });

        sbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I7 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I7);
            }
        });

        sbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I8 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I8);
            }
        });

        sbtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I9 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I9);
            }
        });

        sbtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I10 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I10);
            }
        });

        sbtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I11 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I11);
            }
        });

        sbtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I12 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I12);
            }
        });

        sbtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I13 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I13);
            }
        });

        sbtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I14 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I14);
            }
        });

        sbtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I15 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I15);
            }
        });

        sbtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I16 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I16);
            }
        });

        sbtn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I17 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I17);
            }
        });

        sbtn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {Intent I18 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I18);
            }
        });

        sbtn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I19 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I19);
            }
        });

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

        sbtn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I35 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I35);
            }
        });

        sbtn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I36 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I36);
            }
        });

        sbtn37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I37 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I37);
            }
        });

        sbtn38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I38 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I38);
            }
        });

        sbtn39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I39 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I39);
            }
        });

        sbtn40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I40 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I40);
            }
        });

        sbtn41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I41 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I41);
            }
        });

        sbtn42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I42 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I42);
            }
        });

        sbtn43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I43 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I43);
            }
        });

        sbtn44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I44 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I44);
            }
        });

        sbtn45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I45 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(I45);
            }
        });



    }
}
