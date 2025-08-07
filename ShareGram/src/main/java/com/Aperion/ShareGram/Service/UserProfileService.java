package com.Aperion.ShareGram.Service;

import com.Aperion.ShareGram.Model.CurrentUser;
import com.Aperion.ShareGram.Model.User_DTO;
import com.Aperion.ShareGram.Model.Users;
import com.Aperion.ShareGram.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService implements  UserProfile{

    @Autowired
    private UserRepo userRepo;


    @Override
    public User_DTO updateuserprofile( User_DTO userDto) {
        String username=
                CurrentUser.getCurrentUsername();
        Users users=
                userRepo.findByUsername(username)
                        .orElseThrow(()-> new RuntimeException("User Not Found"));
//        users.setUsername(userDto.getUsername());
//        users.setName(userDto.getName());
//        users.setBio(userDto.getBio());

        if(userDto.getUsername()!=null){
            users.setUsername(userDto.getUsername());
        }
        if(userDto.getName()!=null){
            users.setName(userDto.getName());
        }
        if(userDto.getBio()!=null){
            users.setBio(userDto.getBio());
        }
        userRepo.save(users);
        return mapToDTO(users);
    }

    @Override
    public User_DTO getuserprofile() {
        String username=
                CurrentUser.getCurrentUsername();
        Users users=
                userRepo.findByUsername(username)
                        .orElseThrow(()-> new RuntimeException("user Not Found"));
        return mapToDTO(users);
    }

    private User_DTO mapToDTO(Users users){
        User_DTO dto= new User_DTO();
        dto.setUsername(users.getUsername());
        dto.setName(users.getName());
        dto.setBio(users.getBio());
        return dto;
    }
}
