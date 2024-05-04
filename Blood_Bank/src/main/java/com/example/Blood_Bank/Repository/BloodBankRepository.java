package com.example.Blood_Bank.Repository;
import com.example.Blood_Bank.Entity.BloodBank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BloodBankRepository extends JpaRepository<BloodBank, Integer> {
    // Additional query methods can be defined here if needed
}
