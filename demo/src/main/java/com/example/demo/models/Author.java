package com.example.demo.models;

import lombok.*;
import org.apache.ibatis.annotations.Param;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Author {

    private Integer author_id;
    private String name;
    private String nationality;
}
