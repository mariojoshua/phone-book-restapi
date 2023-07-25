package com.uttara.phone_book_restapi.phone_book_master;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.util.WebUtils;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/phoneBookMasters", produces = MediaType.APPLICATION_JSON_VALUE)
public class PhoneBookMasterController {
    
    private final PhoneBookMasterService phoneBookMasterService;

    public PhoneBookMasterController(final PhoneBookMasterService phoneBookMasterService) {
        this.phoneBookMasterService = phoneBookMasterService;
    }

    @GetMapping
    @ResponseBody()
    public ResponseEntity<List<PhoneBookMaster>> getAllPhoneBookMasters() {
        return ResponseEntity.ok(phoneBookMasterService.findAll());
    }

    @PostMapping
    public ResponseEntity<Long> createPhoneBookMaster(
            @RequestBody @Valid final PhoneBookMaster phoneBookMaster) {
        final Long createdId = phoneBookMasterService.create(phoneBookMaster);
        return new ResponseEntity<>(createdId, HttpStatus.CREATED);
    }
    
}
