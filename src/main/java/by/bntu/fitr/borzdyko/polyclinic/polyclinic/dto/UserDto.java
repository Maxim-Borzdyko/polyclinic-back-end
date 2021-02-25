package by.bntu.fitr.borzdyko.polyclinic.polyclinic.dto;

import by.bntu.fitr.borzdyko.polyclinic.polyclinic.model.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private long id;
    private Role role;
    private String username;
    private String email;
    // May be not needed
    private String password;
    private String name;
    private String secondName;

}
