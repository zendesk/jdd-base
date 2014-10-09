package com.getbase.tweetme;

import com.getbase.tweetme.resources.MessageResource;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by pawel on 07/10/14.
 */
public class TweetMeApplication extends Application<TweetMeConfiguration> {

    public static void main(String[] args) throws Exception {
        new TweetMeApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<TweetMeConfiguration> bootstrap) {
        bootstrap.addBundle(new AssetsBundle("/assets", "/app", "index.htm", "assets"));
    }

    @Override
    public void run(TweetMeConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new MessageResource());
    }
}
