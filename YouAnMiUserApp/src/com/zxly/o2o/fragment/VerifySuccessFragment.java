package com.zxly.o2o.fragment;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.zxly.o2o.activity.VerifyMobileAct;
import com.zxly.o2o.o2o_user.R;
import com.zxly.o2o.util.ViewUtils;

public class VerifySuccessFragment extends BaseFragment implements OnClickListener {

    @Override
    protected void initView(Bundle bundle) {
        initView();
    }

    @Override
    protected void initView() {
        findViewById(R.id.btn_back).setOnClickListener(this);
        ViewUtils.setText(findViewById(R.id.txt_title), "设置手机号码");
        findViewById(R.id.btn_finish)
                .setOnClickListener(this);
    }

    @Override
    protected int layoutId() {
        return R.layout.win_verify_success;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_back:
                ((VerifyMobileAct)getActivity()).setPageShow(0);
                break;
            case R.id.btn_finish:
                ((VerifyMobileAct)getActivity()).setPageShow(0);
                break;
        }
    }

}
