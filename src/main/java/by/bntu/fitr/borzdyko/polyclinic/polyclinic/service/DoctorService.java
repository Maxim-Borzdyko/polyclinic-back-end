package by.bntu.fitr.borzdyko.polyclinic.polyclinic.service;

import by.bntu.fitr.borzdyko.polyclinic.polyclinic.model.Doctor;
import by.bntu.fitr.borzdyko.polyclinic.polyclinic.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DoctorService {

    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> getAll() {
        return doctorRepository.findAll();
    }

    public Doctor addDoctor(Doctor doctor) {

        if(doctorRepository.findOne(Example.of(doctor)).isPresent()) {
            return null;
        }

        return doctorRepository.save(doctor);
    }

    public Doctor update(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public void delete(Doctor doctor) {
        doctorRepository.delete(doctor);
    }
}
