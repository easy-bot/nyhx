/**
 * 
 */
package com.nyhx.jjc.Service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nyhx.jjc.Dao.StudentDao;
import com.nyhx.jjc.Entity.Student;

/**
 * @author 深巷明朝
 * <p>Description: </p>
 * @date 2020年9月21日
 */
@Service
public class StudentService {
	
	@Resource
	private StudentDao studentDao;
	
	public Student findByUid(String uid) {
		Student student = new Student();
		student = studentDao.findByUid(uid);
		return student;
	}
	
	public Student findByName(String name) {
		Student student = new Student();
		student = studentDao.findByName(name);
		return student;
	}
	
	public Student findByRace(String race) {
		Student student = new Student();
		student = studentDao.findByRace(race);
		return student;
	}
	
	public void insertStudent(Student student) {
		studentDao.save(student);
	}
}
