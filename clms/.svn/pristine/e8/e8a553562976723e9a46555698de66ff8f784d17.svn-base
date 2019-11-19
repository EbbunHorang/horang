package kr.ac.sunmoon.clms.changenotice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChangeNoticeServiceImpl implements ChangeNoticeService {
	@Autowired
	private ChangeNoticeMapper changeNoticeMapper;

	@Override
	public List<ChangeNotice> list() {
		return changeNoticeMapper.selectAll();
	}

	@Override
	public ChangeNotice view(int no) {
		return changeNoticeMapper.select(no);
	}

	@Override
	public void register(ChangeNotice changeNotice) {
		
	}

	@Override
	public void modify(ChangeNotice changeNotice) {
		changeNoticeMapper.update(changeNotice);
	}

}
