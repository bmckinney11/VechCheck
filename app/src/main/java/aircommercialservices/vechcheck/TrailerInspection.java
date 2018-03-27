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
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30,btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38,btn39,btn40,btn41,btn42,btn43,btn44,btn45,btn46,btn47,btn48,btn49,btn50,btn51,btn52,btn53;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trailer_inspection);

        btn1 = (Button)findViewById(R.id.spanner);
        btn2 = (Button)findViewById(R.id.spanner2);
        btn3 = (Button)findViewById(R.id.spanner3);
        btn4 = (Button)findViewById(R.id.spanner4);
        btn5 = (Button)findViewById(R.id.spanner5);
        btn6 = (Button)findViewById(R.id.spanner6);
        btn7 = (Button)findViewById(R.id.spanner7);
        btn8 = (Button)findViewById(R.id.spanner8);
        btn9 = (Button)findViewById(R.id.spanner9);
        btn10 = (Button)findViewById(R.id.spanner10);
        btn11 = (Button)findViewById(R.id.spanner11);
        btn12 = (Button)findViewById(R.id.spanner12);
        btn13 = (Button)findViewById(R.id.spanner13);
        btn14 = (Button)findViewById(R.id.spanner14);
        btn15 = (Button)findViewById(R.id.spanner15);
        btn16 = (Button)findViewById(R.id.spanner16);
        btn17 = (Button)findViewById(R.id.spanner17);
        btn18 = (Button)findViewById(R.id.spanner18);
        btn19 = (Button)findViewById(R.id.spanner19);
        btn20 = (Button)findViewById(R.id.spanner20);
        btn21 = (Button)findViewById(R.id.spanner21);
        btn22 = (Button)findViewById(R.id.spanner22);
        btn23 = (Button)findViewById(R.id.spanner23);
        btn24 = (Button)findViewById(R.id.spanner24);
        btn25 = (Button)findViewById(R.id.spanner25);
        btn26 = (Button)findViewById(R.id.spanner26);
        btn27 = (Button)findViewById(R.id.spanner27);
        btn28 = (Button)findViewById(R.id.spanner28);
        btn29 = (Button)findViewById(R.id.spanner29);
        btn30 = (Button)findViewById(R.id.spanner30);
        btn31 = (Button)findViewById(R.id.spanner31);
        btn32 = (Button)findViewById(R.id.spanner32);
        btn33 = (Button)findViewById(R.id.spanner33);
        btn34 = (Button)findViewById(R.id.spanner34);
        btn35 = (Button)findViewById(R.id.spanner35);
        btn36 = (Button)findViewById(R.id.spanner36);
        btn37 = (Button)findViewById(R.id.spanner37);
        btn38 = (Button)findViewById(R.id.spanner38);
        btn39 = (Button)findViewById(R.id.spanner39);
        btn40 = (Button)findViewById(R.id.spanner40);
        btn41 = (Button)findViewById(R.id.spanner41);
        btn42 = (Button)findViewById(R.id.spanner42);
        btn43 = (Button)findViewById(R.id.spanner43);
        btn44 = (Button)findViewById(R.id.spanner44);
        btn45 = (Button)findViewById(R.id.spanner45);
        btn46 = (Button)findViewById(R.id.spanner46);
        btn47 = (Button)findViewById(R.id.spanner47);
        btn48 = (Button)findViewById(R.id.spanner48);
        btn49 = (Button)findViewById(R.id.spanner49);
        btn50 = (Button)findViewById(R.id.spanner50);
        btn51 = (Button)findViewById(R.id.spanner51);
        btn52 = (Button)findViewById(R.id.spanner52);
        btn53 = (Button)findViewById(R.id.spanner53);

        //text inputed about inspection shown at the top of the inspection
        CName = getIntent().getExtras().getString("Company Name:");
        NIC = getIntent().getExtras().getString("Ni/C Number:");
        ChNo = getIntent().getExtras().getString("Chassis Number:");
        TYear = getIntent().getExtras().getString("Year of Trailer:");
        TNAxles = getIntent().getExtras().getString("Number of Axles");
        TBody = getIntent().getExtras().getString("Body Type:");
        TDate = getIntent().getExtras().getString("Date of Inspection:");

        trailerinfo = (TextView)findViewById(R.id.TrailerInfoTextView);
        trailerinfo.setText("Company Name:"+" "+CName+"Ni/C Number:"+" "+NIC+'\n'+"Chassis Nunber:"+" "+ChNo+"Year of Trailer:"+" "+TYear+'\n'+"Number of axles:"+" "+TNAxles+"Body Type:"+" "+TBody+'\n'+"Date of Inspection:"+" "+TDate);

        //opening pop up from each spanner button
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent5);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent6);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent7);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent8);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent9 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent9);
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent10 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent10);
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent11 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent11);
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent12 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent12);
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent13 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent13);
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent14 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent14);
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent15 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent15);
            }
        });

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent16 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent16);
            }
        });

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent17 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent17);
            }
        });

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent18 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent18);
            }
        });

        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent19 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent19);
            }
        });

        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent20 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent20);
            }
        });

        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent21 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent21);
            }
        });

        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent22 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent22);
            }
        });

        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent23 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent23);
            }
        });

        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent24 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent24);
            }
        });

        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent25 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent25);
            }
        });

        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent26 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent26);
            }
        });

        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent27 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent27);
            }
        });

        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent28 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent28);
            }
        });

        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent29 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent29);
            }
        });

        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent30 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent30);
            }
        });

        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent31 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent31);
            }
        });

        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent32 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent32);
            }
        });

        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent33 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent33);
            }
        });

        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent34 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent34);
            }
        });

        btn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent35 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent35);
            }
        });

        btn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent36 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent36);
            }
        });

        btn37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent37 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent37);
            }
        });

        btn38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent38 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent38);
            }
        });

        btn39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent39 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent39);
            }
        });

        btn40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent40 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent40);
            }
        });

        btn41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent41 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent41);
            }
        });

        btn42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent42 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent42);
            }
        });

        btn43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent43 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent43);
            }
        });

        btn44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent44 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent44);
            }
        });

        btn45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent45 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent45);
            }
        });

        btn46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent46 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent46);
            }
        });

        btn47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent47 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent47);
            }
        });

        btn48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent48 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent48);
            }
        });

        btn49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent49 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent49);
            }
        });

        btn50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent50 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent50);
            }
        });

        btn51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent51 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent51);
            }
        });

        btn52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent52 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent52);
            }
        });

        btn53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent53 = new Intent(getApplicationContext(), defectActivity.class);
                startActivity(intent53);
            }
        });


    }
}
