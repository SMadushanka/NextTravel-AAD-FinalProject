package com.example.nexttravelbackend.service;

import com.example.nexttravelbackend.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO searchUser(String username);

    UserDTO getUserByEmail(String email);

    boolean updateUserRole(String email, String newRole);

    int saveUser(UserDTO userDTO);

    List<UserDTO> getAllUsers();

    boolean deleteUserByEmail(String email);
}
