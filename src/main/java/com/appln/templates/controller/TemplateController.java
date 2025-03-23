package com.appln.templates.controller;

import com.appln.templates.entities.Template;
import com.appln.templates.models.TemplateRequest;
import com.appln.templates.models.TemplateResponse;
import com.appln.templates.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class TemplateController {

    @Autowired
    TemplateService templateService;

    @PostMapping("template")
    public ResponseEntity<TemplateResponse> saveTemplates(@RequestBody TemplateRequest templateRequest){

        TemplateResponse response = templateService.createTemplate(templateRequest);
        return ResponseEntity.ok(response);
    }

    @GetMapping("templates/{templateId}")
    public ResponseEntity<Optional<Template>> getTemplate(@PathVariable String templateId){
        Optional<Template> template = templateService.getTemplateById(templateId);
        return ResponseEntity.ok(template);
    }

    @PutMapping("template/{templateId}")
    public ResponseEntity<String> updateTemplateById(@PathVariable String templateId, @RequestBody TemplateRequest templateRequest){
        templateService.updateTemplateById(templateId, templateRequest);
        return ResponseEntity.ok("Successfully updated");
    }

    @DeleteMapping("templates/{templateId}")
    public ResponseEntity<String> deleteTemplate(@PathVariable String templateId){
        templateService.deleteTemplateById(templateId);
        return ResponseEntity.ok("delete Success");
    }

// 1. create endpoint for put request to update email template name
    //2. create an endpoint for delete request to delete by id
    //3. add at least 10-15 records
    // * new fields in template for tomorrow's class

}
