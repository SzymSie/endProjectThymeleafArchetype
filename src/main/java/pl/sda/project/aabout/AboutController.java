package pl.sda.project.aabout;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;


@Controller
public class AboutController {

    @RequestMapping("/about")
    public String welcome(Map<String, Object> model) {
        return "aabout";
    }
}
