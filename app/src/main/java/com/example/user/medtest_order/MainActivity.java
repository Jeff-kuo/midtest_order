package com.example.user.medtest_order;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener() {



             public void onClick(View v) {
// TODO Auto-generated method stub
               Intent intent = new Intent();
                intent.setClass(MainActivity.this, order.class);
                 Bundle bundle = new Bundle();
                 bundle.putString("table", "1");
                 intent.putExtras(bundle);
                 startActivity(intent);
               MainActivity.this.finish();
          }
        });
        Button button2 = (Button) findViewById(R.id.button3);
        button2.setOnClickListener(new Button.OnClickListener() {



            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, order.class);
                Bundle bundle = new Bundle();
                bundle.putString("table", "2");
                intent.putExtras(bundle);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
        Button button3 = (Button) findViewById(R.id.button4);
        button3.setOnClickListener(new Button.OnClickListener() {



            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, order.class);
                Bundle bundle = new Bundle();
                bundle.putString("table", "3");
                intent.putExtras(bundle);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
        Button button4 = (Button) findViewById(R.id.button5);
        button4.setOnClickListener(new Button.OnClickListener() {



            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, order.class);
                Bundle bundle = new Bundle();
                bundle.putString("table", "4");
                intent.putExtras(bundle);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
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
                intent.setClass(MainActivity.this, menue.class);
                startActivity(intent);
                MainActivity.this.finish();
                break;
            case R.id.res:
                //Button button2 = (Button) findViewById(R.id.button);
                //button2.setText("餐廳");
                Intent intent1 = new Intent();
                intent1.setClass(MainActivity.this, MainActivity.class);
                startActivity(intent1);
                MainActivity.this.finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}