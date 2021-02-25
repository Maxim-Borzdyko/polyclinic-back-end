package by.bntu.fitr.borzdyko.polyclinic.polyclinic.service;

import by.bntu.fitr.borzdyko.polyclinic.polyclinic.model.Record;
import by.bntu.fitr.borzdyko.polyclinic.polyclinic.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RecordService {

    private final RecordRepository recordRepository;

    @Autowired
    public RecordService(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    public List<Record> getAll() {
        return recordRepository.findAll();
    }

    public Record addRecord(Record record) {
        if(recordRepository.findOne(Example.of(record)).isPresent()) {
            return null;
        }

        return recordRepository.save(record);
    }

    public Record update(Record record) {
        return recordRepository.save(record);
    }

    public void delete(Record record) {
        recordRepository.delete(record);
    }

}
