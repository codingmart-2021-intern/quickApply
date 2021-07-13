package com.quickapply.quickapply.services;

import com.quickapply.quickapply.models.Design;
import com.quickapply.quickapply.models.Sections;

public interface DesignService {

    Design saveData(Design data);

    Design fetchDesign(Long id) throws Exception;

    Design updateDesign(Long id, Design data) throws Exception;

    String deleteDesign(Long id) throws Exception;



}
