package com.quickapply.quickapply.models;

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
public class Design {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long designId;
    private String title;
    private String email;
    private String details;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "design_id", referencedColumnName = "designId")
    private List<Sections> sections;

}
