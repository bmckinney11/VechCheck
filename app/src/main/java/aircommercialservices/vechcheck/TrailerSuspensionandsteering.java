package aircommercialservices.vechcheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrailerSuspensionandsteering extends AppCompatActivity {

    Button btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn34,btn35,btn36,btn37;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trailer_suspension_steering);

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

    }
}
