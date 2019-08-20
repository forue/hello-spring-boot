package iweb212.springboot.service;

import iweb212.springboot.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudent();
}
