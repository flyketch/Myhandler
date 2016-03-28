package com.flyketch.myhandler;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HandlerActivity extends AppCompatActivity {

    private TextView tvShow;
    private ImageView imageView;
    private Handler handler = new Handler();

    /*private Handler handler01 = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            tvShow.setText("not running"+msg.arg1);
        }
    };*/


    private int images[] = {R.drawable.i, R.drawable.i_v, R.drawable.macho, R.drawable.sad};
    private int index;
    private MyRunnable myRunnable = new MyRunnable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
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
        imageView = (ImageView) findViewById(R.id.iv_show);
        tvShow = (TextView) findViewById(R.id.tv_show);
        /*new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    Message message = new Message();
                    message.arg1 = 100;

                    handler01.sendMessage(message);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();*/


        handler.postDelayed(myRunnable, 1000);
    }

    class MyRunnable implements Runnable {
        @Override
        public void run() {
            index++;
            index = index % 4;
            imageView.setImageResource(images[index]);
            handler.postDelayed(myRunnable, 1000);
        }
    }

}
