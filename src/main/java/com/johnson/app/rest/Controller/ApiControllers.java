package com.johnson.app.rest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiControllers {

    // API created
    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome";
    }

}
