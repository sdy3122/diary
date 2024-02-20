package kr.co.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dao.UserDao;
import kr.co.vo.UserVo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;

	// 회원가입
	@Override
	public void insertUser(UserVo userVo) {
		dao.insertUser(userVo);
	}

	// 아이디 중복
	@Override
	public boolean dupId(String userId) {
		return dao.dupId(userId) > 0;
	}

	// 닉 중복
	@Override
	public boolean dupNick(String userNick) {
		return dao.dupNick(userNick) > 0;
	}

	// 이메일 중복
	@Override
	public boolean dupEmail(String userEmail) {
		return dao.dupEmail(userEmail) > 3;
	}

}