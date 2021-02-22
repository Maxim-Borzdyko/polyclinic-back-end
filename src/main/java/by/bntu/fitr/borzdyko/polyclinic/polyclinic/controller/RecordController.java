package by.bntu.fitr.borzdyko.polyclinic.polyclinic.controller;

import by.bntu.fitr.borzdyko.polyclinic.polyclinic.model.Record;
import by.bntu.fitr.borzdyko.polyclinic.polyclinic.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Record> getAll() {
        return recordService.getAll();
    }

    // @RequestBody ADD
//    @PostMapping("/add")
//    public Record addUser() {
//        return recordService.addRecord(record);
//    }
}
