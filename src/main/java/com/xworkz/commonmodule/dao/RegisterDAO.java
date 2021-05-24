package com.xworkz.commonmodule.dao;

import com.xworkz.commonmodule.entity.RegisterEntity;

public interface RegisterDAO {

	public  Integer save(RegisterEntity entity);

	public RegisterEntity getByEmailId(String email);
}
