package aircommercialservices.vechcheck;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class TrailerInput extends AppCompatActivity {

    EditText CName;
    EditText NIC;
    EditText ChNO;
    EditText TYear;
    EditText TNAxles;
    EditText TBody;
    EditText TDate;
    Button TrBeginInspection;
    Button Trailerback;
    Button Logout;
    private FirebaseAuth nAuth;
    FirebaseDatabase database;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trailer_input);

       TrBeginInspection = findViewById(R.id.TbeginBtn);
       CName = findViewById(R.id.CompanyNameEdittext2);
       NIC = findViewById(R.id.NiCNumberEditText);
       ChNO = findViewById(R.id.TChassisNumberEditText);
       TYear = findViewById(R.id.YearOfTrailerEditText);
       TNAxles = findViewById(R.id.NumberOfAxlesEditText);
       TBody = findViewById(R.id.BodyTypeTrEditText);
       TDate = findViewById(R.id.DateOfInspectionTrEditText);
       Logout = findViewById(R.id.logout3);
       database = FirebaseDatabase.getInstance();
       databaseReference = database.getReference("Trailers");

        //passing input to TrailerInspection Activity
        TrBeginInspection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchTrailerActivityInfo();
                addTrailerArrayList();
            }
        });

        //navigate back to second activity
        Trailerback = findViewById(R.id.TrailerBackButton);
        Trailerback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startintent3 = new Intent(getApplicationContext(), secondactivity.class);
                startActivity(startintent3);
            }
        });


    }

    private void launchTrailerActivityInfo(){
        String cname = CName.getText().toString();
        String nicNumber = NIC.getText().toString();
        String chassisno = ChNO.getText().toString();
        String traileryear = TYear.getText().toString();
        String tnumberaxles = TNAxles.getText().toString();
        String tbodytype = TBody.getText().toString();
        String tdateofi = TDate.getText().toString();

        Intent intent = new Intent(TrailerInput.this, TrailerInspection.class);
        intent.putExtra("Company Name:",cname);
        intent.putExtra("Ni/C Number:", nicNumber);
        intent.putExtra("Chassis Number:", chassisno);
        intent.putExtra("Year of Trailer:", traileryear);
        intent.putExtra("Number of Axles:", tnumberaxles);
        intent.putExtra("Body Type:", tbodytype);
        intent.putExtra("Date of Inspection", tdateofi);
        startActivity(intent);
    }

    private void addTrailerArrayList(){
        String cname = CName.getText().toString().trim();
        String nicNumber = NIC.getText().toString().trim();
        String chassisno = ChNO.getText().toString().trim();
        String traileryear = TYear.getText().toString().trim();
        String tnumberaxles = TNAxles.getText().toString().trim();
        String tbodytype = TBody.getText().toString().trim();
        String tdateofi = TDate.getText().toString().trim();

        if(TextUtils.isEmpty(cname)){
            Toast.makeText(this,"Please enter Company Name!",Toast.LENGTH_LONG).show();
        }else if (TextUtils.isEmpty(nicNumber)){
            Toast.makeText(this,"Please enter NI or C Number!",Toast.LENGTH_LONG).show();
        }else if (TextUtils.isEmpty(chassisno)){
            Toast.makeText(this,"Please enter Chassis Number!",Toast.LENGTH_LONG).show();
        }else if (TextUtils.isEmpty(traileryear)){
            Toast.makeText(this,"Please enter Year of the Trailer!",Toast.LENGTH_LONG).show();
        }else if (TextUtils.isEmpty(tnumberaxles)){
            Toast.makeText(this,"Please enter number of axles on the trailer!",Toast.LENGTH_LONG).show();
        }else if (TextUtils.isEmpty(tbodytype)){
            Toast.makeText(this,"Please enter body type of the trailer!",Toast.LENGTH_LONG).show();
        }else if (TextUtils.isEmpty(tdateofi)){
            Toast.makeText(this,"Please enter Date of Inspection!",Toast.LENGTH_LONG).show();
        }else{
            String id = databaseReference.push().getKey();
            //Trailers trailers = new Trailers(cname,nicNumber,chassisno,traileryear,tnumberaxles,tbodytype,tdateofi);
            databaseReference.child(id).child("Company Name").setValue(cname);
            databaseReference.child(id).child("NiorC Number").setValue(nicNumber);
            databaseReference.child(id).child("Chassis Number").setValue(chassisno);
            databaseReference.child(id).child("Year of Trailer").setValue(traileryear);
            databaseReference.child(id).child("Number of Axles").setValue(tnumberaxles);
            databaseReference.child(id).child("Body Type of Trailer").setValue(tbodytype);
            databaseReference.child(id).child("Date of Inspection").setValue(tdateofi);
            Toast.makeText(this,"Trailer has been added", Toast.LENGTH_LONG).show();
            Cleartext();
        }
    }

    private void Cleartext(){
        CName.setText("");
        NIC.setText("");
        ChNO.setText("");
        TYear.setText("");
        TNAxles.setText("");
        TBody.setText("");
        TDate.setText("");
    }
}
