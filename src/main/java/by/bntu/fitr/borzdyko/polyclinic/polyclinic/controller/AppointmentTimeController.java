package by.bntu.fitr.borzdyko.polyclinic.polyclinic.controller;

import by.bntu.fitr.borzdyko.polyclinic.polyclinic.model.AppointmentTime;
import by.bntu.fitr.borzdyko.polyclinic.polyclinic.service.AppointmentTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/time")
public class AppointmentTimeController {

    private final AppointmentTimeService appointmentTimeService;

    @Autowired
    public AppointmentTimeController(AppointmentTimeService appointmentTimeService) {
        this.appointmentTimeService = appointmentTimeService;
    }

    @GetMapping("/all")
    @PreAuthorize("hasRole('USER')")
    public List<AppointmentTime> getAll() {
        return appointmentTimeService.getAll();
    }
}
