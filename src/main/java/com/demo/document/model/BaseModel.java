package com.demo.document.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(updatable = false)
    private Long createdBy;
    @Column(updatable = false)
    private LocalDateTime createdAt;
    private Long updatedBy;
    private LocalDateTime updateAt;
    private Boolean activeStatus;

    @PrePersist
    public void setPreInsertData() {
        this.createdAt = LocalDateTime.now();
        this.activeStatus = true;
    }

    @PreUpdate
    public void setPreUpdateData() {
        this.updateAt = LocalDateTime.now();
    }
}
