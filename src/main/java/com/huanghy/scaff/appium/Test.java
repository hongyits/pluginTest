package com.huanghy.scaff.appium;

import com.huanghy.scaff.domain.BaseAppium;
import com.huanghy.scaff.util.AppuimUtils;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

@Slf4j
public class Test {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        BaseAppium baseAppium = new BaseAppium();
        baseAppium.beforeSuite();
        AndroidDriver<AndroidElement> driver = baseAppium.driver;
        AppuimUtils appuimUtils = new AppuimUtils(driver);

//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("deviceName", "127.0.0.1:62001");
//        capabilities.setCapability("automationName", "uiautomator2");
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("platformVersion", "7.1.2");
//        capabilities.setCapability("appPackage", "com.sina.weibo");
//        capabilities.setCapability("appActivity", ".MainTabActivity");//要打开的app应用
//        capabilities.setCapability("noReset", "true");//设置每次运行时不需要重新安装APP
////        capabilities.setCapability("'unicodeKeyboard", "true");//是使用unicode编码方式发送字符串
////        capabilities.setCapability("'resetKeyboard'", "true");//隐藏键盘
//        capabilities.setCapability("'autoLaunch'", "False");//这样就不会自启动app了

//        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

//        AppuimUtils appuimUtils = new AppuimUtils(driver);

        try {
            yinshi(driver, 5);
            //自动发表
//            driver.findElement(By.id("com.sina.weibo:id/titleSave")).click();
//            driver.findElement(By.id("com.sina.weibo:id/tipview")).click();
//            driver.findElement(By.id("com.sina.weibo:id/edit_view")).sendKeys("test" + UUID.randomUUID().toString());
//            driver.findElement(By.id("com.sina.weibo:id/titleSave")).click();
            adDel(driver);
            // “我” ->粉丝
            appuimUtils.waitAuto(By.xpath("//android.widget.FrameLayout[@content-desc=\"我\"]"), 5).click();
            appuimUtils.waitAuto(By.xpath("//*[@text='粉丝']"), 10).click();
            appuimUtils.waitAuto(By.xpath("//*[@text='全部粉丝']"), 10).click();
            //获取所有粉丝
            baseAppium.swipeToDown(1,2);


//            List<AndroidElement> fans = driver.findElementsByXPath("//*[@resource-id='com.sina.weibo:id/lv_content']/android.widget.RelativeLayout");
//            for (int i = 1; i < fans.size(); i++) {
//                try {
//                    appuimUtils.waitAuto(By.xpath("//*[@resource-id='com.sina.weibo:id/lv_content']/android.widget.RelativeLayout[" + (i + 1) + "]"), 5).click();
//                    AndroidElement androidElement = appuimUtils.waitAuto(By.xpath("//*[@text='聊天']"), 10);
//                    if (null == androidElement) {
//                        continue;
//                    } else {
//                        androidElement.click();
//                    }
//                    appuimUtils.waitAuto(By.id("com.sina.weibo:id/et_message"), 5).sendKeys("test" + UUID.randomUUID().toString());
//                    //点击发送
////                yinshiAndClick(driver, 5, driver.findElementById("com.sina.weibo:id/bn_send"));
//                    driver.pressKeyCode(4);
//                    Thread.sleep(1000);
//                    driver.pressKeyCode(4);
//                } catch (Exception e) {
//                    log.info("错误咯错误咯");
//                    e.printStackTrace();
//                    driver.pressKeyCode(4);
//                } finally {
//                }
//            }


            while (1 == 1) {
                Thread.sleep(1000 * 20);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
            log.info("quit");
        }
    }


    //删除广告，不一定有
    public static void adDel(AndroidDriver driver) {
        try {
            List<AndroidElement> elementsByXPath = driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView");
            if (null != elementsByXPath && elementsByXPath.size() >= 1) {
                elementsByXPath.get(0).click();
            }

        } catch (Exception e) {
//            删除广告失败
            log.info("删除ad失败");
            e.printStackTrace();
        }


    }


    //隐式等待
    public static void yinshi(AndroidDriver driver, long secondTime) {
        driver.manage().timeouts().implicitlyWait(secondTime, TimeUnit.SECONDS);//
    }

    public static void yinshiAndClick(AndroidDriver driver, long secondTime, WebElement elementByXPath) {
        try {
            driver.manage().timeouts().implicitlyWait(secondTime, TimeUnit.SECONDS);//
            elementByXPath.click();
        } catch (Exception e) {
            log.info("yinshiClick失败");
            e.printStackTrace();
        }

    }


}
