package com.weatherApp.app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class WeatherController {



//    @RequestMapping("/")
//    public String home(HttpServletRequest req, HttpServletResponse res) {
//        HttpSession session = req.getSession();
//        String name = req.getParameter("name");
//        System.out.println("hi" + name);
//        session.setAttribute("name", name);
//        return "home";
//    }
    @GetMapping("/")
    public ResponseEntity<String> retrieveHello() {

        return new ResponseEntity<>("My God, this was dry and abstract! ", HttpStatus.OK);

    }
}
