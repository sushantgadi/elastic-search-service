package com.sushant.elasticsearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "member_index")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {

    @Id
    private int id;
    private String firstName;
    private String lastName;
    private int age;
}
