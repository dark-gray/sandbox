package my.apps.sandbox.mock;

import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by a.morozov on 29.07.2016.
 */
@Path("/d1be6933-2dce-4713-847e-40d9db312187")
@RestController
public class CxfService {
    @GET
    public String ret() {
        return "ret";
    }
}
