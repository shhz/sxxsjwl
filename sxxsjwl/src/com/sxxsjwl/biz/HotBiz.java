package com.sxxsjwl.biz;

import java.util.List;

import com.sxxsjwl.pojo.HotAct;
import com.sxxsjwl.pojo.News;

public interface HotBiz {
	/**
	 * ��������
	 * 
	 * @param h
	 * @return
	 */
	public boolean add(HotAct h);

	/**
	 * ɾ������
	 * 
	 * @param h
	 * @return
	 */
	public boolean delete(HotAct h);

	/**
	 * �޸� HotAct
	 * 
	 * @param h
	 * @return
	 */
	public boolean updata(HotAct h);

	/**
	 * ���� id ���� HotAct
	 * 
	 * @param id
	 * @return
	 */
	public HotAct findById(int id);

	/**
	 * �������� HotAct
	 * 
	 * @return
	 */
	public List<HotAct> findAll();
}
