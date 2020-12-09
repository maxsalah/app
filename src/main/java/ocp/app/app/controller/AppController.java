package ocp.app.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class AppController {

    @GetMapping(path = "/hello")
    public String helloWorld() {
        return "Hello World";
    }

}


