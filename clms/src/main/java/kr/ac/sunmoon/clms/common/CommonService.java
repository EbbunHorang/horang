package kr.ac.sunmoon.clms.common;

import javax.servlet.http.HttpSession;

import kr.ac.sunmoon.clms.account.Account;

public interface CommonService {
	public boolean login(HttpSession session, Account account);
	public void logout(HttpSession session);
}
