package by.bntu.fitr.borzdyko.polyclinic.polyclinic.repository;

import by.bntu.fitr.borzdyko.polyclinic.polyclinic.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {
}
