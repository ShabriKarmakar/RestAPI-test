package org.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping("/get")
    public String getCall() {
        System.out.println("Test");
        return "Fetched value";
    }

    @PostMapping("/save")
    public Object saveCall(@RequestBody Object testObject) {
        System.out.println("Test post call");
        return testObject;
    }
}
