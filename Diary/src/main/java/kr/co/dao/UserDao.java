package kr.co.dao;

import kr.co.vo.UserVo;

public interface UserDao {
	
	//회원가입
	public void insertUser(UserVo userVo);
	
}