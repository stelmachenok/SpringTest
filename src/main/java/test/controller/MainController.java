package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by y50-70 on 12.07.2017.
 */
@Controller
public class MainController {
    @RequestMapping (value = "/")
    public String home(){
        return "test";
    }
}
