package com.ict.guestbook2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.guestbook2.dao.DAO;
import com.ict.guestbook2.dao.VO;

@Service
public class GuestBook2ServiceImpl implements GuestBook2Service {

	@Autowired
	private DAO dao;
	
	@Override
	public List<VO> getGuestBook2List() {
		return dao.getGuestBook2List();
	}

	@Override
	public VO getGuestBook2Detail(String idx) {
		return dao.getGuestBook2Detail(idx);
	}

	@Override
	public int getGuestBook2Insert(VO vo) {
		return dao.getGuestBook2Insert(vo);
	}

	@Override
	public int getGuestBook2Delete(String idx) {
		return dao.getGuestBook2Delete(idx);
	}

	@Override
	public int getGuestBook2Update(VO vo) {
		return dao.getGuestBook2Update(vo);
	}
	
}
