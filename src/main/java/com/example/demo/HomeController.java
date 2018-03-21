/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author amp
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/2")
    public String page2() {
        return "page2";
    }

    @RequestMapping("/3")
    public String page3() {
        return "page3";
    }
}
