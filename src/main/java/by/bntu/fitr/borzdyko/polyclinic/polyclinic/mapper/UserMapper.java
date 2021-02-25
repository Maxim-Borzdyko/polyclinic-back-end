package by.bntu.fitr.borzdyko.polyclinic.polyclinic.mapper;

import by.bntu.fitr.borzdyko.polyclinic.polyclinic.dto.UserDto;
import by.bntu.fitr.borzdyko.polyclinic.polyclinic.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toEntity(UserDto dto) {

        // May be password don't needed

        return User.builder()
                .id(dto.getId())
                .name(dto.getName())
                .secondName(dto.getName())
                .email(dto.getEmail())
                .username(dto.getUsername())
                .role(dto.getRole())
                .password(dto.getPassword())
                .build();
    }

    public UserDto toDto(User user) {

        // May be password don't needed

        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .secondName(user.getName())
                .email(user.getEmail())
                .username(user.getUsername())
                .role(user.getRole())
                .password(user.getPassword())
                .build();
    }

}
