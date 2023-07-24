package com.uttara.phone_book_restapi.phone_book_master;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/phoneBookMasters", produces = MediaType.APPLICATION_JSON_VALUE)
public class PhoneBookMasterController {
    
    private final PhoneBookMasterService phoneBookMasterService;

    public PhoneBookMasterController(final PhoneBookMasterService phoneBookMasterService) {
        this.phoneBookMasterService = phoneBookMasterService;
    }

    @GetMapping
    public ResponseEntity<List<PhoneBookMaster>> getAllPhoneBookMasters() {
        return ResponseEntity.ok(phoneBookMasterService.findAll());
    }
    
}
