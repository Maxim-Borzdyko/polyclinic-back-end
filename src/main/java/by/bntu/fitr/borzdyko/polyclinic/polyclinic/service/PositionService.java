package by.bntu.fitr.borzdyko.polyclinic.polyclinic.service;

import by.bntu.fitr.borzdyko.polyclinic.polyclinic.model.Position;
import by.bntu.fitr.borzdyko.polyclinic.polyclinic.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PositionService {

    private final PositionRepository positionRepository;

    @Autowired
    public PositionService(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    public List<Position> getAll() {
        return positionRepository.findAll();
    }

    public Position addPosition(Position position) {

        if(positionRepository.findOne(Example.of(position)).isPresent()) {
            return null;
        }

        return positionRepository.save(position);
    }

    public Position update(Position position) {
        return positionRepository.save(position);
    }

    public void delete(Position position) {
        positionRepository.delete(position);
    }

}
