package com.example.tutorials;

import com.example.tutorials.resources.DropwizardTutorialResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropwizardTutorialApplication extends Application<DropwizardTutorialConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropwizardTutorialApplication().run(args);
    }

    @Override
    public String getName() {
        return "DropwizardTutorial";
    }

    @Override
    public void initialize(final Bootstrap<DropwizardTutorialConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DropwizardTutorialConfiguration configuration,
                    final Environment environment) {
        final DropwizardTutorialResource resource = new DropwizardTutorialResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );
        environment.jersey().register(resource);
    }

}
