package kr.ac.sunmoon.clms.changenotice;

import java.util.List;

public interface ChangeNoticeService {
	public List<ChangeNotice> list();
	public ChangeNotice view(int no);
	public void register(ChangeNotice changeNotice);
	public void modify(ChangeNotice changeNotice);
}
