package com.uttara.phone_book_restapi;

import com.uttara.phone_book_restapi.phone_book_master.PhoneBookMaster;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record MainDTO(@NotNull @Valid PhoneBookMaster phoneBookMaster) {
    
}
