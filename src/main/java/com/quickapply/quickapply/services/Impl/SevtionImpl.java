package com.quickapply.quickapply.services.Impl;

import com.quickapply.quickapply.Repository.DesignRepository;
import com.quickapply.quickapply.Repository.SectionRepository;
import com.quickapply.quickapply.models.Design;
import com.quickapply.quickapply.models.Sections;
import com.quickapply.quickapply.services.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SevtionImpl implements SectionService {


    @Autowired
    private DesignRepository designRepository;

    @Autowired
    private SectionRepository sectionRepository;

    //    sections..


    @Override
    public String addSection(Long id, Sections data) throws Exception {
        Optional<Design> design = designRepository.findById(id);
        if (design.isPresent()) {
            List<Sections> sections = new ArrayList<>(design.get().getSections());
            Sections val = Sections.builder().title(data.getTitle()).details(data.getDetails()).build();
            sections.add(val);
            design.get().setSections(sections);
            designRepository.save(design.get());
            return "Section added successfully!!";
        }
        throw new Exception("Design not found");
    }

    @Override
    public String editSection(Long id, Sections data) throws Exception {
        Optional<Sections> sections = sectionRepository.findById(id);
        if (sections.isPresent()) {
            sections.get().setTitle(data.getTitle());
            sections.get().setDetails(data.getDetails());
            sectionRepository.save(sections.get());
            return "Section updated successfully!!";
        }
        throw new Exception("Design not found");
    }

    @Override
    public String deleteSection(Long id) throws Exception {
        Optional<Sections> sections = sectionRepository.findById(id);
        if (sections.isPresent()) {
            sectionRepository.deleteById(id);
            return "Section deleted successfully!!";
        }
        throw new Exception("Design not found");
    }

}
