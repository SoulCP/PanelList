package com.wangzs.panellistlibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * @Description:
 * @Author:  wangzs
 * @Version:
 * @Email    wangzs@yuntongxun.com
 */
public class PanelListLayout extends RelativeLayout {

    private AbstractPanelListAdapter adapter;

    public AbstractPanelListAdapter getAdapter() {
        return adapter;
    }

    public void setAdapter(AbstractPanelListAdapter adapter) {
        this.adapter = adapter;
        adapter.initAdapter();
    }

    public PanelListLayout(Context context) {
        super(context);
    }

    public PanelListLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PanelListLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
