package com.appoinmentManger.controller;

import com.appoinmentManger.Util;
import com.appoinmentManger.entity.Agent;
import com.appoinmentManger.response.AgentDTO;
import com.appoinmentManger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/bookings")
public class UserController {

    private UserService userService;
    private Util util;

    @Autowired
    public UserController(UserService userService, Util util) {
        this.userService = userService;
        this.util = util;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Agent>> getAllUsers() {


        List<Agent> users = userService.getAllUser();
        if (users.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return ResponseEntity.ok(users);
    }
    @GetMapping("/date/{date}")
    public ResponseEntity<Map<String, List<Agent>>> getUserByEmail(@PathVariable String date) {
        List<Agent> agent = userService.getUserByDate(date);
        if (agent == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        Map<String, List<Agent>> groupedAgents = util.groupAgentsByName(agent);
        return ResponseEntity.ok(groupedAgents);
    }
    @GetMapping("/name/{name}")
    public ResponseEntity<List<Agent>> getUserByName(@PathVariable String name) {
        List<Agent> agent = userService.getUserByUsername(name);
        if (agent == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return ResponseEntity.ok(agent);
    }


    @GetMapping("/id/{id}")
    public ResponseEntity<Agent> getUserById(@PathVariable Long id) {

        Agent agent= userService.getUserById(id);
        if (agent== null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(agent);
    }

    @PostMapping
    public Agent createUser(@RequestBody AgentDTO agentDTO) {
        return userService.createUser(agentDTO);
    }
}