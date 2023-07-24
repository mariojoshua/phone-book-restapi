package com.uttara.phone_book_restapi.phone_book_master;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record PhoneBookMasterDTO(Long id, 
       @NotNull @Size(max = 255) String name) {   
}
