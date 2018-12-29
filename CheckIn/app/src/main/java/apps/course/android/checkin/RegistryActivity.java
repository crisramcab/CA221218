package apps.course.android.checkin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class RegistryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registry);

        Bundle b = getIntent().getExtras();

        Log.d("Pinte FROM", b.get("FROM").toString());
        Log.d("Pinte FROM", b.get("HORA").toString());

    }


}
