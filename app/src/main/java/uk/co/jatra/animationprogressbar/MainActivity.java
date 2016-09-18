package uk.co.jatra.animationprogressbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void spin(View view) {
        ((ViewAnimator)findViewById(R.id.container)).showNext();
//        view.setVisibility(View.INVISIBLE);
//        findViewById(R.id.spinnerframe).setVisibility(View.VISIBLE);
    }
}
