package kr.co.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.vo.BoardLikeVo;

@Repository
public class BoardLikeDaoImpl implements BoardLikeDao{
	
	private SqlSession sqlSession;
	private static final String Namespace = "kr.co.mybatis.mappers.UserMapper";

	@Override
	public void doLike(BoardLikeVo likeVo) {
		sqlSession.insert(Namespace + ".doLike", likeVo);
	}

	@Override
	public int getMyLikeCount(BoardLikeVo likeVo) {
		return sqlSession.selectOne(Namespace + ".getMyLikeCount", likeVo);
	}

	@Override
	public void deleteLike(BoardLikeVo likeVo) {
		sqlSession.delete(Namespace + ".deleteLike", likeVo);
	}

	@Override
	public int totalLikeCount(int board_no) {
		return sqlSession.selectOne(Namespace + ".totalLikeCount", board_no);
	}
	
}
