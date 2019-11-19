package kr.ac.sunmoon.clms.sw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SWInfoServiceImpl implements SWInfoService {

	@Autowired
	private SWMapper swMapper;
	
	@Override
	public List<Software> list() {
		// 1. sw 목록을 조회한다.
		List<Software> swList = this.swMapper.selectAll();
		
		return swList;
	}

	@Override
	public Software view(int no) {
		// 1. sw 정보를 조회한다.
		Software swInfo = this.swMapper.select(no);
		
		return swInfo;
	}

	@Override
	public boolean register(Software software) {
		// 1. 입력값이 존재 하는가?
		if (software.getName() != null && !"".equals(software.getName())
				&& software.getUsage() != null
				&& software.getUseDept() != null
				&& software.getSerialNumber() != null
				&& software.getDivision() != null) {
			// 2. sw 정보를 등록한다.
			this.swMapper.insert(software);

			return true;
		} 

		return false;
	} 

	@Override
	public boolean modify(Software software) {
		// 1. 입력값이 존재 하는가?
		if (software.getName() !=null
				&& software.getUsage() != null
				&& software.getUseDept() != null
				&& software.getDivision() != null
				&& software.getSerialNumber() != null) {
			// 2. SW 정보를 수정한다.
			this.swMapper.update(software);
		
			return true;
		}
		
		return false;
	}

	@Override
	public void remove(int no) {
		// 1. SW 정보를 삭제한다.
		this.swMapper.delete(no);
	}

	@Override
	public void downExcel(List<Software> softwares) {
		// TODO Auto-generated method stub

	}
}