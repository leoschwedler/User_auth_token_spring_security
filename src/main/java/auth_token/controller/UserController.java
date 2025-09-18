package auth_token.controller;

import auth_token.dto.UserRegisterRequestDTO;
import auth_token.dto.UserRegisterResponseDTO;
import auth_token.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
       UserRegisterResponseDTO user = service.register(request);
       return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
