package kr.ac.sunmoon.clms.lab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LabInfoServiceImpl implements LabInfoService{

	@Autowired
	private LabMapper labMapper;
	
	@Override
	public List<Lab> list() {
		// 1. 실습실 목록을 조회한다.
		return this.labMapper.selectAll();
	}
	
	@Override
	public Lab view(int no) {
		// 1. 실습실 정보를 조회한다.
		Lab lab = this.labMapper.select(no);
		System.out.println(lab.getUsage());
//		return this.labMapper.select(no);
		return lab;
	}
	
	@Override
	public void register(Lab lab) {
		// 1. 입력값이 존재하는가?
		if(lab.getNo() != 0
				&& lab.getManagementDeptName() != null
				&& lab.getEquipmentCount() != 0
				&& lab.getUsage() != null
				&& lab.getUseDeptName() != null) {
			// 2. 실습실을 등록한다.
			this.labMapper.insert(lab);
		}
	}
	
	public int check(int no) {
			return labMapper.check(no);
	}

	@Override
	public void modify(Lab lab) {
		// 1. 입력 값이 존재하는가?
		if(lab.getNo() != 0
				&& lab.getManagementDeptName() != null
				&& lab.getEquipmentCount() != 0
				&& lab.getUsage() != null
				&& lab.getUseDeptName() != null) {
			// 2. 존재하면 실습실 정보를 수정한다.
			this.labMapper.update(lab);
		}
	}

	public void remove(int no) {
		// 1. 실습실에 속한 컴퓨터 정보가 있는가?
		// 2. 실습실에 속한 컴퓨터 정보를 조회한다.
		// 3. 실습실 정보를 삭제한다.
		this.labMapper.delete(no);
	}

}
