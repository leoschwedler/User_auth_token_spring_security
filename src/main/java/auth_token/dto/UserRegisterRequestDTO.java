package auth_token.dto;

import lombok.Builder;

@Builder
public record UserRegisterRequestDTO(String name, String email, String password) {
}
