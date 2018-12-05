package com.entrytest.contactmanager.repository;

import com.entrytest.contactmanager.model.Contact;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "contacts", path = "api/contacts")
public interface ContactRepository extends PagingAndSortingRepository<Contact, Long> {
    List<Contact> findAll();
}
