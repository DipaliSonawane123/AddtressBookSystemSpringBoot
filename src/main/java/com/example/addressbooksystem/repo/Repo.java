package com.example.addressbooksystem.repo;

import com.example.addressbooksystem.model.AddressBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repo extends JpaRepository<AddressBook, Long> {
    @Query(value="SELECT * FROM address_book,address_book_email WHERE userid = ID AND email = :email", nativeQuery=true)
    List<AddressBook> findAddressBookById(String email);

}
