package com.example.addressbooksystem.repo;

import com.example.addressbooksystem.model.AddressBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<AddressBook, Long> {
}
