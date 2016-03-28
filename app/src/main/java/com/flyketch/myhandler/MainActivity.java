package com.flyketch.myhandler;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.fllyketch.sms.SmsActivity;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.listener.SaveListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnHandler, btnBmobEmail, btnBmobFile, btnSms;
    private Intent intent;
    private static final String APP_KEY = "80d93fbf7130bb3afe32eebb3a499464";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Bmob.initialize(this, APP_KEY);
        initView();

        btnHandler.setOnClickListener(this);
        btnBmobEmail.setOnClickListener(this);
        btnBmobFile.setOnClickListener(this);
        btnSms.setOnClickListener(this);
    }

    private void initView() {
        btnHandler = (Button) this.findViewById(R.id.btn_handler);
        btnBmobEmail = (Button) this.findViewById(R.id.btn_bmob_email);
        btnBmobFile = (Button) this.findViewById(R.id.btn_bmob_file);
        btnSms = (Button) this.findViewById(R.id.btn_sms);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_handler:
                intent = new Intent(MainActivity.this, HandlerActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_bmob_email:
                useEmail();
                break;
            case R.id.btn_bmob_file:
                intent = new Intent(MainActivity.this, FileActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_sms:
                intent = new Intent(MainActivity.this, SmsActivity.class);
                startActivity(intent);
                break;
        }
    }

    public void useEmail() {
        /*Flyketch flyketch = new Flyketch();
                // flyketch.setEmail("809852506@qq.com");
                flyketch.setUsername("abc");
                flyketch.setPassword("bcd");
                flyketch.setName("flyketch");
                flyketch.setAge(20);
                flyketch.signUp(MainActivity.this, new SaveListener() {
                    @Override
                    public void onSuccess() {
                        Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(int i, String s) {
                        Toast.makeText(MainActivity.this, "failure"+s, Toast.LENGTH_SHORT).show();
                    }
                });*/
        Company company = new Company();
        company.setUsername("k1");
        company.setPassword("k2a");
        company.setName("k3va");
        company.setSex("k4y");
        //company.setEmail("809852506@qq.com");
        company.signUp(MainActivity.this, new SaveListener() {
            @Override
            public void onSuccess() {
                Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(int i, String s) {
                Toast.makeText(MainActivity.this, "failure" + s, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
