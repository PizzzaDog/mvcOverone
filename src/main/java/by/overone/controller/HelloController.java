package by.overone.controller;

import by.overone.entity.MyUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/check")
    public String check(Model model) {
        MyUser user = new MyUser();
        user.setName("Steve");
        model.addAttribute("user", user);
        return "hello";
    }
}
