package by.bntu.fitr.borzdyko.polyclinic.polyclinic.repository;

import by.bntu.fitr.borzdyko.polyclinic.polyclinic.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
