package com.senha_controller.user;

public record UserFormRequest(
        String name,
        String email,
        String password
) {
    public User toModel() {
        return User.builder()
                .name(name)
                .email(email)
                .password(password)
                .build();
    }
}
