package aircommercialservices.vechcheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UnderAlongsideTrailer extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_under_alongside_trailer);

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

    }
}
