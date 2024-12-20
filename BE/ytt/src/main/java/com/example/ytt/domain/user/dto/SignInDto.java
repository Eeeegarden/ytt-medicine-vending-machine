package com.example.ytt.domain.user.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SignInDto {

    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
