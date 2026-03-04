package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
@Schema(name = "Response", description = "Schema to hold successful response information")
@Data @AllArgsConstructor //allargs is not in data annotation
public class ResponseDto {
    @Schema(
            description = "Status code in the response"
    )
    private String statusCode; //tell client status code 200 or 500

    @Schema(
            description = "Status message in the response"
    )
    private String statusMsg; //client status message
}
