package com.appln.templates.repository;


import com.appln.templates.entities.Template;
import com.appln.templates.models.TemplateResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplateRepository extends JpaRepository<Template, String> {


}
