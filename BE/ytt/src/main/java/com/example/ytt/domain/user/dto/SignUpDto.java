package com.example.ytt.domain.user.dto;

import com.example.ytt.domain.user.domain.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignUpDto {

    @NotBlank
    private String email;

    @NotBlank
    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{12,20}", message = "비밀번호는 12~20자 영문 대 소문자, 숫자, 특수문자를 사용하세요.")
    private String password;

    @NotBlank
    private String name;

    @NotBlank
    private String phoneNumber;

    private Role role = Role.CUSTOMER;

    public User toEntity(SignUpDto signUpDto) {
        return User.builder()
                .email(signUpDto.getEmail())
                .password(signUpDto.getPassword())
                .name(signUpDto.getName())
                .phoneNumber(signUpDto.getPhoneNumber())
                .role(role)
                .build();
    }
}
