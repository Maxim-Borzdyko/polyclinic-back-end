package by.bntu.fitr.borzdyko.polyclinic.polyclinic.controller;

import by.bntu.fitr.borzdyko.polyclinic.polyclinic.dto.DoctorDto;
import by.bntu.fitr.borzdyko.polyclinic.polyclinic.mapper.DoctorMapper;
import by.bntu.fitr.borzdyko.polyclinic.polyclinic.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    private final DoctorService doctorService;
    private final DoctorMapper doctorMapper;

    @Autowired
    public DoctorController(DoctorService doctorService, DoctorMapper doctorMapper) {
        this.doctorService = doctorService;
        this.doctorMapper = doctorMapper;
    }

    @GetMapping("/all")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public List<DoctorDto> getAll() {
        return doctorService.getAll()
                .stream().map(doctorMapper::toDto).collect(Collectors.toList());
    }

    @PostMapping("/add")
    @PreAuthorize("hasRole('ADMIN')")
    public DoctorDto addDoctor(@RequestBody DoctorDto doctorDto) {
        return doctorMapper.toDto(doctorService.addDoctor(doctorMapper.toEntity(doctorDto)));
    }

    @PostMapping("/update")
    @PreAuthorize("hasRole('ADMIN')")
    public DoctorDto updateDoctor(@RequestBody DoctorDto doctor){
        return doctorMapper.toDto(doctorService.update(doctorMapper.toEntity(doctor)));
    }

    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteDoctor(@PathVariable("id") DoctorDto doctor) {
        doctorService.delete(doctorMapper.toEntity(doctor));
    }
}
