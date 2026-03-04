package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data //adds getter, setter, tostring (not used in entity because it can cause issues
@Schema(name = "Customer", description = "Schema to hold Customer and Account information")
public class CustomerDto {
    //notempty does the check before the user input even makes a call to the rest api
    //our dto checks input before making a call to REST API
    @NotEmpty(message = "Name can not be null or empty") //make this field mandatory or else give error message
    @Size(min = 5, max = 30, message = "Length of name must be between 5 and 30") //assert size of name
    @Schema(description = "Name of customer",example = "Eazy Bytes")
    private String name;

    @Schema(
            description = "Email address of the customer", example = "tutor@eazybytes.com"
    )
    @NotEmpty(message = "Email can not be null or empty") //make this field mandatory
    @Email(message = "Email must be a valid value") //assert the input is a valid type email
    private String email;

    @Schema(
            description = "Mobile Number of the customer", example = "9345432123"
    )
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account details of the Customer"
    )
    private AccountsDto accountsDto;
}
