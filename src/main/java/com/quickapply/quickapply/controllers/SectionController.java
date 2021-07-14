package com.quickapply.quickapply.controllers;

import com.quickapply.quickapply.models.Sections;
import com.quickapply.quickapply.services.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class SectionController {

    @Autowired
    private SectionService sectionService;

    @GetMapping("/title/{id}/sections")
    public ResponseEntity<?> fetchData(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(sectionService.getSections(id), HttpStatus.OK);
    }

    @PostMapping("/section/save/{id}")
    public ResponseEntity<?> saveData(@PathVariable Long id, @RequestBody Sections data) throws Exception {
        return new ResponseEntity<>(sectionService.addSection(id, data), HttpStatus.CREATED);
    }

    @DeleteMapping("/section/delete/{id}")
    public ResponseEntity<?> deleteData(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(sectionService.deleteSection(id), HttpStatus.OK);
    }

    @PutMapping("/section/edit/{id}")
    public ResponseEntity<?> editData(@PathVariable Long id, @RequestBody Sections data) throws Exception {
        return new ResponseEntity<>(sectionService.editSection(id, data), HttpStatus.OK);
    }

}
