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
public class Sections {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sectionId;
    private String title;
    private String details;

    @ManyToOne
    @JsonIgnore
    private Design design;

    @OneToMany(mappedBy = "sections")
    private List<RowsSection> rows;
}
