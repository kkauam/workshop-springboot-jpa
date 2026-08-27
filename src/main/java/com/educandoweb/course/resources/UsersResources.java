package com.educandoweb.course.resources;

import com.educandoweb.course.entity.Users;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UsersResources {


    @GetMapping
    public ResponseEntity<Users> findALL() {
        Users user = new Users(1L, "Maria", "Maria@gmail.com", "123456", "123456789");
        return ResponseEntity.ok().body(user);
    }
}
