package com.mytests.springboot.webapp.defaults.thymeleaf.defaultthymeleaftest1;

import com.mytests.springboot.webapp.defaults.thymeleaf.Bean1;
import com.mytests.springboot.webapp.defaults.thymeleaf.Bean2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 8/14/2017.
 * Project: default-thymeleaf-test0
 * *******************************
 */
@Controller
public class MyController {

    @Autowired
    private Bean1 bean1;
    @Autowired
    private Bean2 bean2;


    @RequestMapping("/")
    public String Method(ModelMap model) {
        model.addAttribute("home_attr1", "test1");
        model.addAttribute("mytext", "ttt====&#13;&#10;=====ttt");
        model.addAttribute("home_attr2", "this is default thymeleaf configuration test with thymeleaf suffix and prefix set via application properties");
        model.addAttribute("bean1",bean1.getStr());
        model.addAttribute("bean2", bean2.getStr());
        return "home";
    }


}
