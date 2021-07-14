package com.quickapply.quickapply.models;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.List;


@Embeddable
public class InputModel {

    private Long id;
    private String label;
    private String name;
    private boolean required;
    private String input_type;
    @Embedded
    private List<CheckBoxModel> checkbox_options;
    @Embedded
    private List<CheckBoxModel> radio_options;
}
