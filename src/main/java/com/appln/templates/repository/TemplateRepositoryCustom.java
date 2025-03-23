package com.appln.templates.repository;

import com.appln.templates.entities.Template;

import java.util.Optional;

public interface TemplateRepositoryCustom {

    Optional<Template> findByTemplateName(String templateName);
}
