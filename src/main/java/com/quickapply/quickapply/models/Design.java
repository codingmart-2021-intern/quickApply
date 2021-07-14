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
    private String terms;
    private String policies;
    private boolean signature_enabled;

    @OneToMany(mappedBy = "design")
//    @JoinColumn(name = "section_id",referencedColumnName = "sectionId")
    private List<Sections> sections;

}
