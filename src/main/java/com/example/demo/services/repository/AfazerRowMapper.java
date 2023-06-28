package com.example.demo.services.repository;

import com.example.demo.entities.Afazer;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AfazerRowMapper implements RowMapper<Afazer> {

    @Override
    public Afazer mapRow(ResultSet rs, int rowNum) throws SQLException {
        Afazer afazer = new Afazer();
        afazer.setId(rs.getLong("id"));
        afazer.setDescricao(rs.getString("descricao"));
        afazer.setConcluido(rs.getBoolean("concluido"));
        return afazer;
    }
}

