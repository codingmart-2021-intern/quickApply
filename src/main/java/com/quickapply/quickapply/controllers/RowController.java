package com.quickapply.quickapply.controllers;

import com.quickapply.quickapply.models.Columns;
import com.quickapply.quickapply.models.RowsSection;
import com.quickapply.quickapply.services.RowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class RowController {

    @Autowired
    private RowService rowService;

    @PostMapping("/row/save/{id}")
    public ResponseEntity<?> saveData(@PathVariable Long id, @RequestBody RowsSection data) throws Exception {
        return new ResponseEntity<>(rowService.addRow(id, data), HttpStatus.CREATED);
    }

    @DeleteMapping("/row/delete/{id}")
    public ResponseEntity<?> deleteData(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(rowService.deleteRow(id), HttpStatus.OK);
    }

    @PutMapping("/row/edit/{id}")
    public ResponseEntity<?> editData(@PathVariable Long id, @RequestBody RowsSection data) throws Exception {
        return new ResponseEntity<>(rowService.editRow(id, data), HttpStatus.OK);
    }

    @GetMapping("/rows")
    public ResponseEntity<?> editData() throws Exception {
        return new ResponseEntity<>(rowService.getRows(), HttpStatus.OK);
    }


//    columns

    @PostMapping("/columns/save/{id}")
    public ResponseEntity<?> saveColumnsData(@PathVariable Long id, @RequestBody Columns data) throws Exception {
        return new ResponseEntity<>(rowService.addColumns(id, data), HttpStatus.CREATED);
    }

    @GetMapping("/columns")
    public ResponseEntity<?> getColumnsData() throws Exception {
        return new ResponseEntity<>(rowService.getColumns(), HttpStatus.CREATED);
    }


}
