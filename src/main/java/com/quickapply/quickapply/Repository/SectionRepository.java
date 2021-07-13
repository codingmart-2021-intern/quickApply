package com.quickapply.quickapply.Repository;

import com.quickapply.quickapply.models.Sections;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Sections, Long> {
}
