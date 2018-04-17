package com.demo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.demo.tools.view.RiseNumberTextView;

/**
 * 数字动画
 * 
 * @author zengtao 2015年7月17日 上午11:48:54 
 *
 */
public class MainActivity extends Activity {
	private RiseNumberTextView number1, number2, number3, number4, number5;
	private Button start;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		initView();
	}

	private void initView() {
		number1 = (RiseNumberTextView) findViewById(R.id.number1);
		number2 = (RiseNumberTextView) findViewById(R.id.number2);
		number3 = (RiseNumberTextView) findViewById(R.id.number3);
		number4 = (RiseNumberTextView) findViewById(R.id.number4);
		number5 = (RiseNumberTextView) findViewById(R.id.number5);
		start = (Button) findViewById(R.id.start);

		start.setOnClickListener(listener);
	}

	OnClickListener listener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			if (v == start) {
				initData();
			}
		}
	};

	private void initData() {
		number1.withNumber(12.3f).start();
		number2.withNumber(16.3f).start();
		number3.withNumber(10.3f).start();
		number4.withNumber(18.3f).start();
		number5.withNumber(17.3f).start();
	}
}
