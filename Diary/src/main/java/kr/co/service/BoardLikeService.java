package kr.co.service;

import kr.co.domain.BoardLikeVo;

public interface BoardLikeService {
	public void doLike(BoardLikeVo likeVo);
	public int getMyLikeCount(BoardLikeVo likeVo);
	public int totalLikeCount(int board_no);
}
