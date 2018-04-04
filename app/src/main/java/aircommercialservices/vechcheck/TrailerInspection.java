package aircommercialservices.vechcheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TrailerInspection extends AppCompatActivity {

    String CName;
    String NIC;
    String ChNo;
    String TYear;
    String TNAxles;
    String TBody;
    String TDate;
    TextView trailerinfo;
    Button alongside, sussteer, lamps, brakestyres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trailer_inspection);

        //text inputed about inspection shown at the top of the inspection
        CName = getIntent().getExtras().getString("Company Name:");
        NIC = getIntent().getExtras().getString("Ni/C Number:");
        ChNo = getIntent().getExtras().getString("Chassis Number:");
        TYear = getIntent().getExtras().getString("Year of Trailer:");
        TNAxles = getIntent().getExtras().getString("Number of Axles");
        TBody = getIntent().getExtras().getString("Body Type:");
        TDate = getIntent().getExtras().getString("Date of Inspection:");

        trailerinfo = findViewById(R.id.TrailerInfoTextView);
        trailerinfo.setText("Company Name:"+" "+CName+"Ni/C Number:"+" "+NIC+'\n'+"Chassis Nunber:"+" "+ChNo+"Year of Trailer:"+" "+TYear+'\n'+"Number of axles:"+" "+TNAxles+"Body Type:"+" "+TBody+'\n'+"Date of Inspection:"+" "+TDate);

        //opening each seperate inspection
        alongside = findViewById(R.id.alongsidetrailer);
        alongside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent trailerintent1 = new Intent(getApplicationContext(), UnderAlongsideTrailer.class);
                startActivity(trailerintent1);
            }
        });

        sussteer = findViewById(R.id.trsuspensionandsteering);
        sussteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent trailerintent2 = new Intent(getApplicationContext(), TrailerSuspensionandsteering.class);
                startActivity(trailerintent2);
            }
        });

        lamps= findViewById(R.id.markingslamps);
        lamps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent trailerintent3 = new Intent(getApplicationContext(), trailerlamps.class);
                startActivity(trailerintent3);
            }
        });

        brakestyres= findViewById(R.id.trailerbrakesandtyres);
        brakestyres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent trailerintent4 = new Intent(getApplicationContext(), Trailerbrakesandtyres.class);
                startActivity(trailerintent4);
            }
        });

    }
}
