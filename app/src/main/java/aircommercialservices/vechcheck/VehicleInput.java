package aircommercialservices.vechcheck;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.time.Year;

public class VehicleInput extends AppCompatActivity {

    EditText VCname;
    EditText Reg;
    EditText Vchassis;
    EditText VecYear;
    EditText VNAxles;
    EditText VBody;
    EditText VDate;
    Button VBegin;
    Button VehicleBack;
    FirebaseDatabase database;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_input);

        VBegin = (Button)findViewById(R.id.VBeginBtn);
        VCname = (EditText)findViewById(R.id.CompanyNameEditText);
        Reg = (EditText)findViewById(R.id.RegistrationEditText);
        Vchassis = (EditText)findViewById(R.id.ChassisNumberEditText);
        VecYear = (EditText)findViewById(R.id.YearofVehicleEditText);
        VNAxles = (EditText)findViewById(R.id.AxleNumbersEditText);
        VBody = (EditText)findViewById(R.id.BodyTypeEditText);
        VDate = (EditText)findViewById(R.id.dateOfInspectionEditText);
        database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference("Vehicles");

        //passing input to the VehicleInspection Activity
        VBegin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchVehicleActivityInfo();
                addVehicleArrayList();
            }
        });

        //navigate back to second activity
        VehicleBack = (Button)findViewById(R.id.VehicleBackButton);
        VehicleBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getApplicationContext(), secondactivity.class);
                startActivity(intent4);
            }
        });
    }

    private void launchVehicleActivityInfo(){
        String vcname = VCname.getText().toString();
        String reg = Reg.getText().toString();
        String chassis = Vchassis.getText().toString();
        String year = VecYear.getText().toString();
        String axles = VNAxles.getText().toString();
        String body = VBody.getText().toString();
        String date = VBegin.getText().toString();

        Intent intent2 = new Intent(VehicleInput.this, VehicleInspection.class);
        intent2.putExtra("Company name:", vcname);
        intent2.putExtra("Vehicle Registration:",reg);
        intent2.putExtra("Chassis Number:", chassis);
        intent2.putExtra("Year of Vehicle", year);
        intent2.putExtra("Number of Axles:", axles);
        intent2.putExtra("Body Type:", body);
        intent2.putExtra("Date of Inspection", date);
        startActivity(intent2);
    }

    private void addVehicleArrayList(){
        String vcname = VCname.getText().toString().trim();
        String reg = Reg.getText().toString().trim();
        String vchassisno = Vchassis.getText().toString().trim();
        String vyear = VecYear.getText().toString().trim();
        String vnumberaxles = VNAxles.getText().toString().trim();
        String vbodytype = VBody.getText().toString().trim();
        String vdateofi = VBegin.getText().toString().trim();

        if(TextUtils.isEmpty(vcname)){
            Toast.makeText(this,"Please enter Company Name!",Toast.LENGTH_LONG).show();
        }else if (TextUtils.isEmpty(reg)){
            Toast.makeText(this,"Please enter Vehicle Registration!",Toast.LENGTH_LONG).show();
        }else if (TextUtils.isEmpty(vchassisno)){
            Toast.makeText(this,"Please enter Chassis Number!",Toast.LENGTH_LONG).show();
        }else if (TextUtils.isEmpty(vyear)){
            Toast.makeText(this,"Please enter Year of the Vehicle!",Toast.LENGTH_LONG).show();
        }else if (TextUtils.isEmpty(vnumberaxles)){
            Toast.makeText(this,"Please enter number of axles on the vehicle!",Toast.LENGTH_LONG).show();
        }else if (TextUtils.isEmpty(vbodytype)){
            Toast.makeText(this,"Please enter body type!",Toast.LENGTH_LONG).show();
        }else if (TextUtils.isEmpty(vdateofi)){
            Toast.makeText(this,"Please enter Date of Inspection!",Toast.LENGTH_LONG).show();
        }else{
            String id = databaseReference.push().getKey();
            Vehicles vehicles = new Vehicles(vcname,reg,vchassisno,vyear,vnumberaxles,vbodytype,vdateofi);
            databaseReference.child(id).child("Company Name").setValue(vcname);
            databaseReference.child(id).child("Registration").setValue(reg);
            databaseReference.child(id).child("Chassis Number").setValue(vchassisno);
            databaseReference.child(id).child("Year of Vehicle").setValue(vyear);
            databaseReference.child(id).child("Number of Axles").setValue(vnumberaxles);
            databaseReference.child(id).child("Body Type").setValue(vbodytype);
            databaseReference.child(id).child("Date of Inspection").setValue(vdateofi);
            Toast.makeText(this,"Vehicle has been added", Toast.LENGTH_LONG).show();
            Cleartext();
        }
    }

    private void Cleartext(){
        VCname.setText("");
        Reg.setText("");
        Vchassis.setText("");
        VecYear.setText("");
        VNAxles.setText("");
        VBody.setText("");
        VDate.setText("");
    }
}
