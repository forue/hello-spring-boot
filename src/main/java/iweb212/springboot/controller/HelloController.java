package iweb212.springboot.controller;

import iweb212.springboot.model.Address;
import iweb212.springboot.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home(){
        return "这是由SpringBoot生成的";
    }

    @GetMapping("/json")
    public User user(){
        return new User(
                "张三",1L,
                new Address("长安街266号","丰台区","北京市"));
    }
}
