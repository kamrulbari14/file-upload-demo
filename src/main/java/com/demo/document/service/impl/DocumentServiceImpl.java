package com.demo.document.service.impl;

import com.demo.document.dto.Response;
import com.demo.document.repository.DocumentRepository;
import com.demo.document.service.DocumentService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DocumentServiceImpl implements DocumentService {

    private final DocumentRepository documentRepository;

    public DocumentServiceImpl(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @Override
    public Response createDocument(String docName, MultipartFile multipartFile) {
        return null;
    }
}
