package com.quickapply.quickapply.services;

import com.quickapply.quickapply.models.Rows;

import java.util.List;

public interface RowService {

    String addRow(Long id, Rows data) throws Exception;

    String editRow(Long id, Rows data) throws Exception;

    String deleteRow(Long id) throws Exception;

//    List<Row> getRows(Long sectionId) throws Exception;
}
