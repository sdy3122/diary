package kr.co.dao;

import kr.co.domain.BoardLikeVo;

public interface BoardLikeDao {
	public void doLike(BoardLikeVo likeVo); // 좋아요
	public int getMyLikeCount(BoardLikeVo likeVo); // 좋아요 t or f
	public void deleteLike(BoardLikeVo likeVo); // 좋아요 취소
	public int totalLikeCount(int board_no); // 해당 게시글 총 좋아요
}
