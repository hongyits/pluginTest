package com.huanghy.scaff.domain;

import lombok.Data;

@Data
public class Builder {
    public String platformName = BaseAppium.platformName;
    String deviceName = BaseAppium.deviceName;
    String platformVersion = BaseAppium.platformVersion;
    String path = System.getProperty("user.dir") + "/src/main/java/apps/";
    String appPath = BaseAppium.appPath;
    String appPackage = BaseAppium.appPackage;
    String noReset = BaseAppium.noReset;
    String noSign = BaseAppium.noSign;
    String unicodeKeyboard = BaseAppium.unicodeKeyboard;
    String resetKeyboard = BaseAppium.resetKeyboard;
    String appActivity = BaseAppium.appActivity;
    String automationName = BaseAppium.automationName;



    public BaseAppium build() {
        return new BaseAppium(this);
    }


}
