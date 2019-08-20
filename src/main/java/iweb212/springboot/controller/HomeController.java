package iweb212.springboot.controller;

import iweb212.springboot.model.Student;
import iweb212.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("title","在spring boot中生成的标题");
        model.addAttribute("names",
                Arrays.asList("张三","李四","王五"));
        return "home";
    }

    @RequestMapping("/student")
    public String studentInfo(Model model){
        model.addAttribute("title","学生信息");
        List<Student> students = studentService.findAllStudent();
        model.addAttribute("students",students);
        return "student";
    }
}
