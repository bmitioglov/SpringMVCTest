package com.main.service;

import com.main.Contact;

import java.util.List;

public interface ContactService {

    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);

}
