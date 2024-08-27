package com.senha_controller.user;


public record UserResponse(
        Long id,
        String name,
        String email
) {
    public static UserResponse fromModel(User user) {
        return new UserResponse(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }

}
