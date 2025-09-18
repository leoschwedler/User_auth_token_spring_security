package auth_token.dto;

import lombok.Builder;

@Builder
public record UserRegisterResponseDTO(String name, String email) {
}
