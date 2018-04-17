package aircommercialservices.vechcheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class TrailerSuspensionandsteering extends AppCompatActivity {

    Button btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn34,btn35,btn36,btn37, susfinish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trailer_suspension_steering);

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

        btn16 = findViewById(R.id.spanner16);
        btn17 = findViewById(R.id.spanner17);
        btn18 = findViewById(R.id.spanner18);
        btn19 = findViewById(R.id.spanner19);
        btn20 = findViewById(R.id.spanner20);
        btn21 = findViewById(R.id.spanner21);
        btn22 = findViewById(R.id.spanner22);
        btn23 = findViewById(R.id.spanner23);

        btn34 = findViewById(R.id.spanner34);
        btn35 = findViewById(R.id.spanner35);
        btn36 = findViewById(R.id.spanner36);
        btn37 = findViewById(R.id.spanner37);
        susfinish = findViewById(R.id.susfinish);

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent16 = new Intent(getApplicationContext(), defectActivity.class);
                intent16.putExtra("message","Suspension pins bushes");
                startActivity(intent16);
            }
        });

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent17 = new Intent(getApplicationContext(), defectActivity.class);
                intent17.putExtra("message","Suspension Springs");
                startActivity(intent17);
            }
        });

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent18 = new Intent(getApplicationContext(), defectActivity.class);
                intent18.putExtra("message","Spring units links and sub-frames");
                startActivity(intent18);
            }
        });

        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent19 = new Intent(getApplicationContext(), defectActivity.class);
                intent19.putExtra("message","Shock absorbers");
                startActivity(intent19);
            }
        });

        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent20 = new Intent(getApplicationContext(), defectActivity.class);
                intent20.putExtra("message","Axle lift device");
                startActivity(intent20);
            }
        });

        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent21 = new Intent(getApplicationContext(), defectActivity.class);
                intent21.putExtra("message","Road Wheels and hubs");
                startActivity(intent21);
            }
        });

        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent22 = new Intent(getApplicationContext(), defectActivity.class);
                intent22.putExtra("message","Airbags");
                startActivity(intent22);
            }
        });

        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent23 = new Intent(getApplicationContext(), defectActivity.class);
                intent23.putExtra("message","Axle Alignment");
                startActivity(intent23);
            }
        });

        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent34 = new Intent(getApplicationContext(), defectActivity.class);
                intent34.putExtra("message","Stub axles and wheel bearing- Condition, wear, security and adjustment");
                startActivity(intent34);
            }
        });

        btn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent35 = new Intent(getApplicationContext(), defectActivity.class);
                intent35.putExtra("message","Steering Mechanisms");
                startActivity(intent35);
            }
        });

        btn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent36 = new Intent(getApplicationContext(), defectActivity.class);
                intent36.putExtra("message","Turntable");
                startActivity(intent36);
            }
        });

        btn37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent37 = new Intent(getApplicationContext(), defectActivity.class);
                intent37.putExtra("message","Steering Alignment");
                startActivity(intent37);
            }
        });

        susfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}
