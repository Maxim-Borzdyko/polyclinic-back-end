package by.bntu.fitr.borzdyko.polyclinic.polyclinic.controller;

import by.bntu.fitr.borzdyko.polyclinic.polyclinic.model.Position;
import by.bntu.fitr.borzdyko.polyclinic.polyclinic.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/positions")
public class PositionController {

    private final PositionService positionService;

    @Autowired
    public PositionController(PositionService positionService) {
        this.positionService = positionService;
    }

    @GetMapping("/all")
    @PreAuthorize("hasRole('USER')")
    public List<Position> getAll() {
        return positionService.getAll();
    }

    @PostMapping("/add")
    @PreAuthorize("hasRole('ADMIN')")
    public Position addPosition(@RequestBody Position position) {
        return positionService.addPosition(position);
    }

    @PostMapping("/update")
    @PreAuthorize("hasRole('ADMIN')")
    public Position updatePosition(@RequestBody Position position) {
        return positionService.update(position);
    }

    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deletePosition(@PathVariable("id") Position position) {
        positionService.delete(position);
    }
}
