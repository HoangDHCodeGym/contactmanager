package com.entrytest.contactmanager;

import com.entrytest.contactmanager.model.Contact;
import com.entrytest.contactmanager.repository.ContactRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration
@Slf4j
public class LoadDatabase {
    @Bean
    CommandLineRunner loadData(ContactRepository contactRepository) {
        return args -> {
            log.info("Preload " + contactRepository.save(new Contact("John Doe", "Alex", "Manager", "Apple", "abc@abc.com", "09887477447", new SimpleDateFormat("dd/MM/yyyy").parse("14/03/1993"), "Nothing")));
            log.info("Preload " + contactRepository.save(new Contact("Alex Ferguson", "Henry", "Private Manager", "Google", "abc1@abc.com", "98980008080", new SimpleDateFormat("dd/MM/yyyy").parse("12/03/1988"), "Alpha")));
        };
    }
}