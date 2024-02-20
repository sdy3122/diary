package kr.co.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.vo.UserVo;

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

}