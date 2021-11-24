package com.company.bpmntester;

import com.haulmont.cuba.testsupport.TestContainer;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.util.ArrayList;
import java.util.Arrays;

public class BpmntesterTestContainer extends TestContainer {

    public BpmntesterTestContainer() {
        super();
        //noinspection ArraysAsListWithZeroOrOneArgument
        appComponents = Arrays.asList(
                "com.haulmont.cuba",
                "com.haulmont.addon.bproc");
        appPropertiesFiles = Arrays.asList(
                // List the files defined in your web.xml
                // in appPropertiesConfig context parameter of the core module
                "com/company/bpmntester/app.properties",
                // Add this file which is located in CUBA and defines some properties
                // specifically for test environment. You can replace it with your own
                // or add another one in the end.
                "com/company/bpmntester/test-app.properties");
        autoConfigureDataSource();
    }

    

    public static class Common extends BpmntesterTestContainer {

        public static final BpmntesterTestContainer.Common INSTANCE = new BpmntesterTestContainer.Common();

        private static volatile boolean initialized;

        private Common() {
        }

        @Override
        public void beforeAll(ExtensionContext extensionContext) throws Exception {
            if (!initialized) {
                super.beforeAll(extensionContext);
                initialized = true;
            }
            setupContext();
        }
        

        @SuppressWarnings("RedundantThrows")
        @Override
        public void afterAll(ExtensionContext extensionContext) throws Exception {
            cleanupContext();
            // never stops - do not call super
        }
        
    }
}