package com.quickapply.quickapply.services;

import com.quickapply.quickapply.models.Sections;

public interface SectionService {

    String addSection(Long id, Sections data) throws Exception;

    String editSection(Long id, Sections data) throws Exception;

    String deleteSection(Long id) throws Exception;


}
