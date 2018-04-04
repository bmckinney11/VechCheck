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
    Button interior, exterior, engine, underalong, groundlvl, tyresbrakes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_inspection);

        //text inputed about inspection shown at the top of the inspection
        VCname = getIntent().getExtras().getString("Company Name:");
        Reg = getIntent().getExtras().getString("Vehicle Registration:");
        VChassis = getIntent().getExtras().getString("Chassis Number:");
        VecYear = getIntent().getExtras().getString("Year of Vehicle:");
        VNAxles = getIntent().getExtras().getString("Number of Axles:");
        VBody = getIntent().getExtras().getString("Body Type:");
        VDate = getIntent().getExtras().getString("Date of Inspection:");

        vehicleinfo = findViewById(R.id.VehicleInfoTextView);
        vehicleinfo.setText("Company Name:"+" "+VCname+"Vehicle Registration:"+" "+Reg+'\n'+"Chassis Number:"+" "+VChassis+"Year of Vehicle:"+" "+VecYear+'\n'+"Number of Axles:"+" "+VNAxles+"Body Type:"+" "+VBody+'\n'+"Date Of Insepction:"+" "+VDate);

        //open up each inspection
        interior = findViewById(R.id.insidecabbtn);
        interior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vecintent1 = new Intent(getApplicationContext(), insidecab.class);
                startActivity(vecintent1);
            }
        });

        exterior = findViewById(R.id.cabexbtn);
        exterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vecintent2 = new Intent(getApplicationContext(),cabexterior.class);
                startActivity(vecintent2);
            }
        });

        engine= findViewById(R.id.engcompbtn);
        engine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vecintent3 = new Intent(getApplicationContext(), enginecomp.class);
                startActivity(vecintent3);
            }
        });

        underalong = findViewById(R.id.uavecbtn);
        underalong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vecintent4 = new Intent(getApplicationContext(), underalongsidevec.class);
                startActivity(vecintent4);
            }
        });

        groundlvl = findViewById(R.id.groundlvlbtn);
        groundlvl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vecintent5 = new Intent(getApplicationContext(), groundlevel.class);
                startActivity(vecintent5);
            }
        });

        tyresbrakes = findViewById(R.id.tyresbrakesbtn);
        tyresbrakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vecintent6 = new Intent(getApplicationContext(), brakeandtyres.class);
                startActivity(vecintent6);
            }
        });


    }
}
