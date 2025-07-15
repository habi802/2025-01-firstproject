package com.green.firstproject.hi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class hiController {

    @GetMapping
    public String hi() {
        return "h1";
    }
}
