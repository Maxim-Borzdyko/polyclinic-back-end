package by.bntu.fitr.borzdyko.polyclinic.polyclinic.mapper;

import by.bntu.fitr.borzdyko.polyclinic.polyclinic.dto.DoctorDto;
import by.bntu.fitr.borzdyko.polyclinic.polyclinic.model.Doctor;
import org.springframework.stereotype.Component;

@Component
public class DoctorMapper {
    
    public Doctor toEntity(DoctorDto dto) {
        return Doctor.builder()
                .id(dto.getId())
                .name(dto.getName())
                .secondName(dto.getName())
                .position(dto.getPosition())
                .build();
    }

    public DoctorDto toDto(Doctor doctor) {
        return DoctorDto.builder()
                .id(doctor.getId())
                .name(doctor.getName())
                .secondName(doctor.getName())
                .position(doctor.getPosition())
                .build();
    }
}
