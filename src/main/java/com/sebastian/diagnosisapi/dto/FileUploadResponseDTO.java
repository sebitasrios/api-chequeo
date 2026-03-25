package com.sebastian.diagnosisapi.dto;

public class FileUploadResponseDTO {
    private String fileName;
    private String fileType;
    private Long fileSize;
    private String message;

    public String getFileName() { return fileName; }
    public void setFileName(String fileName) { this.fileName = fileName; }

    public String getFileType() { return fileType; }
    public void setFileType(String fileType) { this.fileType = fileType; }

    public Long getFileSize() { return fileSize; }
    public void setFileSize(Long fileSize) { this.fileSize = fileSize; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
