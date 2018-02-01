package com.allfinish.method.second;

import com.allfinish.R;
import com.allfinish.base.BaseActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FourthStep extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fourth_step);
		initView();
		mStackManager.getStackManager().pushActivity(this);
	}

	private void initView() {
		Button btn_finish = (Button) findViewById(R.id.btn_finish);
		btn_finish.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mStackManager.getStackManager().popAllActivitys();
			}
		});
	}
}
