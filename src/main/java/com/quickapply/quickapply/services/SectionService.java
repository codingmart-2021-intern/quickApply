package com.quickapply.quickapply.services;

import com.quickapply.quickapply.models.Sections;

import java.util.List;

public interface SectionService {

    Sections addSection(Long id, Sections data) throws Exception;

    String editSection(Long id, Sections data) throws Exception;

    String deleteSection(Long id) throws Exception;

    List<Sections> getSections(Long id) throws Exception;
}
