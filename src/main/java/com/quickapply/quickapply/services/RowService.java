package com.quickapply.quickapply.services;

import com.quickapply.quickapply.models.Row;

public interface RowService {

    String addRow(Long id, Row data) throws Exception;

    String editRow(Long id, Row data) throws Exception;

    String deleteRow(Long id) throws Exception;


}
