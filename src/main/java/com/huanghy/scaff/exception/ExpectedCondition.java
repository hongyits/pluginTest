package com.huanghy.scaff.exception;

import io.appium.java_client.android.AndroidDriver;
import com.google.common.base.Function;


public interface ExpectedCondition<T> extends Function<AndroidDriver, T> {}
