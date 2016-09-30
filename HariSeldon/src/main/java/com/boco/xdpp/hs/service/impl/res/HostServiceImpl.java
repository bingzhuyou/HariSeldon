package com.boco.xdpp.hs.service.impl.res;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boco.xdpp.hs.service.res.HostService;


@Service
@Transactional()
public class HostServiceImpl implements HostService {

//	@Autowired
//	private AccountDao accountDao;


	@Override
	public String readJson() {
		return "";
	}
}