package auth_token.controller;

import auth_token.dto.UserLoginRequestDTO;
import auth_token.dto.UserLoginResponseDTO;
import auth_token.dto.UserRegisterRequestDTO;
import auth_token.dto.UserRegisterResponseDTO;
import auth_token.model.UserEntity;
import auth_token.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping("/register")
    public ResponseEntity<UserRegisterResponseDTO> register(@RequestBody UserRegisterRequestDTO request){
       UserRegisterResponseDTO response = service.register(request);
       return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PostMapping("/login")
    public ResponseEntity<UserLoginResponseDTO> login(@RequestBody UserLoginRequestDTO request){
      UserLoginResponseDTO response = service.login(request);
      return ResponseEntity.ok(response);
    }
}
