package com.example.application;

import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.BrowserCallable;


// hilla snippet start
@AnonymousAllowed
@BrowserCallable
//flow snippet start
@Service
public class ContactService {

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> getContacts() {
        return contactRepository.findAll();
    }

}
// snippet end