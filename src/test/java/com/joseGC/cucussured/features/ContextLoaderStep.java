package com.joseGC.cucussured.features;

import cucumber.api.java.Before;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ContextLoaderStep{

    @Before
    public void theServiceIsRunningAndAbleToReceiveAndProcessRequests() {
        // Dummy method so cucumber will recognize this class as glue
        // and use its context configuration.
    }
}
