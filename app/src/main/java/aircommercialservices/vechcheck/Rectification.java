package aircommercialservices.vechcheck;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class Rectification extends AppCompatActivity {

    TableLayout t1;
    String feature, defectdescription, radiochoice;
    TextView info, radiobtnsTV;
    int checked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectification);


        //pulling info from the defect activity
        feature = getIntent().getStringExtra("Feature:");
        defectdescription = getIntent().getStringExtra("Defect description:");
        checked = getIntent().getIntExtra("Defect rank",checked);

        info = findViewById(R.id.ddd);

        radiobtnsTV = findViewById(R.id.radiobtnstv);
        info.setText(feature+'\n'+ defectdescription+'\n'+ checked);


        TableLayout t1 = findViewById(R.id.table);
        TableRow tr = new TableRow(this);

        //TODO SIGNIUTRE
    }
}
