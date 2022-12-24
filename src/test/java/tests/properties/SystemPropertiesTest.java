package tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTest {
    @Test
    void someTest() {
        String value = System.getProperty("value", "default_value");
        System.out.println(value);
    }

    @Test
    void someTest2() {
        System.setProperty("value", "Hello");
        String value = System.getProperty("value", "default_value");
        System.out.println(value);
    }

    @Test
    @Tag("properties")
    void someTest3() {
        String browser = System.getProperty("browser", "chrome");
        String version = System.getProperty("version", "92");
        String browserSize = System.getProperty("browserSize", "1920x1080");
        System.out.println(browser);
        System.out.println(version);
        System.out.println(browserSize);

        // gradle clean properties_tests -Dbrowser=opera
    }
}
