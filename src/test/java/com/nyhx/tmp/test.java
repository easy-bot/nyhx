/**
 * 
 */
package com.nyhx.tmp;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.rmi.server.UID;

import javax.annotation.Resource;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.injector.methods.SelectOne;
import com.nyhx.jjc.Entity.Student;
import com.nyhx.jjc.Service.StudentService;
import com.nyhx.tools.HttpRequest;

/**
 * @author 深巷明朝
 * <p>Description: </p>
 * @date 2020年9月18日
 */
public class test {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
//		Student student = new Student();
//		student.setCollege("P");
//		student.setColNum(1);
//		student.setName("楠");
//		student.setRace("小熊猫");
//		student.setRare(7);
//		String url = "http://localhost:3232/nyhx/student/insertStudent";
//		String param = "student=" + JSONObject.toJSONString(student);
//		HttpRequest.sendPost(url, param);
		System.out.println(selectOne("楠"));
//		System.out.println(testConnection());
	}
	
	public static String testConnection() {
		String url = "http://127.0.0.1:3232/nyhx/student/test";
		return HttpRequest.sendPost(url, "name=寤寐&testNum=12a");
	}
	
	public static String selectOne(String name) {
		String url = "http://127.0.0.1:3232/nyhx/student/selectOne";
		return HttpRequest.sendGet(url, "uid="+"4028b88174af9a1c0174afb308fb0000");
	}
	
}
