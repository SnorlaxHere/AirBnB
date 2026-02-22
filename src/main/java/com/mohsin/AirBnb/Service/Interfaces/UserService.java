package com.mohsin.AirBnb.Service.Interfaces;

import com.mohsin.AirBnb.Dto.ProfileUpdateRequestDTO;
import com.mohsin.AirBnb.Dto.UserDTO;
import com.mohsin.AirBnb.Entities.UserEntity;

public interface UserService {
    UserEntity getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDTO profileUpdateRequestDto);

    UserDTO getMyProfile();
}
