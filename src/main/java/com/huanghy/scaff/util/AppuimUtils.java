package com.huanghy.scaff.util;

import com.huanghy.scaff.exception.ExpectedCondition;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.util.List;


@Slf4j
public class AppuimUtils {
    /**
     * 显示等待，等待Id对应的控件出现time秒，一出现马上返回，time秒不出现也返回
     */
    private static AndroidDriver driver;

    public AppuimUtils(){

    }

    public AppuimUtils(AndroidDriver driver){
        this.driver = driver;
    }


    /**
     * @Author HuangHy
     * @Description 显式等待
     * @Date 11:27 2021/6/14
     * @Param [by, time]
     * @return io.appium.java_client.android.AndroidElement
     **/

    public static AndroidElement waitAuto(By by, int time) {
        try {
            return new AndroidDriverWait(driver, time)
                    .until(new ExpectedCondition<AndroidElement>() {
                        @Override
                        public AndroidElement apply(AndroidDriver androidDriver) {
                            List<AndroidElement> elements = androidDriver.findElements(by);
                            if (null == elements || elements.size() == 0){
                                return null;
                            }else {
                               return   elements.get(0);
                            }
                        }
                    });
        } catch (TimeoutException e) {
//            Assert.fail("查找元素超时!! " + time + " 秒之后还没找到元素 [" + by.toString() + "]", e);
            log.info("查找元素超时!! " + time + " 秒之后还没找到元素 [" + by.toString() + "]", e);
            return null;
        }
    }


    /**
     * @Author HuangHy
     * @Description  显式等待
     * @Date 11:27 2021/6/14
     * @Param [elementByXPath]
     * @return void
     **/

    public static void waitAuto(WebElement elementByXPath) {

        WebDriverWait webDriverWait = new WebDriverWait(driver, 50, 1);
        WebElement until = webDriverWait.until(event -> elementByXPath);
        until.click();
    }








}
