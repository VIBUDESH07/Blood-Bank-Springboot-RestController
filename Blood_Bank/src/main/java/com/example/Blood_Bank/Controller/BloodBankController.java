package com.example.Blood_Bank.Controller;
import com.example.Blood_Bank.DTO.BloodBankDTO;
import com.example.Blood_Bank.Entity.BloodBank;
import com.example.Blood_Bank.Service.BloodBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/BloodBank")
public class BloodBankController {
    @GetMapping("/")
    public String index() {

        return "index";
    }
    @Autowired
    private BloodBankService bloodBankService;

    @PostMapping(path = "/save") //from post request in API on method save
    public String saveUser(@RequestBody BloodBankDTO userDTO){
        return bloodBankService.saveUser(userDTO.toUser()); // we pass this request to User Service Which comes from User Dto
    }
    //get user data
    @GetMapping(path = "/getUser") //from post request in API on method save
    public List<BloodBankDTO> getUser(){
        List<BloodBankDTO>allUsers = bloodBankService.getUser();
        return allUsers;
    }

    @DeleteMapping(path = "/deleteUser/{id}")
    public String deleteUser(@PathVariable(value = "id") int id)
    {
        boolean deleteUser = bloodBankService.deleteUser(id);
        if (deleteUser){
            return "deleted";
        }
        else {
            return "Invalid UserId";
        }

    }

}
