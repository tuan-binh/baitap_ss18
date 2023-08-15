package rikkei.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import rikkei.academy.model.Student;
import rikkei.academy.service.StudentService;

import java.util.List;

@Controller
@RequestMapping("/")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping
	public ModelAndView home() {
		List<Student> list = studentService.findAll();
		return new ModelAndView("home","data",list);
	}
	
	@GetMapping("edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		System.out.println(id);
		Student student = studentService.findById(Integer.parseInt(String.valueOf(id)));
		return new ModelAndView("edit","data",student);
	}
	
	@PostMapping("update")
	public String update(@ModelAttribute Student student) {
		studentService.save(student);
		return "redirect:/";
	}
	
	@GetMapping("delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		studentService.delete(Integer.parseInt(String.valueOf(id)));
		return "redirect:/";
	}
	
	@GetMapping("add")
	public String add() {
		return "add";
	}
	
	@PostMapping("add")
	public String addStudent(Student student) {
		studentService.save(student);
		return "redirect:/";
	}
	
}
