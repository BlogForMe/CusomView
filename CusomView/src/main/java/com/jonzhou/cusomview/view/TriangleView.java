package com.jonzhou.cusomview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import timber.log.Timber;

public class TriangleView  extends View {

    private  Paint mPaint;

    public TriangleView(Context context) {
        this(context,null);
    }

    public TriangleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStyle(Paint.Style.FILL);
        Timber.i("TriangleView");
    }

    @Override
    protected void onDraw(Canvas canvas) {
//
        Timber.i("onDraw");
        Path path = new Path();
        int mWidth = getWidth();
        path.lineTo(mWidth,0);
        path.lineTo(mWidth,getHeight());
        path.close();
//        canvas.drawColor(mColor);
        canvas.drawPath(path,mPaint);
//        super.onDraw(canvas);
    }

    private int mColor;
    public void setTriangleColor(int newColor){
//        mColor = newColor;
        mPaint.setColor(newColor);
        invalidate();
    }
}
