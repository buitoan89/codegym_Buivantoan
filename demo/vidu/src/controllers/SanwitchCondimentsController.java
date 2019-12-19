package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
public class SanwitchCondimentsController<controllers> {
    @RequestMapping("/save")
    public String showCheckbox() {
        return "index";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
        public ModelAndView save(@RequestParam(required=false,name = "condiments") String []condiments) {
            String message="";
            ModelAndView modelAndView = new ModelAndView("result");
            if(condiments!=null){
                message="nhung gia vi kem theo voi sandwitch :" + Arrays.toString(condiments);
//                for (String condiment:condiments) {
//                    if(condiment!=null){
//                        message += condiment+" ,";
//                    }
//                }
            }
            else {
                message="khong co gia vi nao duoc chon";
            }
            modelAndView.addObject("result", message);
            return modelAndView;
        }
    }

