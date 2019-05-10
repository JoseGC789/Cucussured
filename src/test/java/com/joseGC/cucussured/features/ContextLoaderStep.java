package com.joseGC.cucussured.features;

import cucumber.api.java.es.Dado;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ContextLoaderStep{

    @Dado("el sitio está encendido")
    public void theSiteIsRunning() {
        // Dummy method so cucumber will recognize this class as glue
        // and use its context configuration.
    }
}
