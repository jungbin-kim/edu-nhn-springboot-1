package com.nhn.edu.springboot.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome(@RequestParam("name") String name, // RequestParam 의 required 기본값은 true. request 시, 안넣면 에러 발생
                          Model model) {
        // model에 freemarker에서 사용할 변수들에 값을 넣어준다.
        model.addAttribute("name", name);
        model.addAttribute("name2", name + name);
        return "welcome";
    }

}
