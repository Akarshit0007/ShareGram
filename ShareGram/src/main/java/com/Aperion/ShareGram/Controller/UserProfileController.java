package com.Aperion.ShareGram.Controller;

import com.Aperion.ShareGram.Model.User_DTO;

import com.Aperion.ShareGram.Service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfileController {
    @Autowired
    private UserProfileService userProfileService;

    @GetMapping("/profile")
    public ResponseEntity<User_DTO> getProfile(){
        User_DTO user=
        userProfileService.getuserprofile();
        return ResponseEntity.ok(user);
    }

   @PutMapping("/profile")
   public ResponseEntity<User_DTO> updateProfile(@RequestBody User_DTO userDto){
        User_DTO updateduser=
                userProfileService.updateuserprofile(userDto);
        return ResponseEntity.ok(updateduser);
   }
}
