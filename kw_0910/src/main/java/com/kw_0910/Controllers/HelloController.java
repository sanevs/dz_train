package com.kw_0910.Controllers;

import com.kw_0910.Repositories.HelloRepository;
import com.kw_0910.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RestController
public class HelloController {
    private HelloRepository helloRepository;

    @Autowired
    public HelloController(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    @GetMapping("/Hello")
    public String Hello(
            @RequestParam(name="hi", required=false, defaultValue="World") String hi,
            Model model) {
        model.addAttribute("hi", hi);

        return  "Hello";
    }
    @RequestMapping("/all")
    public Iterable<Person> all(){
        return helloRepository.findAll();
    }
}
