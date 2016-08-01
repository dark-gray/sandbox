package my.apps.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Routes {
    @RequestMapping({
            "/home",
            "/test",
            "/greeting"
    })
    public String index() {
        return "/index.html";
    }
}
