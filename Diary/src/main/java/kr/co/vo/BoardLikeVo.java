package kr.co.vo;

import lombok.Data;

@Data
public class BoardLikeVo {
	private int	like_no; // 좋아요 번호
	private int board_no; // 좋아요 게시글번호
	private int user_no; // 유저 번호
	private int user_regist; // 유저 주민등록번호
	private int like_date; // 좋아요 날짜
}
