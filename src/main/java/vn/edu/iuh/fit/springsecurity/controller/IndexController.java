package vn.edu.iuh.fit.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"/index"})
public class IndexController {


    @GetMapping
    public String abc() {
        return "No Authentication";
    }
}
