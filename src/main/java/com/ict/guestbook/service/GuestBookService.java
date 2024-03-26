package com.ict.guestbook.service;

import java.util.List;

import com.ict.guestbook.dao.GuestBookVO;

public interface GuestBookService {
	// 리스트
	public List<GuestBookVO> getGuestBookList();
	
	// 삽입
	public int getGuestBookInsert(GuestBookVO gvo);
	
	// 상세보기
	public GuestBookVO getGuestBookDetail(String idx);
	
	// 삭제
	public int getGuestBookDelete(String idx);
	
	// 삽입
	public int getGuestBookUpdate(GuestBookVO gvo);
	
}
