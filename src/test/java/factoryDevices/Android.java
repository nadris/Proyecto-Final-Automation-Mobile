package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Android implements IDevice{
    @Override
    public AppiumDriver create() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","MiA2");
        capabilities.setCapability("platformVersion","10");
        capabilities.setCapability("appPackage","com.vendetta.miinventario");
        capabilities.setCapability("appActivity","com.vendetta.miinventario.MainActivity");
        capabilities.setCapability("platformName","Android");
        /*
        EMULATOR CONFIG
        capabilities.setCapability("deviceName","emulator-5556");
        capabilities.setCapability("platformVersion","9");
        capabilities.setCapability("appPackage","com.vendetta.miinventario");
        capabilities.setCapability("appActivity","com.vendetta.miinventario.MainActivity");
        capabilities.setCapability("platformName","Android");*/
        AppiumDriver driver= null;
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;
    }
}