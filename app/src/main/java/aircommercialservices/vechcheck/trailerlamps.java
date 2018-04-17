package aircommercialservices.vechcheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class trailerlamps extends AppCompatActivity {

    Button btn38,btn39,btn40,btn41,btn42,btn43,btn44,btn45,btn46,btn47,btn48,btn49, TLfinish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trailerlamps);

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

        btn38 = findViewById(R.id.spanner38);
        btn39 = findViewById(R.id.spanner39);
        btn40 = findViewById(R.id.spanner40);
        btn41 = findViewById(R.id.spanner41);
        btn42 = findViewById(R.id.spanner42);
        btn43 = findViewById(R.id.spanner43);
        btn44 = findViewById(R.id.spanner44);
        btn45 = findViewById(R.id.spanner45);
        btn46 = findViewById(R.id.spanner46);
        btn47 = findViewById(R.id.spanner47);
        btn48 = findViewById(R.id.spanner48);
        btn49 = findViewById(R.id.spanner49);
        TLfinish = findViewById(R.id.TLfinish);

        //opening popup defect activity
        btn38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent38 = new Intent(getApplicationContext(), defectActivity.class);
                intent38.putExtra("message","Rear Reflective markings");
                startActivity(intent38);
            }
        });

        btn39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent39 = new Intent(getApplicationContext(), defectActivity.class);
                intent39.putExtra("message","Conspicuity markings");
                startActivity(intent39);
            }
        });

        btn40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent40 = new Intent(getApplicationContext(), defectActivity.class);
                intent40.putExtra("message","Front lamps and outline markers");
                startActivity(intent40);
            }
        });

        btn41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent41 = new Intent(getApplicationContext(), defectActivity.class);
                intent41.putExtra("message","Rear lamps and outline markers");
                startActivity(intent41);
            }
        });

        btn42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent42 = new Intent(getApplicationContext(), defectActivity.class);
                intent42.putExtra("message","Number plate lamps");
                startActivity(intent42);
            }
        });
        btn43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent43 = new Intent(getApplicationContext(), defectActivity.class);
                intent43.putExtra("message","Rear fog lamps");
                startActivity(intent43);
            }
        });

        btn44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent44 = new Intent(getApplicationContext(), defectActivity.class);
                intent44.putExtra("message","Reflectors(Side,Front and Rear)");
                startActivity(intent44);
            }
        });

        btn45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent45 = new Intent(getApplicationContext(), defectActivity.class);
                intent45.putExtra("message","Direction/Hazard indicators");
                startActivity(intent45);
            }
        });

        btn46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent46 = new Intent(getApplicationContext(), defectActivity.class);
                intent46.putExtra("message","Brake lamps");
                startActivity(intent46);
            }
        });

        btn47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent47 = new Intent(getApplicationContext(), defectActivity.class);
                intent47.putExtra("message","Reversing lamp(s)");
                startActivity(intent47);
            }
        });

        btn48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent48 = new Intent(getApplicationContext(), defectActivity.class);
                intent48.putExtra("message","Side marker lamps");
                startActivity(intent48);
            }
        });

        btn49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent49 = new Intent(getApplicationContext(), defectActivity.class);
                intent49.putExtra("message","Number plate carrier");
                startActivity(intent49);
            }
        });

        TLfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
