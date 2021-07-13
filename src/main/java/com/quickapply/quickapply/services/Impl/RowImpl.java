package com.quickapply.quickapply.services.Impl;

import com.quickapply.quickapply.Repository.RowRepository;
import com.quickapply.quickapply.Repository.SectionRepository;
import com.quickapply.quickapply.models.Design;
import com.quickapply.quickapply.models.Row;
import com.quickapply.quickapply.models.Sections;
import com.quickapply.quickapply.services.RowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RowImpl implements RowService {


    @Autowired
    private SectionRepository sectionRepository;

    @Autowired
    private RowRepository rowRepository;

    @Override
    public String addRow(Long id, Row data) throws Exception {
//        Optional<Sections> sections = sectionRepository.findById(id);
//        if (sections.isPresent()) {
//            List<Row> row = new ArrayList<>(sections.get().getRow());
//            Row val = Row.builder().title(data.getTitle()).details(data.getDetails()).build();
//            row.add(val);
//            sections.get().setRow(row);

//            System.out.println(sections);
//            sectionRepository.save(sections.get());
//            return "Row added successfully!!";
//        }
//        throw new Exception("Sections not found");

        return "";
    }

    @Override
    public String editRow(Long id, Row data) throws Exception {
        Optional<Row> sections = rowRepository.findById(id);
        if (sections.isPresent()) {
            sections.get().setTitle(data.getTitle());
            sections.get().setDetails(data.getDetails());
            rowRepository.save(sections.get());
            return "Section updated successfully!!";
        }
        throw new Exception("Design not found");
    }

    @Override
    public String deleteRow(Long id) throws Exception {
        Optional<Row> sections = rowRepository.findById(id);
        if (sections.isPresent()) {
            rowRepository.deleteById(id);
            return "Section deleted successfully!!";
        }
        throw new Exception("Design not found");
    }
}
