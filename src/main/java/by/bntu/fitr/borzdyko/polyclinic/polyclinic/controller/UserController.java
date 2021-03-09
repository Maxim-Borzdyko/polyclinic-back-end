package by.bntu.fitr.borzdyko.polyclinic.polyclinic.controller;

import by.bntu.fitr.borzdyko.polyclinic.polyclinic.model.User;
import by.bntu.fitr.borzdyko.polyclinic.polyclinic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    @PreAuthorize("hasRole('ADMIN')")
    public List<User> getAll() {
        return userService.getAll();
    }

    @PostMapping("/update")
    @PreAuthorize("hasRole('USER')")
    public User updateUser(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteUser(@PathVariable("id") User user) {
        userService.delete(user);
    }
}
