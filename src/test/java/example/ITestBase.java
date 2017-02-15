package example;


import io.dropwizard.testing.junit.DropwizardAppRule;
import org.glassfish.jersey.uri.internal.JerseyUriBuilder;
import org.junit.ClassRule;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.UriBuilder;


public class ITestBase {
    @ClassRule
    public static final DropwizardAppRule<Configuration> APP = new DropwizardAppRule<>(Application.class, "target/classes/configuration.yaml");

    protected UriBuilder getUriBuilder(Class klass) {
        return new JerseyUriBuilder().scheme("http").host("localhost").port(APP.getLocalPort()).path(klass);
    }

    protected WebTarget getWebTarget(Class klass) {
        return ClientBuilder.newClient().target(getUriBuilder(klass));
    }
}
