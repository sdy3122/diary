package kr.co.domain;

import lombok.Data;

@Data
public class SuggestVo {
	long bno;
	String writer;
	long registNumber;
	String title;
	String content;
	long likeBtn;
	String regdate;
}