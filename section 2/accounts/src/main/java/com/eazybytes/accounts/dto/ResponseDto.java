package com.eazybytes.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor //allargs is not in data annotation
public class ResponseDto {

    private String statusCode; //tell client status code 200 or 500

    private String statusMsg; //client status message
}
