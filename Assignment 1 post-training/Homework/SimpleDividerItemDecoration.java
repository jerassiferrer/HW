package com.mobileapps.jera.recyclerviewcustom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by jera on 6/1/16.
 */
public class SimpleDividerItemDecoration extends RecyclerView.ItemDecoration {
    private Drawable mDivider;

    public SimpleDividerItemDecoration(Context context) {
        mDivider = context.getResources().getDrawable(R.drawable.line_divider);
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        int left = parent.getPaddingLeft();
        int right = parent.getWidth() - parent.getPaddingRight();

        int childCount = parent.getChildCount();

        View child0 = parent.getChildAt(0);
        RecyclerView.LayoutParams params0 = (RecyclerView.LayoutParams) child0.getLayoutParams();
        int top0 = child0.getBottom() + params0.topMargin;
        int bottom0 = top0 + mDivider.getIntrinsicHeight();
        mDivider.setBounds(left, top0, right, bottom0);
        mDivider.draw(c);

        for (int i = 0; i < childCount; i++) {
            View child = parent.getChildAt(i);


            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();

            int top = child.getBottom() + params.bottomMargin;
            int bottom = top + mDivider.getIntrinsicHeight();

            mDivider.setBounds(left, top, right, bottom);
            mDivider.draw(c);
        }
    }




}
