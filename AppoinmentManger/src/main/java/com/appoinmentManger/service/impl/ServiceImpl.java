package com.appoinmentManger.service.impl;

import com.appoinmentManger.entity.UserDTO;
import com.appoinmentManger.repository.UserRepository;
import com.appoinmentManger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceImpl implements UserService {


    private UserRepository userRepository;
    @Autowired
    ServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    /**
     * @param userDTO
     * @return
     */
    @Override
    public UserDTO createUser(UserDTO userDTO) {

        return null;
    }

    /**
     * @param userDTO
     * @return
     */
    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public UserDTO getUserById(Long id) {

        return userRepository.findById(id).orElse(null);
    }

    /**
     * @param email
     * @return
     */
    @Override
    public UserDTO getUserByEmail(String email) {
        return null;
    }

    /**
     * @param username
     * @return
     */
    @Override
    public UserDTO getUserByUsername(String username) {
        return null;
    }

    /**
     * @param email
     * @param password
     * @return
     */
    @Override
    public UserDTO getUserByEmailAndPassword(String email, String password) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<UserDTO> getAllUser() {
        return userRepository.findAll();
    }
}
