package kr.co.vo;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.Data;

@Data
public class UserVo {
	
	private int userNo; // 번호
	private String userId; // 아이디
	private String userPw; // 비밀번호
	private String userNick; // 닉네임
	private String userName; // 이름
	private int userRegNo; // 주민번호
	private String userEmail; // 이메일
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date userRegDate; // 가입날짜
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date userLastDate; // 마지막 로그인
	
}