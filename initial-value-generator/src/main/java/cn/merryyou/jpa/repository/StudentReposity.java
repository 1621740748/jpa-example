package cn.merryyou.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.merryyou.jpa.domain.Student;

public interface StudentReposity extends  JpaRepository<Student, Long>{

}
