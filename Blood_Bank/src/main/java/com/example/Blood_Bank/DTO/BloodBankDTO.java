package com.example.Blood_Bank.DTO;

import com.example.Blood_Bank.Entity.BloodBank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BloodBankDTO {
    private String vehicle_rent;
    private String vehicle_no;
    private String vehicle_state;

    //create a parameter constructor

    public BloodBank toUser(){
        return new BloodBank(
                this.bloodGroup,
                this.branchName,
                this.branchState
        );
    }


}


