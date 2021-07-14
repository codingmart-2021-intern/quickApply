package com.quickapply.quickapply.Repository;

import com.quickapply.quickapply.models.RowsSection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RowRepository extends JpaRepository<RowsSection, Long> {

//    @Query(value = "SELECT * FROM row", nativeQuery = true)
//    public List<Row> findBySectionId(Long sectionId);
}
