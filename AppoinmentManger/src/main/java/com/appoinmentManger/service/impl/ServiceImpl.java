package com.appoinmentManger.service.impl;

import com.appoinmentManger.entity.Agent;
import com.appoinmentManger.repository.UserRepository;
import com.appoinmentManger.response.AgentDTO;
import com.appoinmentManger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        agent.setName(agentDTO.getName());
        agent.setTime(agentDTO.getTime());
        agent.setDate(agentDTO.getDate());
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
        return  userRepository.findByDate(date);

    }

    /**
     * @param username
     * @return
     */
    @Override
    public List<Agent> getUserByUsername(String username) {
        return userRepository.findByName(username);

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
        return userRepository.findAll();
    }
}
