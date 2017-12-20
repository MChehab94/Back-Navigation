package mchehab.com.backnavigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(e -> {
            button.setVisibility(View.GONE);
            FirstFragment firstFragment = new FirstFragment();
            Globals.addFragment(getSupportFragmentManager(), firstFragment, R.id.frameLayout);
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if(getSupportFragmentManager().getBackStackEntryCount() == 0){
            button.setVisibility(View.VISIBLE);
        }
    }
}