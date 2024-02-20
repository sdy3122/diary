package kr.co.dao;

import kr.co.vo.UserVo;

public interface UserDao {

	// 회원가입
	public void insertUser(UserVo userVo);

	// 아이디 중복
	public int dupId(String userId);

	// 닉 중복
	public int dupNick(String userNick);

	// 이메일 중복
	public int dupEmail(String userEmail);
}