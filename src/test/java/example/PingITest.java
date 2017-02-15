package example;


import org.junit.Test;

import javax.ws.rs.core.Response;


public class PingITest extends ITestBase {
    @Test
    public void pingShouldReturn200() {
        Response response = getWebTarget(PingResource.class).request().buildGet().invoke();
        assert response.getStatus() == 200;
    }
}
