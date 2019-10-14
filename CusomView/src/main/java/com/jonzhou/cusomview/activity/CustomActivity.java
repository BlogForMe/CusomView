package com.jonzhou.cusomview.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.jonzhou.cusomview.view.CustomProgress;
import com.jonzhou.cusomview.view.SurfaceViewTemplate;

public class CustomActivity extends AppCompatActivity {

    private CustomProgress cp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_custom);

     /*   cp = findViewById(R.id.cp);

        Executors.newCachedThreadPool().execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Message message = handler.obtainMessage();
                    message.arg1 = i;
                    handler.sendMessage(message);
                }
            }
        });*/

//        intDrawView();

        setContentView(new SurfaceViewTemplate(this));
    }

//    private void intDrawView() {
//        DrawView mView = new DrawView(this, null);
//
//        setContentView(mView);
//    }
//
//    private Handler handler = new Handler() {
//        @Override
//        public void handleMessage(Message msg) {
//            super.handleMessage(msg);
//            cp.setProgress(msg.arg1);
//            if (msg.arg1 == 5) {
//                cp.setmTextColor(getResources().getColor(android.R.color.darker_gray));
//            }
//        }
//    };
}
