package aircommercialservices.vechcheck;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LoginScreen extends AppCompatActivity {

    Button instruction, newuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        //opening pop up from information button
        instruction = (Button)findViewById(R.id.instructionbtn);
        instruction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent infointent = new Intent(getApplicationContext(), Information.class);
                startActivity(infointent);
            }
        });

        //opening pop up from newuser button
        newuser = (Button)findViewById(R.id.newuserbtn);
        newuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nuintent = new Intent(getApplicationContext(), newuser.class);
                startActivity(nuintent);
            }
        });

        //opening activity2
        Button Login = (Button)findViewById(R.id.loginbutton);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startintent = new Intent(getApplicationContext(), secondactivity.class);
                startActivity(startintent);
            }
        });


    }
}
