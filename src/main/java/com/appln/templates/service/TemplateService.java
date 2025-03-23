package com.appln.templates.service;

import com.appln.templates.entities.Template;
import com.appln.templates.models.TemplateRequest;
import com.appln.templates.models.TemplateResponse;
import com.appln.templates.repository.TemplateRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
public class TemplateService {

    TemplateRepository templateRepository;

    public TemplateService(TemplateRepository templateRepository1){this.templateRepository = templateRepository1;}

    @Transactional
    public TemplateResponse createTemplate(TemplateRequest templateRequest){

        Template template = new Template();
        UUID uniqueId = UUID.randomUUID();
        template.setTemplateId(uniqueId.toString());
        template.setTemplateName(templateRequest.getTemplateName());
        template.setTemplateDescription(templateRequest.getTemplateDescription());
        template.setCreatedAt(LocalDateTime.now());
        System.out.println("Created Time: "+template.getCreatedAt());
        templateRepository.save(template);
        TemplateResponse templateResponse = new TemplateResponse();
        templateResponse.setMessage("Save Success");
        templateResponse.setTemplateId(template.getTemplateId());
        templateResponse.setTemplateName(template.getTemplateName());
        templateResponse.setCreatedAt(template.getCreatedAt());
        return templateResponse;

    }

    public Optional<Template> getTemplateById(String templateId) {
        return templateRepository.findById(templateId);
    }

    @Transactional
    public void updateTemplateById(String templateId, TemplateRequest templateRequest) {

        Optional<Template> optionalTemplate = templateRepository.findById(templateId);
        if(optionalTemplate.isPresent()){
            Template template = optionalTemplate.get();
            template.setTemplateDescription(templateRequest.getTemplateDescription());
            templateRepository.save(template);
        } else{
            throw new RuntimeException("Template not found");
        }
    }



    public void deleteTemplateById(String templateId){

        templateRepository.deleteById(templateId);
    }
}
