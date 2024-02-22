package kr.co.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.domain.LoginDto;
import kr.co.domain.UserVo;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SqlSession sqlSession;
	private static final String Namespace = "kr.co.mybatis.mappers.UserMapper";

	// 회원가입
	@Override
	public void insertUser(UserVo userVo) {
		sqlSession.insert(Namespace + ".insertUser", userVo);
	}

	// 아이디 중복
	@Override
	public int dupId(String userId) {
		return sqlSession.selectOne(Namespace + ".dupId", userId);
	}

	// 닉 중복
	@Override
	public int dupNick(String userNick) {
		return sqlSession.selectOne(Namespace + ".dupNick", userNick);
	}

	// 이메일 중복
	@Override
	public int dupEmail(String userEmail) {
		return sqlSession.selectOne(Namespace + ".dupEmail", userEmail);
	}
	// 로그인
	@Override
	public UserVo selectByIdAndPw(LoginDto loginDto) {
		return sqlSession.selectOne(Namespace + ".selectByIdAndPw", loginDto);
	}

}