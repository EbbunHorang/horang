package kr.ac.sunmoon.clms.common;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.sunmoon.clms.account.Account;
import kr.ac.sunmoon.clms.account.AccountMapper;

@Service
public class CommonServiceImpl implements CommonService {
	@Autowired
	private AccountMapper accountMapper;
	
	@Override
	public boolean login(HttpSession session, Account account) {
		Account user = this.accountMapper.select(account.getId());
		
		boolean isSuccess = false;
		if (user != null) {
			// 비밀번호가 일치하는지 확인
			if (account.getPassword().equals(user.getPassword())) {
				isSuccess = true;
				
				session.setAttribute("isLogin", user.getId());
				session.setAttribute("authority", user.getAuthority());
			}
		}
		
		return isSuccess;
	}

	@Override
	public void logout(HttpSession session) {
		if (session.getAttribute("isLogin") != null) {
			session.invalidate();
		}
	}
}
