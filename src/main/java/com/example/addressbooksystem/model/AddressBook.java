package com.example.addressbooksystem.model;

import com.example.addressbooksystem.dto.AddressDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name="AddressBook")
public class AddressBook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long Id;
    String fullName;
    String phoneNumber;
    @ElementCollection
    @CollectionTable(name="AddressBook_Email",joinColumns=@JoinColumn(name="ID"))
    @Column(name="Email")
    private List<String> email;
    String address;
    String city;
    String state;
    Long zipcode;

    public AddressBook(AddressDto dto) {
        this.fullName=dto.getFullName();
        this.phoneNumber=dto.getPhoneNumber();
        this.email= dto.getEmail();
        this.address=dto.getAddress();
       this. city= dto.getCity();
        this.state=dto.getState();
        this.zipcode=dto.getZipcode();
    }
}

