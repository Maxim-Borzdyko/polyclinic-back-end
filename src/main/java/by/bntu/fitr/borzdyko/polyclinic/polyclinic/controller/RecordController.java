package by.bntu.fitr.borzdyko.polyclinic.polyclinic.controller;

import by.bntu.fitr.borzdyko.polyclinic.polyclinic.model.Record;
import by.bntu.fitr.borzdyko.polyclinic.polyclinic.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/records")
public class RecordController {

    private final RecordService recordService;

    @Autowired
    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @GetMapping("/all")
    @PreAuthorize("hasRole('USER')")
    public List<Record> getAll() {
        return recordService.getAll();
    }

    @PostMapping("/add")
    @PreAuthorize("hasRole('USER')")
    public Record addRecord(@RequestBody Record record) {
        return recordService.addRecord(record);
    }

    @PostMapping("/update")
    @PreAuthorize("hasRole('USER')")
    public Record updateRecord(@RequestBody Record record) {
        return recordService.update(record);
    }

    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public void deleteRecord(@PathVariable("id") Record record) {
        recordService.delete(record);
    }
}
