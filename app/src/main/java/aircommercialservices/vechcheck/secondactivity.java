package aircommercialservices.vechcheck;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import com.google.firebase.auth.FirebaseAuth;

public class secondactivity extends AppCompatActivity {

    private FirebaseAuth nAuth;
    private FirebaseAuth.AuthStateListener authStateListener;
    VideoView videoview;
    Button TrailerBtn, VehicleBtn, Logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        //launching trailer check
        TrailerBtn = findViewById(R.id.TrailerButton);
        TrailerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startintent1 = new Intent (getApplicationContext(),TrailerInput.class);
                startActivity(startintent1);
            }
        });

        //launching Vehicle Check
        VehicleBtn = findViewById(R.id.VehicleButton);
        VehicleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startintent2 = new Intent (getApplicationContext(), VehicleInput.class);
                startActivity(startintent2);
            }
        });

        //signing out
        Logout = findViewById(R.id.logout);
        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nAuth = FirebaseAuth.getInstance();
                nAuth.signOut();
                startActivity(new Intent(secondactivity.this,LoginScreen.class));
            }
        });

        //showing video
        videoview = findViewById(R.id.videoView);
        videoview.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video);
        videoview.start();


    }
}
