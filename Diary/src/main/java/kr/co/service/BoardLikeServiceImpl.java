package kr.co.service;

import org.springframework.stereotype.Service;

import kr.co.vo.BoardLikeVo;

@Service
public class BoardLikeServiceImpl implements BoardLikeService{

	@Override
	public void doLike(BoardLikeVo likeVo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getMyLikeCount(BoardLikeVo likeVo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalLikeCount(int board_no) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
