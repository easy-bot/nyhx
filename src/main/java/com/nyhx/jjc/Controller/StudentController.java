/**
 * 
 */
package com.nyhx.jjc.Controller;

import javax.ws.rs.FormParam;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.nyhx.jjc.Dao.StudentDao;
import com.nyhx.jjc.Entity.Student;
import com.nyhx.jjc.Service.StudentService;

import junit.framework.Test;

/**
 * @author 深巷明朝
 * <p>Description: </p>
 * @date 2020年9月18日
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping(path = "/test")
	public String Test(@FormParam("testNum") String testNum) {
		return "无问题，已成功连接项目,传递参数是"+testNum;
	}
	
	@GetMapping(path = "/selectOne")
	public String selectAll(@QueryParam("uid") String uid,@QueryParam("name") String name,@QueryParam("race") String race) {
		try {
			Student student = new Student();
			if (uid != null && !uid.equals("")) {
				student = studentService.findByUid(uid);
			}else if (name != null  && !name.equals("")) {
				student = studentService.findByName(name);
			}else if (race != null  && !race.equals("")) {
				student = studentService.findByRace(race);
			}else {
				return "请输入学员uid或名字";
			}
			return "success : "+student.getName()+" ";
		} catch (Exception e) {
			// TODO: handle exception
			return "false";
		}
	}
	
	@PostMapping(path = "/insertStudent")
	public String insertStudent(@FormParam("student") String student) {
		try {
			Student stu = new Student();
			stu = JSONObject.parseObject(student,Student.class);	//字符串转对象
			studentService.insertStudent(stu);
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			return "false";
		}
	}
}
