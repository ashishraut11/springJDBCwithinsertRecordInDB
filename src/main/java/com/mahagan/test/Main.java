package com.mahagan.test;

import com.mahagan.dao.ProjectDeo;
import com.mahagan.domain.Project;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application-context.xml");
        ProjectDeo projectDeo =applicationContext.getBean("projectDao",ProjectDeo.class);
        Project project=new Project();
        project.setProjectNo(3);
        project.setTitle("clg related");
        project.setDescription("Collage");
        project.setDuration(30);
        project.setStatus("Test");
        System.out.println(projectDeo.insertProjects(project));
    }
}