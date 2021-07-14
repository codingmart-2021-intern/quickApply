package com.quickapply.quickapply.Repository;

import com.quickapply.quickapply.models.Sections;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SectionRepository extends JpaRepository<Sections, Long> {
    @Query(value = "SELECT * FROM sections INNER JOIN design ON design.design_id = sections.design_design_id ",nativeQuery = true)
    public List<Sections> findByDesignId(Long designIds);
}
