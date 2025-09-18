package auth_token.mapper;

import auth_token.dto.UserRegisterRequestDTO;
import auth_token.dto.UserRegisterResponseDTO;
import auth_token.model.UserEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserRegisterMapper {

    public static UserEntity map(UserRegisterRequestDTO request){
        return UserEntity.builder()
                .email(request.email())
                .name(request.password())
                .password(request.password())
                .build();
    }


    public static UserRegisterResponseDTO map(UserEntity user){
        return UserRegisterResponseDTO.builder()
                .name(user.getName())
                .email(user.getEmail())
                .build();
    }
}
