package wayne.me.testapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "Great!I'm a apk which not installed!", Toast.LENGTH_LONG).show();
    }
}
