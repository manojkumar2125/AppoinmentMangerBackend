package com.appoinmentManger.service.impl;

import com.appoinmentManger.entity.Agent;
import com.appoinmentManger.repository.UserRepository;
import com.appoinmentManger.response.AgentDTO;
import com.appoinmentManger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements UserService {

    private UserRepository userRepository;
    @Autowired
    public ServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * @param AgentDTO
     * @return
     */
    @Override
    public Agent createUser(AgentDTO agentDTO) {
        Agent agent = new Agent();
        agent.setName(agentDTO.name());
        agent.setTime(agentDTO.time());
        agent.setDate(agentDTO.date());
        agent.setActive(agentDTO.isActive());
        return userRepository.save(agent);
    }

    /**
     * @param userDTO
     * @return
     */
    @Override
    public Agent updateUser(Agent userDTO) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Agent getUserById(Long id) {
        Optional<Agent> agent = userRepository.findById(id);
        return agent.orElse(null);
    }

    /**
     * @param date
     * @return
     */
    @Override
    public List<Agent> getUserByDate(String date) {
        List<Agent> agents =  userRepository.findByDate(date);
        return agents;
    }

    /**
     * @param username
     * @return
     */
    @Override
    public List<Agent> getUserByUsername(String username) {
        List<Agent> agents = userRepository.findByName(username);
        return agents;
    }

    /**
     * @param email
     * @param password
     * @return
     */
    @Override
    public Agent getUserByEmailAndPassword(String email, String password) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Agent> getAllUser() {
        List<Agent> agents = userRepository.findAll();
        return agents;
    }
}
