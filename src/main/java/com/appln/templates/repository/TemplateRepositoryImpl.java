package com.appln.templates.repository;

import com.appln.templates.entities.Template;

import java.util.Optional;

public class TemplateRepositoryImpl implements TemplateRepositoryCustom {


    @Override
    public Optional<Template> findByTemplateName(String templateName) {
        return Optional.empty();
    }
}
