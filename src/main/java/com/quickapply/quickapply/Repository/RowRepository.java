package com.quickapply.quickapply.Repository;

import com.quickapply.quickapply.models.Rows;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RowRepository extends JpaRepository<Rows, Long> {

//    @Query(value = "SELECT * FROM row", nativeQuery = true)
//    public List<Row> findBySectionId(Long sectionId);
}
