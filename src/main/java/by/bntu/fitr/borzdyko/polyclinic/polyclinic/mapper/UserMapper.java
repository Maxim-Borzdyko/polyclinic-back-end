package by.bntu.fitr.borzdyko.polyclinic.polyclinic.mapper;

import by.bntu.fitr.borzdyko.polyclinic.polyclinic.dto.UserDto;
import by.bntu.fitr.borzdyko.polyclinic.polyclinic.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toEntity(UserDto dto) {
        return User.builder()
                .name(dto.getName())
                .secondName(dto.getName())
                .email(dto.getEmail())
                .username(dto.getUsername())
                .build();
    }

    public UserDto toDto(User user) {
        return UserDto.builder()
                .name(user.getName())
                .secondName(user.getName())
                .email(user.getEmail())
                .username(user.getUsername())
                .build();
    }

}
