package cn.merryyou.jpa.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;

import cn.merryyou.jpa.domain.Student;
import lombok.extern.slf4j.Slf4j;

/**
 * Created on 2018/3/2.
 *
 * @author zlf
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class StudentRepositoryTest {

    @Autowired
    private StudentReposity studentRepository;

    @Test
    public void testSave(){
    	Student s=new Student();
    	s.setStudentId(1L);
    	s.setAge(10);
    	s.setName("hy");
    	studentRepository.save(s);
    }
    @Test
    public void testFind(){
    	Student s=studentRepository.findOne(1L);
    	System.out.println(JSON.toJSONString(s));
    	
    }
}