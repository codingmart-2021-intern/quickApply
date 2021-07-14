package com.quickapply.quickapply.services;

import com.quickapply.quickapply.models.RowsSection;

public interface RowService {

    String addRow(Long id, RowsSection data) throws Exception;

    String editRow(Long id, RowsSection data) throws Exception;

    String deleteRow(Long id) throws Exception;

//    List<Row> getRows(Long sectionId) throws Exception;
}
