package com.xworkz.commonmodule.service;

import com.xworkz.commonmodule.dto.RegisterDTO;

public interface RegisterService {
	
	public String validateAndSave(RegisterDTO dto);
}
