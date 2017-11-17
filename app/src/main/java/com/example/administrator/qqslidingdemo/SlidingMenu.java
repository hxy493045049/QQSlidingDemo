package com.example.administrator.qqslidingdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/**
 * Created by Administrator on 2017/11/17.
 */

public class SlidingMenu extends HorizontalScrollView {
    public SlidingMenu(Context context) {
        super(context);
    }

    public SlidingMenu(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SlidingMenu(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SlidingMenu(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

}
