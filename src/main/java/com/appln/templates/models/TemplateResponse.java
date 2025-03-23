package com.appln.templates.models;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TemplateResponse {
    private String message;
    private String templateId;
    private String templateName;
    private LocalDateTime createdAt;


}
