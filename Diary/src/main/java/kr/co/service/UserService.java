package kr.co.service;

import kr.co.vo.UserVo;

public interface UserService {
	// 회원가입
	public void insertUser(UserVo userVo);

	// 아이디 중복
	public boolean dupId(String userId);

	// 닉 중복
	public boolean dupNick(String userNick);

	// 이메일 중복
	public boolean dupEmail(String userEmail);
}