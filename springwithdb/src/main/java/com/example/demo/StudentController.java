package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
@Autowired
	StudentDAO dao;
	
@RequestMapping("insert")
public ModelAndView insert(HttpServletRequest req,HttpServletResponse res)
{
	ModelAndView mv=new ModelAndView();
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	Student s=new Student();
	s.setName(name);
	s.setEmail(email);
	Student ss=dao.insert(s);
	if(ss!=null) {
		mv.setViewName("status");
	}
	return mv;
}


@RequestMapping("getall")
public ModelAndView get(HttpServletRequest req,HttpServletResponse res)
{
	ModelAndView mv=new ModelAndView();
	List<Student> s=dao.getall();
	mv.setViewName("display");
	mv.addObject("list",s);
	return mv;
}
}