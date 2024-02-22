package kr.co.domain;

import lombok.Data;

@Data
public class LoginDto {
	private String userId;
	private String userPw;
	private boolean keepCookie;
	private boolean saveCookie;
}
