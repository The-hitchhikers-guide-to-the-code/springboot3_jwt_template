package io.pinkspider.springboot3jwttemplate.global.dto.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateAccessTokenRequest {
    private String refreshToken;
}
