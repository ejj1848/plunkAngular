package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Eric.Johnson on 6/30/2017.
 */
@Controller
public class MainController {

    @RequestMapping("/main")
    String main() {
        return ("main");
    }
}
