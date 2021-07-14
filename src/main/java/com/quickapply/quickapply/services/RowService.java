package com.quickapply.quickapply.services;

import com.quickapply.quickapply.models.Columns;
import com.quickapply.quickapply.models.RowsSection;

import java.util.List;

public interface RowService {

    RowsSection addRow(Long id, RowsSection data) throws Exception;

    String editRow(Long id, RowsSection data) throws Exception;

    String deleteRow(Long id) throws Exception;

    List<RowsSection> getRows() throws Exception;

    Columns addColumns(Long id, Columns data) throws Exception;
    List<Columns> getColumns() throws Exception;

}
