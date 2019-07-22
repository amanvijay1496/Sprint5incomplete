package com.cg.flightreservationsystem.service;

import java.util.Date;
import java.util.List;

import com.cg.flightreservationsystem.entity.UserEntity;
import com.cg.flightreservationsystem.exception.FRSException;

public interface UserAuthenticationService {

	public boolean login(UserEntity user) throws FRSException;
	public boolean addLoginTimestamp(String username, Date inTime, Date outTime) throws FRSException;
	public List<Long> viewLoginDetail(String date);
	
}
