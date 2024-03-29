package com.demo.springcloud.service.impl;

import java.util.List;

import com.css.springcloud.microservicecloudapi.entity.Dept;
import com.demo.springcloud.dao.DeptDao;
import com.demo.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService
{
	@Autowired
	private DeptDao deptDao;
	
	@Override
	public boolean add(Dept dept)
	{
		return deptDao.addDept(dept);
	}

	@Override
	public Dept get(Long id)
	{
		return deptDao.findById(id);
	}

	@Override
	public List<Dept> list()
	{
		return deptDao.findAll();
	}

}
