package com.master.registre.serviceImp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.master.registre.dao.IDao;
import com.master.registre.entity.Employee;
import com.master.registre.isevice.IService;

@Service
@Transactional
public class EmployeeService implements IDao<Employee> {

	private IService service;
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	public EmployeeService(IService service) {
		this.service = service;
	}

	@Override
	public List<Employee> findAll() {
		return service.findAll();
	}

	@Override
	public Employee findById(long id) {
		return service.findById(id).get();
	}

	@Override
	public Employee findByEmail(String email) {
		return (Employee) sessionFactory.openSession().createQuery("from Employee where email =:email").setParameter("email", email).list().get(0);
	}

	@Override
	public void save(Employee p) {
		service.save(p);
	}

	@Override
	public void update(Employee p) {
	}

	@Override
	public void delete(Employee p) {
		service.delete(p);
	}

}
