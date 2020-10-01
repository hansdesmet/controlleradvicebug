package com.example.controlleradvicebug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class ControlleradvicebugApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControlleradvicebugApplication.class, args);
    }

}

@Controller
@RequestMapping("/")
class IndexController {
    @GetMapping
    public ModelAndView get() {
        return new ModelAndView("index", "number1", 1);
    }
}

@ControllerAdvice
class MyAdvice {
    @ModelAttribute
    public void andAlsoNumber2(Model model) {
        model.addAttribute("number2", 2);
    }
}
