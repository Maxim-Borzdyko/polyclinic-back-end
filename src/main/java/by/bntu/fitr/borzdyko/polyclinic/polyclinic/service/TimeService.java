package by.bntu.fitr.borzdyko.polyclinic.polyclinic.service;

import by.bntu.fitr.borzdyko.polyclinic.polyclinic.model.AppointmentTime;
import by.bntu.fitr.borzdyko.polyclinic.polyclinic.repository.AppointmentTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TimeService {

    private final AppointmentTimeRepository timeRepository;

    @Autowired
    public TimeService(AppointmentTimeRepository timeRepository) {
        this.timeRepository = timeRepository;
    }

    public List<AppointmentTime> getAll() {
        return timeRepository.findAll();
    }
}
