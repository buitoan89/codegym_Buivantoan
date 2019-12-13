package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {
//
@RequestMapping(value = "/method0", method = RequestMethod.GET)
public String method0() {
    return "method0";
}

    @RequestMapping(value = {"/method1", "/method1/one", "/method1/two"})
    public String method1() {
        return "method1";
    }

    @RequestMapping(value = "/method3", method = RequestMethod.POST)
    public String method3() {
        return "method3";
    }


}
