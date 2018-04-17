package aircommercialservices.vechcheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class UnderAlongsideTrailer extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,UAfinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_under_alongside_trailer);

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

        btn1 = findViewById(R.id.spanner);
        btn2 = findViewById(R.id.spanner2);
        btn3 = findViewById(R.id.spanner3);
        btn4 = findViewById(R.id.spanner4);
        btn5 = findViewById(R.id.spanner5);
        btn6 = findViewById(R.id.spanner6);
        btn7 = findViewById(R.id.spanner7);
        btn8 = findViewById(R.id.spanner8);
        btn9 = findViewById(R.id.spanner9);
        btn10 = findViewById(R.id.spanner10);
        btn11 = findViewById(R.id.spanner11);
        btn12 = findViewById(R.id.spanner12);
        btn13 = findViewById(R.id.spanner13);
        btn14 = findViewById(R.id.spanner14);
        btn15 = findViewById(R.id.spanner15);
        UAfinish = findViewById(R.id.UAfinish);

        //opening pop up from each spanner button
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), defectActivity.class);
                intent1.putExtra("message","Chassis/Ni/C Plate- Position and detail");
                startActivity(intent1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), defectActivity.class);
                intent2.putExtra("message","Bumper- Security, Condition and Dimensions");
                startActivity(intent2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getApplicationContext(), defectActivity.class);
                intent3.putExtra("message","Rear underrrun device-Security, Condition and Dimensions");
                startActivity(intent3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getApplicationContext(), defectActivity.class);
                intent4.putExtra("message","Protective sideguards- security and condition");
                startActivity(intent4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(getApplicationContext(), defectActivity.class);
                intent5.putExtra("message","Fifth Wheel king pin and rubbing plate");
                startActivity(intent5);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(getApplicationContext(), defectActivity.class);
                intent6.putExtra("message","Drawbar and attachment- locking device");
                startActivity(intent6);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7 = new Intent(getApplicationContext(), defectActivity.class);
                intent7.putExtra("message","Landing legs");
                startActivity(intent7);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8 = new Intent(getApplicationContext(), defectActivity.class);
                intent8.putExtra("message","Body- Security of Mountings, displacement");
                startActivity(intent8);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent9 = new Intent(getApplicationContext(), defectActivity.class);
                intent9.putExtra("message","Wings/Flaps/Spray Suppression");
                startActivity(intent9);
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent10 = new Intent(getApplicationContext(), defectActivity.class);
                intent10.putExtra("message","Security of body containers and crane support legs");
                startActivity(intent10);
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent11 = new Intent(getApplicationContext(), defectActivity.class);
                intent11.putExtra("message","Tipping rams,pivots and controls");
                startActivity(intent11);
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent12 = new Intent(getApplicationContext(), defectActivity.class);
                intent12.putExtra("message","Oil leaks- extent");
                startActivity(intent12);
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent13 = new Intent(getApplicationContext(), defectActivity.class);
                intent13.putExtra("message","Fuel tanks and systems");
                startActivity(intent13);
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent14 = new Intent(getApplicationContext(), defectActivity.class);
                intent14.putExtra("message","Chassis(including sub frame");
                startActivity(intent14);
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent15 = new Intent(getApplicationContext(), defectActivity.class);
                intent15.putExtra("message","Electrical wiring, coupling sockets and equipment");
                startActivity(intent15);
            }
        });

        UAfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
