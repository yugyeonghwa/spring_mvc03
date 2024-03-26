package com.ict.guestbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.guestbook.dao.GuestBookDAO;
import com.ict.guestbook.dao.GuestBookVO;

@Service
public class GuestBookServiceImpl implements GuestBookService {
	@Autowired
	private GuestBookDAO guestBookDAO;

	@Override
	public List<GuestBookVO> getGuestBookList() {
		return guestBookDAO.getGuestBookList();
	}

	@Override
	public int getGuestBookInsert(GuestBookVO gvo) {
		return guestBookDAO.getGuestBookInsert(gvo);
	}

	@Override
	public GuestBookVO getGuestBookDetail(String idx) {
		return guestBookDAO.getGuestBookDetail(idx);
	}

	@Override
	public int getGuestBookDelete(String idx) {
		return guestBookDAO.getGuestBookDelete(idx);
	}

	@Override
	public int getGuestBookUpdate(GuestBookVO gvo) {
		return guestBookDAO.getGuestBookUpdate(gvo);
	}

}
