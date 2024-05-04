package com.example.Blood_Bank.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "blood_bank")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class BloodBank {
    @Id
    @Column(name = "id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "blood_group", length = 50)
    private String bloodGroup;
    @Column(name = "branch_name", length = 50)
    private String branchName;
    @Column(name = "branch_state", length = 50)
    private String branchState;

    public BloodBank(String bloodGroup, String branchName, String branchState) {

        this.bloodGroup = bloodGroup;
        this.branchName = branchName;
        this.branchState = branchState;
    }


// getters and setters
}



