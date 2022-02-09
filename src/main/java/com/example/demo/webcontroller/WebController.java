package com.example.demo.webcontroller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WebController {

    @GetMapping("/")
    public String main(){
        System.out.println("index");
        return "index";
    }
    @GetMapping("/index")
    public String main2(){
        System.out.println("index2");
        return "index2";
    }
}
