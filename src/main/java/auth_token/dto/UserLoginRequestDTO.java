package auth_token.dto;

import lombok.Builder;

@Builder
public record UserLoginRequestDTO(String email, String password) {
}
