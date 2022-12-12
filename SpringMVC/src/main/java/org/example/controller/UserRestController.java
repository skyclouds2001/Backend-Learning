package org.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserRestController {

    @GetMapping("/{id}")
    public String getById(@PathVariable String id) {
        System.out.println("user get ..." + id);
        return "{'id': 0}";
    }

    @GetMapping
    public String getAll() {
        System.out.println("user get ...");
        return "{'id': 0}";
    }

    @PostMapping
    public String save() {
        System.out.println("user save ...");
        return "{'id': 0}";
    }

    @PutMapping
    public String update() {
        System.out.println("user update ...");
        return "{'id': 0}";
    }

    @DeleteMapping
    public String delete() {
        System.out.println("user delete ...");
        return "{'id': 0}";
    }

}
