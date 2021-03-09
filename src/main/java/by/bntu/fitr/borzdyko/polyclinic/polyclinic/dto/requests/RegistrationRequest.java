package by.bntu.fitr.borzdyko.polyclinic.polyclinic.dto.requests;

import lombok.Data;

@Data
public class RegistrationRequest {

    private String username;
    private String email;
    private String name;
    private String secondName;
    private String password;

}
