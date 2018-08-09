package practice.demo.driver.util;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class ExtensionPoint implements AfterEachCallback {

    public ExtensionPoint() {
    }

    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        extensionContext.getTestInstance()
                        .map(o -> (BaseTest) o)
                        .ifPresent(baseTest -> baseTest.quit());
    }

}
