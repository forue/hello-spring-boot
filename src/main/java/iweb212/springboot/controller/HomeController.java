package iweb212.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("title","在spring boot中生成的标题");
        model.addAttribute("names",
                Arrays.asList("张三","李四","王五"));
        return "home";

    }
}
