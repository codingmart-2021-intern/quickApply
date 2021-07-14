package com.quickapply.quickapply.services.Impl;

import com.quickapply.quickapply.Repository.DesignRepository;
import com.quickapply.quickapply.Repository.SectionRepository;
import com.quickapply.quickapply.models.Design;
import com.quickapply.quickapply.models.Sections;
import com.quickapply.quickapply.services.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DesignImpl implements DesignService {

    @Autowired
    private DesignRepository designRepository;

    //designs

    @Override
    public Design saveData(Design data) {
        data.setSignature_enabled(true);
        return designRepository.save(data);
    }

    @Override
    public Design fetchDesign(Long id) throws Exception {
        Optional<Design> design = designRepository.findById(id);

        if (design.isPresent()) {
            return design.get();
        }
        throw new Exception("Design Id not found");
    }

    @Override
    public Design updateDesign(Long id, Design data) throws Exception {
        Optional<Design> design = designRepository.findById(id);
        if (design.isPresent()) {
            design.get().setEmail(data.getEmail());
            design.get().setDetails(data.getDetails());
            design.get().setTitle(data.getTitle());
            design.get().setSignature_enabled(data.isSignature_enabled());
            return designRepository.save(design.get());
        }
        throw new Exception("Design Id not found");
    }

    @Override
    public String deleteDesign(Long id) throws Exception {
        Optional<Design> design = designRepository.findById(id);
        if (design.isPresent()) {
            designRepository.deleteById(id);
            return "Design deleted successfully!!";
        }
        throw new Exception("Design Id not found");
    }

}
