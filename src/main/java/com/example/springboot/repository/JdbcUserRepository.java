package com.example.springboot.repository;

import com.example.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcUserRepository implements UserRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(User user) {
        return jdbcTemplate.update("INSERT INTO users (username, password, description, registered_at) VALUES (?, ?, ?, GETDATE())", new Object[] {
                user.getUsername(),
                user.getPassword(),
                user.getDescription()
        });
    }

    @Override
    public int update(User user) {
        return jdbcTemplate.update("UPDATE users SET username = ?, password = ?, description = ? WHERE id = ?", new Object[] {
                user.getUsername(),
                user.getPassword(),
                user.getDescription(),
                user.getId()
        });
    }

    @Override
    public User findById(Long id) {
        try {
            return jdbcTemplate.queryForObject("SELECT * FROM users WHERE id = ?", BeanPropertyRowMapper.newInstance(User.class), id);
        } catch(IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    @Override
    public int deleteById(Long id) {
        return jdbcTemplate.update("DELETE FROM users WHERE id=?", id);
    }

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query("SELECT * from users", BeanPropertyRowMapper.newInstance(User.class));
    }

    @Override
    public User findByUsername(String username) {
        return jdbcTemplate.queryForObject("SELECT * from users WHERE username = ?",
                BeanPropertyRowMapper.newInstance(User.class), username);
    }

    @Override
    public int deleteAll() {
        return jdbcTemplate.update("DELETE from users");
    }
}
