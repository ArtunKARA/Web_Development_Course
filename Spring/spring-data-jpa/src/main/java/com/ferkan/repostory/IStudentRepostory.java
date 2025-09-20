package com.ferkan.repostory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ferkan.dto.DtoStudent;
import com.ferkan.entites.Student;


@Repository
public interface IStudentRepostory extends JpaRepository<Student, Integer>{
	
	
	
	//HQL:  sınıfın ismi ve değişken isimleri kullanılarak sorgu yazılır
	//SQL:  tablo ismi ve tablo sütun isimleri kullanılarak sorgu yazılır
	
	//HQL
	@Query(value = "select firstName, lastName from Student s where s.id=:studentId", nativeQuery = false)
	List<DtoStudent> allStudentsWithHQL(Integer studentId);
	//SQL
	@Query(value = "select first_name, last_name from student", nativeQuery = true)
	List<DtoStudent> allStudentsWithSQL();

}
