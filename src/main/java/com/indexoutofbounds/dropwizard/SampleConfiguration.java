package com.indexoutofbounds.dropwizard;

import io.dropwizard.Configuration;

public class SampleConfiguration extends Configuration {

    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
