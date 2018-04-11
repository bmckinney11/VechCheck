package aircommercialservices.vechcheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class groundlevel extends AppCompatActivity {

    Button sbtn35,sbtn36,sbtn37,sbtn38,sbtn39,sbtn40,sbtn41;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groundlevel);

        sbtn35 = findViewById(R.id.spannerbtn35);
        sbtn36 = findViewById(R.id.spannerbtn36);
        sbtn37 = findViewById(R.id.spannerbtn37);
        sbtn38 = findViewById(R.id.spannerbtn38);
        sbtn39 = findViewById(R.id.spannerbtn39);
        sbtn40 = findViewById(R.id.spannerbtn40);
        sbtn41 = findViewById(R.id.spannerbtn41);

        //opening pop up defect activity

        sbtn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I35 = new Intent(getApplicationContext(), defectActivity.class);
                I35.putExtra("message","Road wheels and hubs");
                startActivity(I35);
            }
        });

        sbtn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I36 = new Intent(getApplicationContext(), defectActivity.class);
                I36.putExtra("message","Sideguards and rear underrun guards");
                startActivity(I36);
            }
        });

        sbtn37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I37 = new Intent(getApplicationContext(), defectActivity.class);
                I37.putExtra("message","Vehicle to trailer coupling");
                startActivity(I37);
            }
        });

        sbtn38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I38 = new Intent(getApplicationContext(), defectActivity.class);
                I38.putExtra("message","Condition of wings/spray suppression(rear)");
                startActivity(I38);
            }
        });

        sbtn39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I39 = new Intent(getApplicationContext(), defectActivity.class);
                I39.putExtra("message","Security and condition of the body");
                startActivity(I39);
            }
        });

        sbtn40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I40 = new Intent(getApplicationContext(), defectActivity.class);
                I40.putExtra("message","Security of body, containers and crane support legs");
                startActivity(I40);
            }
        });
        //TODO
       /* sbtn41.setOnClickListener(new View.OnClickListener() {
         *   @Override
        *    public void onClick(View view) {
            *    Intent I41 = new Intent(getApplicationContext(), defectActivity.class);
           *     I41.putExtra("message","Tipping gear- hydraulic rams, pivots and safety devices");
          *      startActivity(I41);
         *   }
        });*/

    }
}
