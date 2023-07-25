package com.uttara.phone_book_restapi.phone_book_master;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.validation.Valid;

@Component
@Service
@Transactional
public class PhoneBookMasterService {

    private final PhoneBookMasterRepository phoneBookMasterRepository;

    public PhoneBookMasterService(final PhoneBookMasterRepository phoneBookMasterRepository) {
        this.phoneBookMasterRepository = phoneBookMasterRepository;
    }

    public List<PhoneBookMaster> findAll() {
        final List<PhoneBookMaster> phoneBookMasters = phoneBookMasterRepository.findAll(Sort.by("id"));
        return phoneBookMasters;
    }

    public boolean nameExists(String name) {
        return phoneBookMasterRepository.existsByNameIgnoreCase(name);
    }

    public Long create(final PhoneBookMaster phoneBookMaster) {
        return phoneBookMasterRepository.save(phoneBookMaster).getId();
    }

    public Long delete(String name) {
        System.out.println("came here" + name);
        return phoneBookMasterRepository.deleteByName(name) ;
    }
}
