package com.happykrafts.broadcastdemo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTvTrigger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvTrigger = findViewById(R.id.trigger);
        mTvTrigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //This is to trigger the Broad cast App from other app.
                Intent intent= new Intent();
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                intent.setAction("my.custom.action");
                sendBroadcast(intent);
            }
        });
    }
}
