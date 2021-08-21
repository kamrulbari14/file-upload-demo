package com.demo.document.repository;

import com.demo.document.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
    Document findByIdAndActiveStatusTrue(Long id);
    Integer countByDocumentLocation(String location);
}
