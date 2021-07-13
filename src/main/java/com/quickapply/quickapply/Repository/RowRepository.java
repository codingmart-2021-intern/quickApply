package com.quickapply.quickapply.Repository;

import com.quickapply.quickapply.models.Row;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RowRepository extends JpaRepository<Row, Long> {
}
