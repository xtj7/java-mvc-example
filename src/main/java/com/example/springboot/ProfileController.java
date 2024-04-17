package com.example.springboot;

import com.example.springboot.model.UpdateProfile;
import com.example.springboot.model.User;
import com.example.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProfileController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/profiles")
    public String getProfiles(Model model) {
        try {
            List<User> users = new ArrayList<User>(userRepository.findAll());
            model.addAttribute("users", users);
            return "profiles";
        } catch (Exception e) {
            return "error500";
        }
    }

    @GetMapping("/profile/{username}")
    public String getProfile(@PathVariable(required = false) String username, Model model) {
        try {
            User user = userRepository.findByUsername(username);
            model.addAttribute("user", user);
            return "profile";
        } catch (Exception e) {
            return "error500";
        }
    }

    @GetMapping("/update_profile")
    public String updateProfile(@RequestParam(required = false) String username, Model model) {
        try {
            User user = userRepository.findByUsername(username);
            UpdateProfile updateProfile = new UpdateProfile();
            updateProfile.setId(user.getId());
            updateProfile.setUsername(user.getUsername());
            updateProfile.setDescription(user.getDescription());
            model.addAttribute("updateProfile", updateProfile);
            return "update_profile";
        } catch (Exception e) {
            return "error500";
        }
    }

    @PostMapping("/update_profile")
    public String doUpdateProfile(@ModelAttribute UpdateProfile updateProfile, Model model) {
        // todo: update logic for user profile

        model.addAttribute("updateProfile", updateProfile);
        return "update_profile_result";
    }
}
