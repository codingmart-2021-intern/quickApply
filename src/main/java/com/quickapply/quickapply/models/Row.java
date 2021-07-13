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
public class Row {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rowId;
    private String title;
    private String details;

    @OneToMany(targetEntity = Columns.class, cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Columns> columns;

}
