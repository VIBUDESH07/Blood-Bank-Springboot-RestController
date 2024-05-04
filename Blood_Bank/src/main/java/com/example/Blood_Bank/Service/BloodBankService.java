package com.example.Blood_Bank.Service;

import com.example.Blood_Bank.DTO.BloodBankDTO;
import com.example.Blood_Bank.Entity.BloodBank;
import com.example.Blood_Bank.Repository.BloodBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BloodBankService {

    @Autowired
    private BloodBankRepository repository;

    public String saveUser(BloodBank user) {
        return String.valueOf(repository.save(user).getId());

    }


    public List<BloodBankDTO> getUser(){
        List<BloodBank> getUsers = repository.findAll();
        List<BloodBankDTO> userDTOList = new ArrayList<>();
        for (BloodBank a:getUsers){
             BloodBankDTO bloodDTO = new BloodBankDTO(
                     a.getBloodGroup(),
                    a.getBranchName(),
                    a.getBranchState()
            );
            userDTOList.add(bloodDTO);
        }
        return userDTOList;
    }

    public boolean deleteUser(int id) {

        if(repository.existsById(id))
        {
            repository.deleteById(id);
            return true;
        }
        else
        {
            System.out.println("Invalid User Id");
            return false;
        }


    }
}


