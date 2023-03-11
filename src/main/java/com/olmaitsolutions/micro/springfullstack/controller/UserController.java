package com.olmaitsolutions.micro.springfullstack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: SpringFullStack
 * @Author: Temesgen D.
 * @Date: 3/11/23
 */

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @GetMapping("/")
    public String getUser() {
        return "User";
    }
}
