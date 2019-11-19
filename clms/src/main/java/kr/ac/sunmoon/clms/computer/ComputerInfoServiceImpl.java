package kr.ac.sunmoon.clms.computer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.sunmoon.clms.agent.Message;

@Service
public class ComputerInfoServiceImpl implements ComputerInfoService {
	@Autowired
	private ComputerMapper computerMapper;
	
	@Override
	public List<Computer> list() {
//		1. 컴퓨터 목록을 조회한다.
		return this.computerMapper.selectAll();
	}

	@Override
	public Computer view(int no) {
		return this.computerMapper.select(no);
	}

	@Override
	public void register(Message message) {
		computerMapper.insert(message);
	}

	public void modify(Computer computer) {
		if(computer.getNo() != 0
				&& computer.getIpAddress() != null
				&& computer.getLaboratoryNo() != 0
				&& computer.getSpecRegDate() != null
				&& computer.getCpu() != null
				&& computer.getVga() != null
				&& computer.getRam() != null
				&& computer.getHdd() != null
				&& computer.getSsd() != null) {
			computerMapper.update(computer);
		}
	}

	@Override
	public void remove(int no) {
		computerMapper.delete(no);
	}

}
