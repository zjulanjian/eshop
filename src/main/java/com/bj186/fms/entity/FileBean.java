package com.bj186.fms.entity;

import org.springframework.web.multipart.MultipartFile;

public class FileBean {

    private MultipartFile file;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "FileBean{" +
                "file=" + file +
                '}';
    }
}

