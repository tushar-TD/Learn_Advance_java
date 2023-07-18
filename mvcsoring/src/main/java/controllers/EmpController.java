package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.EmpDAO;
import models.Emp;

@Controller
public class EmpController {
	
	@Autowired
	EmpDAO edao;
	
	@RequestMapping("/all")
	public ModelAndView getAll()
	{
		List<Emp> emplist = edao.getAll();
		return new ModelAndView("all","emplist",emplist);
		
	}
	
	@RequestMapping("/insert")
	public ModelAndView showform()
	{
		return new ModelAndView("empform","nemp",new Emp());
	}
	
	@RequestMapping("/save")
	public ModelAndView save(@ModelAttribute("nemp") Emp e)
	{
		 edao.save(e);
		 int empid=e.getEmpid();
		return new ModelAndView("success","new_empid",empid);
		
	}
	@RequestMapping("/edit")
	public ModelAndView edit(@RequestParam("empid") int eid)
	{
		Emp e = edao.getEmp(eid);
		return new ModelAndView("edit","edit_emp",e);
	}

}
