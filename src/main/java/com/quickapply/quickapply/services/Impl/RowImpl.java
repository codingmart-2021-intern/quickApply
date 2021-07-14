package com.quickapply.quickapply.services.Impl;

import com.quickapply.quickapply.Repository.ColumnsRepository;
import com.quickapply.quickapply.Repository.RowRepository;
import com.quickapply.quickapply.Repository.SectionRepository;
import com.quickapply.quickapply.models.*;
import com.quickapply.quickapply.services.RowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RowImpl implements RowService {

    @Autowired
    private RowRepository rowRepository;

    @Autowired
    private SectionRepository sectionRepository;


    @Autowired
    private ColumnsRepository columnsRepository;

    @Override
    public List<RowsSection> getRows() throws Exception {
        List<RowsSection> rows = new ArrayList<>();
        return rowRepository.findAll();
    }


    @Override
    public RowsSection addRow(Long id, RowsSection data) throws Exception {

        Optional<Sections> design = sectionRepository.findById(id);
        if (design.isPresent()) {
            data.setSections(design.get());
            RowsSection rowData = rowRepository.save(data);
            return rowData;
        }
        throw new Exception("Section id id not found");
    }

    @Override
    public String editRow(Long id, RowsSection data) throws Exception {
        Optional<RowsSection> sections = rowRepository.findById(id);
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
        Optional<RowsSection> sections = rowRepository.findById(id);
        if (sections.isPresent()) {
            rowRepository.deleteById(id);
            return "Section deleted successfully!!";
        }
        throw new Exception("Design not found");
    }

    //    columns
    @Override
    public Columns addColumns(Long id, Columns data) throws Exception {
        Optional<RowsSection> design = rowRepository.findById(id);
        if (design.isPresent()) {

            data.setRows(design.get());
            Columns ColumnData = columnsRepository.save(data);
            return ColumnData;
        }
        throw new Exception("Row id id not found");
    }

    @Override
    public List<Columns> getColumns() throws Exception {
        return columnsRepository.findAll();
    }

}
