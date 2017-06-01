package com.shyz.downloadutil;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.zxly.o2o.o2o_user.R;

public abstract class BaseFragmentActivity extends FragmentActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	
		setContentView(getContentViewId());
		initViewAndData();
	}
	@Override
	public void onBackPressed() {
		super.onBackPressed();
		finish();
	}

	/**
	 * 
	 * @return 返回xml id
	 */
	public abstract int getContentViewId();
	/**
	 * 实例化组件和数据
	 */
	public abstract void initViewAndData();
	
	/**
	 * 简化findviewbyid转型
	 * @param resId
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T extends View> T obtainView(int resId){
        View v = findViewById(resId);          
        return (T)v;
	}
	
	/**
	 * 按返回键执行的方法 
	 */
	public void OnBack(){
		 onBackPressed();
	}
	/**
	 * 设置标题栏返回文字和事件
	 * @param strRes
	 */
	public void setBackTitle(int strRes){
		TextView textview = obtainView(R.id.tv_back);
		if(textview!=null){
			textview.setText(strRes);
		    textview.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					OnBack();
				
				}
			});
		}
	}
}
