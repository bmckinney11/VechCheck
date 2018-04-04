package aircommercialservices.vechcheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Trailerbrakesandtyres extends AppCompatActivity {

    Button btn24,btn25,btn26,btn27,btn28,btn29,btn30,btn31,btn32,btn33,btn50,btn51,btn52,btn53;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trailerbrakesandtyres);

        btn24 = findViewById(R.id.spanner24);
        btn25 = findViewById(R.id.spanner25);
        btn26 = findViewById(R.id.spanner26);
        btn27 = findViewById(R.id.spanner27);
        btn28 = findViewById(R.id.spanner28);
        btn29 = findViewById(R.id.spanner29);
        btn30 = findViewById(R.id.spanner30);
        btn31 = findViewById(R.id.spanner31);
        btn32 = findViewById(R.id.spanner32);
        btn33 = findViewById(R.id.spanner33);

        btn50 = findViewById(R.id.spanner50);
        btn51 = findViewById(R.id.spanner51);
        btn52 = findViewById(R.id.spanner52);

        btn53 = findViewById(R.id.spanner53);

        //opening pop up defect activity
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
