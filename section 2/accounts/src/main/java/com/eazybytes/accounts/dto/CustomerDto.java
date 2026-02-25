package com.eazybytes.accounts.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data //adds getter, setter, tostring (not used in entity because it can cause issues)s
public class CustomerDto {

    private String name;

    private String email;

    private String mobileNumber;

    private AccountsDto accountsDto;
}
