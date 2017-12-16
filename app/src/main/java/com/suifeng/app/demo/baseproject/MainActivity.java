package com.suifeng.app.demo.baseproject;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.suifeng.library.base.eventbus.EventCenter;
import com.suifeng.library.base.netstatus.NetUtils;
import com.suifeng.library.base.ui.activity.BaseAppCompatActivity;

import butterknife.BindView;

public class MainActivity extends BaseAppCompatActivity {

    @BindView(R.id.tv_title)
    TextView titleTv;

    @Override
    protected void getBundleExtras(Bundle extras) {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViewsAndEvents() {
        titleTv.setText("Hello World");
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected View getLoadingTargetView() {
        return null;
    }

    @Override
    protected void onNetworkConnected(NetUtils.NetType type) {

    }

    @Override
    protected void onNetworkDisConnected() {

    }

    @Override
    protected boolean isApplyStatusBarTranslucency() {
        return true;
    }

    @Override
    protected boolean isApplyStatusBarDarkFont() {
        return false;
    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }

    @Override
    protected boolean toggleOverridePendingTransition() {
        return false;
    }

    @Override
    protected TransitionMode getOverridePendingTransitionMode() {
        return null;
    }
}
