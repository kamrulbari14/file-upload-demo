package com.demo.document.service;

import com.demo.document.dto.Response;
import org.springframework.web.multipart.MultipartFile;

public interface DocumentService {
    Response createDocument(String docName, MultipartFile multipartFile);
}
