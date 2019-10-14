package com.jonzhou.cusomview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;

import com.jonzhou.cusomview.ElecData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import timber.log.Timber;

import static com.jonzhou.cusomview.ElecData.dataS;


public class LineView extends View {
    private final static String X_KEY = "Xpos";
    private final static String Y_KEY = "Ypos";

    private List<Map<String, Integer>> mListPoint = new ArrayList<Map<String, Integer>>();

    protected float stepx = 2;

    Paint mPaint = new Paint();

    public LineView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        // TODO Auto-generated constructor stub
    }

    public LineView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
    }

    public LineView(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
    }

    private float getPx(float data) {
        return data * 153.6f;
    }

    // 153.6
    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        super.onDraw(canvas);

        mPaint.setColor(Color.RED);
        mPaint.setAntiAlias(true);
        mPaint.setStrokeWidth(5f);
        mPaint.setStyle(Paint.Style.STROKE);

        Timber.i("onDraw mListPoint    " + mListPoint.size());
        Path path = new Path();
        path.moveTo(0, 153.6f * 4);
        for (int index = 0; index < dataS.length; index++) {  //每次调用 invalidate都重新从头绘制一次
            path.lineTo(index * stepx, getPx(dataS[index]));
        }
        canvas.drawPath(path, mPaint);
    }


}
