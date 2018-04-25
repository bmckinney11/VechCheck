package aircommercialservices.vechcheck;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import static aircommercialservices.vechcheck.R.layout.activity_login_screen;

public class LoginScreen extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener authStateListener;
    private EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_login_screen);

        //opening pop up from information button
        Button instruction = findViewById(R.id.instructionbtn);
        instruction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent infointent = new Intent(getApplicationContext(), Information.class);
                startActivity(infointent);
            }
        });


        //login in feature

        mAuth = FirebaseAuth.getInstance();
        username = findViewById(R.id.usernameEditText);
        password = findViewById(R.id.passwordEditText);
        Button login = findViewById(R.id.loginbutton);

        authStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if (firebaseAuth.getCurrentUser() != null){
                   startActivity(new Intent(LoginScreen.this, secondactivity.class));
               }
            }
        };

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startSignIn();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(authStateListener);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(authStateListener != null){
            mAuth.removeAuthStateListener(authStateListener);
        }
    }

    private void startSignIn(){

        String Username = username.getText().toString();
        String Password = password.getText().toString();

        if(TextUtils.isEmpty(Username) || TextUtils.isEmpty(Password)){
            Toast.makeText(LoginScreen.this,"Please Enter Login Details",Toast.LENGTH_LONG).show();
        }else{
            mAuth.signInWithEmailAndPassword(Username,Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {

                    if (!task.isSuccessful()) {
                        Toast.makeText((LoginScreen.this), "Incorrect Details", Toast.LENGTH_LONG).show();
                    }
                }
            });
        }
    }
}
