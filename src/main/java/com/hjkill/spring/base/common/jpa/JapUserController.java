package com.hjkill.spring.base.common.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class JapUserController {
    @Autowired
    private JpaUserService jpaUserService;

    @PostMapping("/signup")
    public JpaUser signup(@RequestBody JpaUser jpaUser){
        return jpaUserService.signup(jpaUser);
    }
}
