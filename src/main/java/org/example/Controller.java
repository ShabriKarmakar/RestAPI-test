package org.example;

import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping("/saveList")
    public List<Object> saveList(@RequestBody List<Object> objectList) {
        System.out.println("Test post call");
        return objectList;
    }
}
