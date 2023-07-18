package dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import models.*;
@Transactional
public class EmpDAO {

	@Autowired
	HibernateTemplate template;
	
	public List<Emp> getAll()
	{
		return template.loadAll(Emp.class);
	}
	
	public void save(Emp e)
	{
	    template.save(e);
	}
	
	public Emp getEmp(int empid)
	{
		return template.load(Emp.class, empid);
	}
	
	
}
