package com.appln.templates.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
public class TemplateRequest {

    private String templateId;
    private String templateName;
    private String templateDescription;
    private LocalDateTime createdAt;


}
