package by.overone.controller;

import by.overone.entity.MyUser;
import by.overone.service.MyUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/hello")
@RequiredArgsConstructor
public class HelloController {
    
    private final MyUserService userService;

    @GetMapping
    public ModelAndView homePage(ModelAndView model) {
        model.setViewName("hello");
        return model;
    }

    @GetMapping("/user")
    public ModelAndView check(ModelAndView model, @RequestParam String name) {
        MyUser user = new MyUser();
        user.setName(name);
        model.addObject("user", userService.createUser(user));
        model.setViewName("user");
        return model;
    }

    @GetMapping("/userList")
    public ModelAndView userList(ModelAndView model) {
        List<MyUser> users = userService.getAllUsers();
        model.addObject("users", users);
        model.setViewName("userList");
        return model;
    }

}
