package com.example.user.medtest_order;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;


public class menue extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menue);
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
                intent.setClass(menue.this, menue.class);
                startActivity(intent);
                menue.this.finish();
                break;
            case R.id.res:
                //Button button2 = (Button) findViewById(R.id.button);
                //button2.setText("餐廳");
                Intent intent1 = new Intent();
                intent1.setClass(menue.this, MainActivity.class);
                startActivity(intent1);
                menue.this.finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}