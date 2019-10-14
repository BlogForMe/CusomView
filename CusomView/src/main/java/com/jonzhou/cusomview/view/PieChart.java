package com.jonzhou.cusomview.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

import com.jonzhou.cusomview.R;

public class PieChart extends View {

    private final int mTextPos;

    public PieChart(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.PieChart,
                0, 0);
        try {
            boolean mShowText = a.getBoolean(R.styleable.PieChart_showText, false);
            mTextPos = a.getInteger(R.styleable.PieChart_lablePosition, 0);
        } finally {
            a.recycle();
        }
    }

    private boolean mShowText;

    public void setShowText(boolean showText) {
        mShowText = showText;
        invalidate();
        requestLayout();
    }

    public boolean isShowTest() {
        return mShowText;
    }

}
