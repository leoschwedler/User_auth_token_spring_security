package auth_token.dto;

import lombok.Builder;

@Builder
public record UserLoginResponseDTO(String token) {
}
