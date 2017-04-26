package com.example.user.medtest_order;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class order extends AppCompatActivity {
    TextView t;


    int count=0,cal=0;
    EditText e1;
    EditText e2;
    EditText e3;
    EditText e4;
    EditText e5;
    String es1;
    String es2;
    String es3;
    String es4;
    String es5;
    String table;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);
        e4=(EditText)findViewById(R.id.editText4);
        e5=(EditText)findViewById(R.id.editText5);

        button=(Button)findViewById(R.id.button2);


        Bundle bundle = getIntent().getExtras();
        table= bundle.getString("table");
        t=(TextView)findViewById(R.id.table);
        t.setText("第"+table+"桌");



        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
// TODO Auto-generated method stub


                es1=e1.getText().toString();
                es2=e2.getText().toString();
                es3=e3.getText().toString();
                es4=e4.getText().toString();
                es5=e5.getText().toString();
                if( !("".equals(es1.trim())))
                {
                    count+=Integer.parseInt(e1.getText().toString())*60;
                    cal+=Integer.parseInt(e1.getText().toString())*150;
                }
                if(  !("".equals(es2.trim())))
                {
                    count+=Integer.parseInt(e2.getText().toString())*50;
                    cal+=Integer.parseInt(e2.getText().toString())*100;
                }
                if( !("".equals(es3.trim())))
                {
                    count+=Integer.parseInt(e3.getText().toString())*50;
                    cal+=Integer.parseInt(e3.getText().toString())*120;
                }
                if(  !("".equals(es4.trim())))
                {
                    count+=Integer.parseInt(e4.getText().toString())*50;
                    cal+=Integer.parseInt(e4.getText().toString())*150;
                }

                if( !("".equals(es5.trim())))
                {
                    count+=Integer.parseInt(e5.getText().toString())*100;
                    cal+=Integer.parseInt(e5.getText().toString())*250;
                }
                //t1.setText(count);
                Intent intent = new Intent();
                intent.setClass(order.this, pay.class);
                Bundle bundle = new Bundle();
                bundle.putInt("count",count);
                bundle.putInt("cal",cal);
                bundle.putString("table",table);
                intent.putExtras(bundle);
                startActivity(intent);
                order.this.finish();

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
                intent.setClass(order.this, menue.class);
                startActivity(intent);
               order.this.finish();
                break;
            case R.id.res:
                //Button button2 = (Button) findViewById(R.id.button);
                //button2.setText("餐廳");
                Intent intent1 = new Intent();
                intent1.setClass(order.this, MainActivity.class);
                startActivity(intent1);
               order.this.finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
