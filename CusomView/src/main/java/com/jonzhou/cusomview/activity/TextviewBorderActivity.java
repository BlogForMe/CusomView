package com.jonzhou.cusomview.activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.jonzhou.cusomview.R;
import com.jonzhou.cusomview.view.BorderTextView;

/**
 * 圆角矩形 不同颜色的
 */
public class TextviewBorderActivity extends AppCompatActivity {

    private BorderTextView btvRect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textview_border);
        btvRect = findViewById(R.id.btv_rect);
    }

    public void modifyColor(View view){
        btvRect.setContentColor(R.color.colorPrimaryDark);
    }
}
