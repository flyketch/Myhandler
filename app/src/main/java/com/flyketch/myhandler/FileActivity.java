package com.flyketch.myhandler;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;

import cn.bmob.v3.datatype.BmobFile;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UploadFileListener;

public class FileActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnUpload, btnDownload, btnSave;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file);
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
        //初始化控件.
        initView();
        btnUpload.setOnClickListener(this);
        btnDownload.setOnClickListener(this);
        btnSave.setOnClickListener(this);
    }

    private void initView() {
        btnUpload = (Button) this.findViewById(R.id.btn_upload);
        btnDownload = (Button) this.findViewById(R.id.btn_download);
        btnSave = (Button) this.findViewById(R.id.btn_save);
        context = FileActivity.this;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_upload:
                upLoad();
                break;
            case R.id.btn_download:
                Toast.makeText(context, "there is nothing", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_save:
                Toast.makeText(context, "there is nothing", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void upLoad(){
        /*String path = "sdcard/i.png";
        System.out.println(path);
        final BmobFile file = new BmobFile(new File(path));
        file.uploadblock(context, new UploadFileListener() {
            @Override
            public void onSuccess() {
                UserObeject user = new UserObeject();
                user.setName("flying");
                user.setAge(23);
                user.setIcon(file);
                user.save(context, new SaveListener() {
                    @Override
                    public void onSuccess() {
                        Toast.makeText(context, "success", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(int i, String s) {
                        Toast.makeText(context, "failure"+s, Toast.LENGTH_SHORT).show();
                    }
                });
            }

            @Override
            public void onFailure(int i, String s) {
                Toast.makeText(context, "one failure"+s, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onProgress(Integer value) {
                System.out.println(value);
            }
        });*/

        /*//UserObeject user = new UserObeject();
        //user.setName("flying");
        //user.setAge(23);
        //user.setIcon(file);
        user.save(context, new SaveListener() {
            @Override
            public void onSuccess() {
                Toast.makeText(context, "success", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(int i, String s) {
                Toast.makeText(context, "failure"+s, Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}
