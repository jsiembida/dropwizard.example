package example;


import io.dropwizard.setup.Environment;


public class Application extends io.dropwizard.Application<example.Configuration> {
    public static void main(String[] args) throws Exception {
        new Application().run(args);
    }

    @Override public void run(example.Configuration configuration, Environment environment) {
        environment.jersey().register(new PingResource());
        environment.jersey().register(new EchoResource());
    }
}
