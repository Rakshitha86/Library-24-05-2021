package com.xworkz.commonmodule.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.commonmodule.dao.RegisterDAO;
import com.xworkz.commonmodule.dto.RegisterDTO;
import com.xworkz.commonmodule.entity.RegisterEntity;

@Component
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterDAO dao;

	private Logger logger;

	public RegisterServiceImpl() {
		logger = Logger.getLogger(getClass());
	}

	@Override
	public String validateAndSave(RegisterDTO dto) {
		logger.info("inside {}");
		RegisterEntity entity = new RegisterEntity();
		try {
			RegisterEntity emailId = dao.getByEmailId(dto.getEmailid());
			if (emailId == null) {
				BeanUtils.copyProperties(dto, entity);
				entity.setRegisteredBy("Rakshitha");
				LocalDateTime dateTime = LocalDateTime.now();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
				String date = formatter.format(dateTime);
				entity.setRegisteredDate(date);
				int affectedRows = dao.save(entity);
				if (affectedRows > 0) {
					logger.info("successful");
					return "user registered successfully";
				} else {
					logger.info("not successful");
					return "user not regestered";
				}

			} else {
				logger.info("already exist");
				return "user already exist";
			}
		} catch (Exception e) {

			logger.error("You have exception in {} " + e.getMessage(), e);
		}
		return "";
	}
}