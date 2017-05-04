package example;


import org.junit.Test;

import javax.ws.rs.core.Response;


public class PingITest extends ITestBase {
    @Test
    public void pingShouldReturn200() {
        Response response = getWebTarget(PingResource.class).request().buildGet().invoke();
        assert response.getStatus() == 200;
    }

    @Test
    public void pingShouldReturnPlainText() {
        Response response = getWebTarget(PingResource.class).request().buildGet().invoke();
        assert "text/plain".equals(response.getMediaType().toString());
    }

    @Test
    public void pingShouldReturnOk() {
        Response response = getWebTarget(PingResource.class).request().buildGet().invoke();
        assert "ok".equals(response.readEntity(String.class));
    }
}
