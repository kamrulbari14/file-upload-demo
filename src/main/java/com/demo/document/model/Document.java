package com.demo.document.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Document extends BaseModel {
    private String documentName;
    private String documentLocation;
}
