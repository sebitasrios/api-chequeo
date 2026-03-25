package com.sebastian.diagnosisapi.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class AnalysisResponseDTO {
    private Long id;
    private String projectName;
    private String analysisType;
    private String status;
    private LocalDateTime createdAt;
}