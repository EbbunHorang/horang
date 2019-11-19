package kr.ac.sunmoon.clms.computer;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.ac.sunmoon.clms.agent.Message;

@Mapper
public interface ComputerMapper {
	public List<Computer> selectAll();
	public Computer select(int	no);
	public void insert(Message message);
	public void update(Computer computer);
	public void delete(int no);
}
