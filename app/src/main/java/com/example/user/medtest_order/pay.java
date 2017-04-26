package com.example.user.medtest_order;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class pay extends AppCompatActivity {
    int count=0,cal=0;
    String table;
    TextView tcount;
    TextView tcal;
    TextView tab ;
    TextView su;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pay);
        Bundle bundle = getIntent().getExtras();
        count=bundle.getInt("count");
        cal=bundle.getInt("cal");
         tcount=(TextView) findViewById(R.id.ca);
        tcount.setText(String.valueOf(count));
         tcal=(TextView) findViewById(R.id.cal);
        tcal.setText(String.valueOf(cal));
        tab=(TextView)findViewById(R.id.table);
        table=bundle.getString("table");
        tab.setText("第"+table+"桌清單");
        su=(TextView)findViewById(R.id.textView3);
        su.setText("建議:  吃了"+cal+"卡的食物，需要運動"+(cal*0.068188)+"分鐘");

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()) {
            case R.id.menu:
                //Button button1 = (Button) findViewById(R.id.button);
                //button1.setText("菜單");
                Intent intent = new Intent();
                intent.setClass(pay.this, menue.class);
                startActivity(intent);
               pay.this.finish();
                break;
            case R.id.res:
                //Button button2 = (Button) findViewById(R.id.button);
                //button2.setText("餐廳");
                Intent intent1 = new Intent();
                intent1.setClass(pay.this, MainActivity.class);
                startActivity(intent1);
                pay.this.finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}