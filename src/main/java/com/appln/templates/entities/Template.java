package com.appln.templates.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "TemplateDetails")
@Getter
@Setter
public class Template {

    @Id
    private String templateId;
    @Column(nullable = false)
    private String templateName;
    @Column(nullable = false)
    private String templateDescription;
    @Column(nullable = false)
    private LocalDateTime createdAt;
    @Column(nullable=false)
    private LocalDateTime startedTimeStamp;
}
