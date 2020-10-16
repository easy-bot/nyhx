/**
 * 
 */
package com.nyhx.jjc.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nyhx.jjc.Entity.Student;

/**
 * @author 深巷明朝
 * <p>Description: </p>
 * @date 2020年9月18日
 */
public interface StudentDao extends CrudRepository<Student, Long>{
	/**
   	* 如果涉及到了update、delete或insert, 则需要添加@Modifying 和 @Transactional。
   	* nativeQuery为false（默认）时使用的是JPQL，如果使用JPQL，则下面的sql需要改为：
   	* <code>select u.uid, u.uname, u.sex from #{#entityName} where u.sex = ?1</code>
   	*/
   	@Transactional
    @Query(value = "select * from student where uid = ?1", nativeQuery = true)
	public Student findByUid(String uid);
   	
   	public Student findByName(String name);
   	
   	public Student findByRace(String race);
   	
//   	@Transactional
//    @Modifying
//    @Query(value = "select * from user where uid = ?1", nativeQuery = true)
//   	public String insertStudent(Student student);
}
