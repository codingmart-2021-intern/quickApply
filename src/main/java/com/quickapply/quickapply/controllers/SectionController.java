package com.quickapply.quickapply.controllers;

import com.quickapply.quickapply.models.Design;
import com.quickapply.quickapply.models.Sections;
import com.quickapply.quickapply.services.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SectionController {

    @Autowired
    private DesignService designService;

    @PostMapping("/section/save/{id}")
    public ResponseEntity<?> saveData(@PathVariable Long id, @RequestBody Sections data) throws Exception {
        return new ResponseEntity<>(designService.addSection(id, data), HttpStatus.CREATED);
    }

    @DeleteMapping("/section/delete/{id}")
    public ResponseEntity<?> deleteData(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(designService.deleteSection(id), HttpStatus.OK);
    }

    @PutMapping("/section/edit/{id}")
    public ResponseEntity<?> editData(@PathVariable Long id, @RequestBody Sections data) throws Exception {
        return new ResponseEntity<>(designService.editSection(id, data), HttpStatus.OK);
    }

}
