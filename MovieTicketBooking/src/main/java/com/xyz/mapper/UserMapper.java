package com.xyz.mapper;

import com.xyz.dto.UserDTO;
import com.xyz.entity.Users;

public class UserMapper {

    public static Users mapToUser(UserDTO userDTO) {
        Users user = new Users();
        user.setEmail(userDTO.getEmail());
        user.setName(userDTO.getName());
        user.setMobileNumber(userDTO.getMobileNumber());
        return user;
    }
    public static UserDTO mapToUserDTO(Users user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setMobileNumber(user.getMobileNumber());
        return userDTO;
    }
}
