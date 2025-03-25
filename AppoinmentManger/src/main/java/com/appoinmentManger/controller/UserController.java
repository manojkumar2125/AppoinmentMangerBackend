package com.appoinmentManger.controller;

import com.appoinmentManger.entity.UserDTO;
import com.appoinmentManger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

   private UserService userService;

   @Autowired
   public UserController(UserService userService) {
       this.userService = userService;
   }

    @GetMapping
    public List<UserDTO> getAllUsers() {

        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable("id") Long id) {

       UserDTO userDTO = userService.getUserById(id);
       if(userDTO == null) {
           return ResponseEntity.notFound().build();
       }
       return ResponseEntity.ok(userDTO);
    }

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO user) {
        return userService.createUser(user);
    }
}