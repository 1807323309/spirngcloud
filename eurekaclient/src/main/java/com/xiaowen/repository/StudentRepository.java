package com.xiaowen.repository;

import com.xiaowen.entity.Student;

import java.util.Collection;

public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void delteById(long id);
}
