package com.appoinmentManger.service;

import com.appoinmentManger.entity.Agent;
import com.appoinmentManger.response.AgentDTO;

import java.util.List;

public interface UserService {
    Agent createUser(AgentDTO agentDto);
    Agent updateUser(Agent userDTO);
    Agent getUserById(Long id);
    List<Agent> getUserByDate(String date);
    List<Agent> getUserByUsername(String name);
    Agent getUserByEmailAndPassword(String email, String password);
    List<Agent> getAllUser();
}
