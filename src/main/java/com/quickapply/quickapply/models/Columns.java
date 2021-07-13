package com.quickapply.quickapply.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Columns {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long columnId;

    @Embedded
    private InputModel inputModel;

//    @ManyToOne
//    @JoinColumn(name = "row_id", nullable = false)
//    @JsonIgnore
//    private Columns columns;

}
