package by.bntu.fitr.borzdyko.polyclinic.polyclinic.controller;

import by.bntu.fitr.borzdyko.polyclinic.polyclinic.dto.requests.AuthRequest;
import by.bntu.fitr.borzdyko.polyclinic.polyclinic.dto.requests.RegistrationRequest;
import by.bntu.fitr.borzdyko.polyclinic.polyclinic.dto.responses.AuthResponse;
import by.bntu.fitr.borzdyko.polyclinic.polyclinic.model.User;
import by.bntu.fitr.borzdyko.polyclinic.polyclinic.security.jwt.JwtProvider;
import by.bntu.fitr.borzdyko.polyclinic.polyclinic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final UserService userService;
    private final JwtProvider jwtProvider;

    @Autowired
    public AuthController(UserService userService, JwtProvider jwtProvider) {
        this.userService = userService;
        this.jwtProvider = jwtProvider;
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest authRequest) {
        User user = userService.getByLoginAndPassword(authRequest.getUsername(), authRequest.getPassword());
        return new AuthResponse(jwtProvider.generateToken(user.getUsername()));
    }

    @PostMapping("/registration")
    public void getRegistration(@RequestBody RegistrationRequest registrationRequest) {
        User user = User.builder()
                .username(registrationRequest.getUsername())
                .email(registrationRequest.getEmail())
                .name(registrationRequest.getName())
                .secondName(registrationRequest.getSecondName())
                .password(registrationRequest.getPassword())
                .build();

        userService.addUser(user);
    }
}
