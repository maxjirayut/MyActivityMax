package rmu.it.myactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvShow = (TextView) findViewById(R.id.tvShow);

        // รับค่า
        String name = getIntent().getExtras().getString("KEY");
        tvShow.setText(name);


    }
}
