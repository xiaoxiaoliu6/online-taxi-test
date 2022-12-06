package com.online.taxi.common.dto.passengeruser;

import lombok.Data;

import javax.validation.constraints.NotBlank;


@Data
public class LoginRequest {

    @NotBlank
    private String passengerPhone;

}
