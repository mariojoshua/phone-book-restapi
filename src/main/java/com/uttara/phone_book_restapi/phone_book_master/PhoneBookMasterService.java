package com.uttara.phone_book_restapi.phone_book_master;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class PhoneBookMasterService {

    private final PhoneBookMasterRepository phoneBookMasterRepository;

    public PhoneBookMasterService(final PhoneBookMasterRepository phoneBookMasterRepository) {
        this.phoneBookMasterRepository = phoneBookMasterRepository;
    }

    public List<PhoneBookMaster> findAll() {
        final List<PhoneBookMaster> phoneBookMasters = phoneBookMasterRepository.findAll(Sort.by("id"));
        return phoneBookMasters;
    }
}
