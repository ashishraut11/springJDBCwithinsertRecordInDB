package com.mahagan.dao;

import com.mahagan.domain.Project;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class ProjectDeo {
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public ProjectDeo(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }
    private final String SQL_FOR_PROJECT="INSERT INTO PROJECT VALUES(:projectNo,:title,:description,:duration,:status)";
    public int insertProjects(Project Project){
        MapSqlParameterSource parameterSource= new MapSqlParameterSource();
        parameterSource.addValue("projectNo",Project.getProjectNo());
        parameterSource.addValue("title",Project.getTitle());

        parameterSource.addValue("description",Project.getDescription());
        parameterSource.addValue("duration",Project.getDuration());
        parameterSource.addValue("status",Project.getStatus());
        int rowCount =namedParameterJdbcTemplate.update(SQL_FOR_PROJECT,parameterSource);
        return rowCount;
    }
}
