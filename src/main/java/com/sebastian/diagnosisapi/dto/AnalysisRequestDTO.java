package com.sebastian.diagnosisapi.dto;

import lombok.Data;

@Data
public class AnalysisRequestDTO {
    private String projectName;
    private String description;
    private String analysisType;
}