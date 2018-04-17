package com.demo.tools.view;

/**
 数字动画自定义
 *
 */
public interface RiseNumberBase {
	public void start();

	public RiseNumberTextView withNumber(float number);

	public RiseNumberTextView withNumber(float number, boolean flag);

	public RiseNumberTextView withNumber(int number);

	public RiseNumberTextView setDuration(long duration);

	public void setOnEnd(RiseNumberTextView.EndListener callback);
}
