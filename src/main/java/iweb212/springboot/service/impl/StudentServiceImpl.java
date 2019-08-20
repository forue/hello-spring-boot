package iweb212.springboot.service.impl;

import iweb212.springboot.dao.StudentDao;
import iweb212.springboot.model.Student;
import iweb212.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;
    @Override
    public List<Student> findAllStudent() {
        return studentDao.findAllStudent();
    }
}
