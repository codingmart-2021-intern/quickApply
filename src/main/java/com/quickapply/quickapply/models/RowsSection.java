package com.quickapply.quickapply.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class RowsSection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rowId;
    private String title;
    private String details;

    @ManyToOne
    @JsonIgnore
    private Sections sections;

    @OneToMany(mappedBy = "rows",fetch = FetchType.EAGER)
    private List<Columns> columns;
}
