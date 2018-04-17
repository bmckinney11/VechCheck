package aircommercialservices.vechcheck;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.WindowManager;

import static aircommercialservices.vechcheck.R.layout.activity_information;

public class Information extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_information);

        //changing the display to popup
        DisplayMetrics infodm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(infodm);

        int width = infodm.widthPixels;
        int height = infodm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.7));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y = -20;

        getWindow().setAttributes(params);
    }
}
