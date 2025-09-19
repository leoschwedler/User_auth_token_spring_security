package auth_token.service;

import auth_token.dto.UserLoginRequestDTO;
import auth_token.dto.UserLoginResponseDTO;
import auth_token.dto.UserRegisterRequestDTO;
import auth_token.dto.UserRegisterResponseDTO;
import auth_token.infra.security.TokenService;
import auth_token.mapper.UserRegisterMapper;
import auth_token.model.UserEntity;
import auth_token.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final TokenService tokenService;
    private final AuthenticationManager authenticationManager;

    public UserRegisterResponseDTO register(UserRegisterRequestDTO request){
        String password = request.password();
        UserEntity user = UserRegisterMapper.map(request);
        user.setPassword(passwordEncoder.encode(password));
        user = repository.save(user);
        return UserRegisterMapper.map(user);
    }

    public UserLoginResponseDTO login(UserLoginRequestDTO request){
        UsernamePasswordAuthenticationToken userAndPassword = new UsernamePasswordAuthenticationToken(request.email(), request.password());
        Authentication authenticated = authenticationManager.authenticate(userAndPassword);
        UserEntity user = (UserEntity) authenticated.getPrincipal();
        String token = tokenService.generateToken(user);
        return new UserLoginResponseDTO(token);
    }
}
