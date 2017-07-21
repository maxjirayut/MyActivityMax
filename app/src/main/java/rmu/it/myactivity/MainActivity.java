package rmu.it.myactivity;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvname;
    Button btdOK;
    EditText edtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // layout ที่แสดง
        setContentView(R.layout.activity_main);

        // กำหนนดตัวแปล

        tvname = (TextView) findViewById(R.id.tvname);
        btdOK = (Button) findViewById(R.id.btdOK);
        edtName = (EditText) findViewById(R.id.edtName);

        //กำหนด
        tvname.setText("จิรายุทธ");

        // คลิกปุ๋ม
        btdOK.setOnClickListener(   new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //เมื่อคลิกปู่มจะให้เกิดอะไรขึ้น
/*
                tvname.setText("good");
                tvname.setTextColor(Color.parseColor("#2b2ecf"));*/

                //ดึงค่า
                String name = edtName.getText().toString();

                // SHOW DIALOG
                Toast.makeText(getApplicationContext(), ""+name,Toast.LENGTH_LONG).show();


                Intent act2 = new Intent(getApplicationContext(), Main2Activity.class);
                // แนบข้อมูล
                act2.putExtra("KEY", name);

                startActivity(act2);



            }
        });



    } // main class





}// class
