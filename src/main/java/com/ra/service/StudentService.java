package com.ra.service;

import com.ra.entity.StudentEntity;
import com.ra.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;


    public List<StudentEntity> showAll(){
        return studentRepository.findAll();
    }

    public StudentEntity add(StudentEntity studentEntity){
        return studentRepository.save(studentEntity);
    }

    public StudentEntity update(StudentEntity studentEntity){
        return studentRepository.save(studentEntity);
    }

    public void delete(int id){
        studentRepository.deleteById(id);
    }

    public StudentEntity findID(int id){
        return studentRepository.findById(id).orElse(null);
    }
}
