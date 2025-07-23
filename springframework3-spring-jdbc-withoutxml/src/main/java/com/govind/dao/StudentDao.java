package com.govind.dao;

import com.govind.model.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDao implements IStudentDao {

    @Autowired
    private JdbcTemplate template;

    @Override
    public int insert(Student student) {
        String sql = "insert into student(name, city) values(?, ?)";
        int result = this.template.update(sql, student.getName(), student.getCity());
        return result;
    }

    @Override
    public int change(Student student) {
        String sql = "update student set name=?, city=? where id=?";
        int result = template.update(sql, student.getName(), student.getCity(), student.getId());
        return result;
    }

    @Override
    public int deleteById(int id) {
        String sql = "delete from student where id=?";
        int result = template.update(sql, id);
        return result;
    }

    @Override
    public Student getStudentById(int id) {
        String sql = "select * from student where id=?";

        Student student = this.template.queryForObject(sql, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Student(rs.getInt("id"), rs.getString("name"), rs.getString("city"));
            }
        }, id);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        String sql = "select * from student";

        List<Student> students = this.template.query(sql, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Student(rs.getInt("id"), rs.getString("name"), rs.getString("city"));
            }
        });
        return students;
    }
}
