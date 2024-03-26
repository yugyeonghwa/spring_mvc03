package com.ict.guestbook.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GuestBookDAO {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<GuestBookVO> getGuestBookList() {
		try {
			return sqlSessionTemplate.selectList("guestbook.list");
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	public int getGuestBookInsert(GuestBookVO gvo) {
		try {
			return sqlSessionTemplate.insert("guestbook.insert", gvo);
		} catch (Exception e) {
			System.out.println(e);
		}
		return -1;
	}
	
	public GuestBookVO getGuestBookDetail(String idx) {
		try {
			return sqlSessionTemplate.selectOne("guestbook.detail", idx);
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	public int getGuestBookDelete(String idx) {
		try {
			return sqlSessionTemplate.delete("guestbook.delete", idx);
		} catch (Exception e) {
			System.out.println(e);
		}
		return -1;
	}
	
	public int getGuestBookUpdate(GuestBookVO gvo) {
		try {
			return sqlSessionTemplate.update("guestbook.update", gvo);
		} catch (Exception e) {
			System.out.println(e);
		}
		return -1;
	}
	
}
