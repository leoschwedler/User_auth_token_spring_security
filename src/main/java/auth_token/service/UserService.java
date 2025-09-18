package auth_token.service;

import auth_token.dto.UserRegisterRequestDTO;
import auth_token.dto.UserRegisterResponseDTO;
import auth_token.mapper.UserRegisterMapper;
import auth_token.model.UserEntity;
import auth_token.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public UserRegisterResponseDTO register(UserRegisterRequestDTO request){
        String password = request.password();
        UserEntity user = UserRegisterMapper.map(request);
        user.setPassword(passwordEncoder.encode(password));
        user = repository.save(user);
        return UserRegisterMapper.map(user);
    }
}
