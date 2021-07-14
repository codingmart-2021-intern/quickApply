package com.quickapply.quickapply.controllers;

import com.quickapply.quickapply.models.Design;
import com.quickapply.quickapply.services.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class DesignController {

    @Autowired
    private DesignService designService;

    @PostMapping("/saveDesign")
    public ResponseEntity<?> saveData(@RequestBody Design data) {
        return new ResponseEntity<>(designService.saveData(data), HttpStatus.CREATED);
    }

    @PutMapping("/updateDesign/{id}")
    public ResponseEntity<?> saveData(@PathVariable Long id, @RequestBody Design data) throws Exception {
        return new ResponseEntity<>(designService.updateDesign(id, data), HttpStatus.OK);
    }

    @GetMapping("/title/{id}")
    public ResponseEntity<?> fetchData(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(designService.fetchDesign(id), HttpStatus.OK);
    }

    @DeleteMapping("/deleteDesign/{id}")
    public ResponseEntity<?> deleteData(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(designService.deleteDesign(id), HttpStatus.OK);
    }


}
