package com.hahaeasy.easydropwizard;

import com.hahaeasy.easydropwizard.resources.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class EasyWebApplication extends Application<EasyWebConfiguration> {

    public static void main(final String[] args) throws Exception {
        new EasyWebApplication().run(args);
    }

    @Override
    public String getName() {
        return "EasyWeb";
    }

    @Override
    public void initialize(final Bootstrap<EasyWebConfiguration> bootstrap) {
        // TODO: application initialization


    }

    @Override
    public void run(final EasyWebConfiguration configuration,
                    final Environment environment) {

		environment.jersey().register(new HelloWorldResource());

    }

}
