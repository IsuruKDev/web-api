package com.synergen.techlabs.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("products")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Product {

    @Id
    private String id;

    @Indexed(name="prodName")
    private String name;

    private String description;


}
