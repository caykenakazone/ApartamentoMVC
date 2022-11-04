package com.apartamento.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
