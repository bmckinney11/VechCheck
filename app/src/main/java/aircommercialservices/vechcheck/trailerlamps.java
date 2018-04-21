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

public class trailerlamps extends AppCompatActivity {

    Button btn38,btn39,btn40,btn41,btn42,btn43,btn44,btn45,btn46,btn47,btn48,btn49, TLfinish;
    CheckBox cb38,cb39,cb40,cb41,cb42,cb43,cb44,cb45, cb46,cb47,cb48,cb49;

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

        cb38 = findViewById(R.id.rearreflec);
        cb39 = findViewById(R.id.consmarkings);
        cb40 = findViewById(R.id.frontlamps);
        cb41 = findViewById(R.id.rearlamps);
        cb42 = findViewById(R.id.numberplatelamps);
        cb43 = findViewById(R.id.rearfog);
        cb44 = findViewById(R.id.reflectors);
        cb45 = findViewById(R.id.dirhazindicators);
        cb46 = findViewById(R.id.brakelamps);
        cb47 = findViewById(R.id.reversinglamps);
        cb48 = findViewById(R.id.sidemarker);
        cb49 = findViewById(R.id.numberplatecarrier);

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

        cb38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(trailerlamps.this, "Rear reflective markings not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cb39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(trailerlamps.this, "Conspicuity markings not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cb40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(trailerlamps.this, "Front lamps and outline markers not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cb41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(trailerlamps.this, "Rear lamps and outline markers not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cb42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(trailerlamps.this, "Number plate lamps not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cb43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(trailerlamps.this, "Rear fog lamps not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cb44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(trailerlamps.this, "Reflectors not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cb45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(trailerlamps.this, "Direction and hazard indicators not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cb46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(trailerlamps.this, "Brake lamps not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cb47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(trailerlamps.this, "Reversing lamps not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cb48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(trailerlamps.this, "Side marker lamps not defective", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cb49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox defectcheck = (CheckBox) v;
                if (defectcheck.isChecked()) {
                    Toast.makeText(trailerlamps.this, "Number plate carrier not defective", Toast.LENGTH_SHORT).show();
                }
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
