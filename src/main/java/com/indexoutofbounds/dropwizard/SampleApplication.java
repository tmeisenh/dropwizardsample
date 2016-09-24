package com.indexoutofbounds.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import javassist.tools.reflect.Sample;

public class SampleApplication extends Application<SampleConfiguration> {

    public static void main(String[] args) throws Exception {
        new SampleApplication().run(args);
    }

    @Override
    public void run(SampleConfiguration configuration, Environment environment) throws Exception {
        SampleApi service = new SampleApi(configuration.getVersion());
        environment.healthChecks().register("SampleHealthCheck", new SampleHealthCheck());
        environment.jersey().register(service);
    }
}
