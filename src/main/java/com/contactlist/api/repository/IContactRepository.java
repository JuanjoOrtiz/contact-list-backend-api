package com.contactlist.api.repository;

import com.contactlist.api.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContactRepository extends JpaRepository<Contact, Long> {
}
