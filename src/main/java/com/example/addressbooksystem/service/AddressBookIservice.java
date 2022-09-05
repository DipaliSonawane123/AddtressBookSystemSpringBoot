package com.example.addressbooksystem.service;

import com.example.addressbooksystem.dto.AddressDto;
import com.example.addressbooksystem.model.AddressBook;

import java.util.List;
import java.util.Optional;

public interface AddressBookIservice {

    AddressBook saveData(AddressBook addressDetail);

    AddressBook saveDatadto(AddressDto addressDetail);

    Optional<AddressBook> FindById(Long Id);

    List<AddressBook> findAll();

    AddressBook editById(AddressDto addressdto, Long Id);

    void deleteById(Long Id);

    List<AddressBook> getAddressBookByID(String email);

    List<AddressBook> getAddressBookBycity(String city);
}



