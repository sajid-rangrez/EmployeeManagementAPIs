package com.Dev.emp.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String personalId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String gender;
    private String dateOfBirth;
    private String phoneNo;
    private String maritalStatus;
    private String designation;
    private String qualification;
    private String address;
    private String city;
    private String dateOfStart;
    private String dateOfEnd;
    private double salary;
    private double experience;

}
