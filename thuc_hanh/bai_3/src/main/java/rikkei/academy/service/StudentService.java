package rikkei.academy.service;

import org.springframework.stereotype.Service;
import rikkei.academy.model.Student;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
	
	private List<Student> list;
	
	public StudentService() {
		list = new ArrayList<>();
		list.add(new Student(1,"binh","hà nội",false));
		list.add(new Student(2,"phu","hà nội",false));
		list.add(new Student(3,"tu","hà nội",false));
	}
	
	public List<Student> findAll() {
		return list;
	}
	
	public void save(Student student) {
		if(findById(student.getId()) == null) {
			student.setId(getNewId());
			list.add(student);
		} else {
			list.set(list.indexOf(findById(student.getId())),student);
		}
	}
	
	public void delete(int id) {
		list.remove(findById(id));
	}
	
	public Student findById(int id) {
		for (Student s:list) {
			if(s.getId() == id) {
				return s;
			}
		}
		return null;
	}
	
	public int getNewId() {
		int idMax = 0;
		for (Student s:list) {
			if(s.getId() > idMax) {
				idMax = s.getId();
			}
		}
		return idMax + 1;
	}
	
}
