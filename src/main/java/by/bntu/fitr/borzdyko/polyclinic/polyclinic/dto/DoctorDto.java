package by.bntu.fitr.borzdyko.polyclinic.polyclinic.dto;

import by.bntu.fitr.borzdyko.polyclinic.polyclinic.model.Position;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoctorDto {

    private long id;
    private String name;
    private String secondName;
    private Position position;

}
