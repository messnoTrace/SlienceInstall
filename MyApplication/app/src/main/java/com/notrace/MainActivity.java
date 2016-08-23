package com.notrace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.notrace.install.IInstallerCallback;
import com.notrace.install.PM;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_install).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                PM.getInstance().installPackage("/data/local/tmp/zr.apk", new IInstallerCallback() {
                    @Override
                    public void finishInstall(int var1) {

                    }
                });
            }
        });
    }
}
