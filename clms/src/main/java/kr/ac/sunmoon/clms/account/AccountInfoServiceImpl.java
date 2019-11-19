package kr.ac.sunmoon.clms.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountInfoServiceImpl implements AccountInfoService {
	@Autowired
	private AccountMapper accountMapper;
	
	@Override
	public List<Account> list() {
		return this.accountMapper.selectAll();
	}

	@Override
	public boolean register(Account account, String rePassword) {
		boolean isSuccess =  false;
		if (account.getId() != null 
				&& !account.getId().equals("") 
				&& account.getPassword() != null
				&& account.getName() != null
				&& account.getExtensionNo() != 0 // 4자리 필수 조건도 검사해야함
				&& account.getAuthority() != null) {
			Account user = this.accountMapper.select(account.getId());
			if (user == null) {
				if (account.getPassword().equals(rePassword)) {
					isSuccess = true;
					
					this.accountMapper.insert(account);
				} else {
					isSuccess = false;
				}
			} 
		}
		
		return isSuccess;
	}

	@Override
	public boolean modify(Account account, String rePassword) {
		boolean isSuccess = false;
		// 1. 입력값이 존재하는가?
		if (account.getPassword() != null 
				&& account.getName() != null
				&& account.getExtensionNo() != 0
				&& account.getAuthority() != null) {
			// 2. 비밀번호가 일치하는가? PathVariable로 받아서 념겨올까 생각 중  
			if (account.getPassword().equals(rePassword)) {
				isSuccess = true;
				
				this.accountMapper.update(account);
			} 
		}
		
		return isSuccess;
	}

	@Override
	public boolean remove(String id) {
		boolean isSuccess = false;
		
		if (id != null 
				&& !"".equals(id)) {
			this.accountMapper.delete(id);
			
			isSuccess = true;
			
			return isSuccess;
		}
		
		return isSuccess;
	}
	
	@Override
	public boolean isDuplicationById(String id) {
		return this.accountMapper.checkId(id) > 0 ? true : false;
	}
	
	@Override
	public Account view(String id) {
		return this.accountMapper.select(id);
	}
}
