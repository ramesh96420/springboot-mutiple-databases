package com.springboot.api.model.book;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Data
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Book_Details")
public class Book {
    @Id
    private int id;
    private String name;


}
