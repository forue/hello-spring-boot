package iweb212.springboot.dao;

import iweb212.springboot.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentDao {

    List<Student> findAllStudent();
    Student findById(int sid);
    void insertStudent(Student student);
}
