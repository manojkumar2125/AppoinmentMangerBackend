package com.appoinmentManger.service;

import com.appoinmentManger.entity.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    UserDTO updateUser(UserDTO userDTO);
    UserDTO getUserById(Long id);
    UserDTO getUserByEmail(String email);
    UserDTO getUserByUsername(String username);
    UserDTO getUserByEmailAndPassword(String email, String password);
    List<UserDTO> getAllUser();
}
