package com.sxxsjwl.dao;

import java.util.List;

import com.sxxsjwl.pojo.HotAct;

public interface HotDao {
	/**
	 * ���ݱ����ȡ HotAct ����
	 * 
	 * @param title
	 * @return
	 */
	public abstract HotAct getHot(String title);

	/**
	 * ��ȡ���� HotAct ����
	 * 
	 * @return
	 */
	public abstract List<HotAct> getAllHot();

	/**
	 * �����ݱ������� HotAct ����
	 * 
	 * @param h
	 * @return
	 */
	public abstract boolean setHot(HotAct h);

	/**
	 * �����ݱ��ж�Ӧ id �޸� HotAct ����
	 * 
	 * @param h
	 * @return
	 */
	public abstract boolean updateHot(HotAct h);

	/**
	 * ���ݱ��ж�Ӧ id �� HotAct ����ɾ��
	 * 
	 * @param id
	 * @return
	 */
	public abstract boolean deleteById(int id);

	/**
	 * ���� id ���� HotAct
	 * 
	 * @param id
	 * @return
	 */
	public abstract HotAct findById(int id);

	/**
	 * ���� title ���� HotAct
	 * 
	 * @param title
	 * @return
	 */
	public abstract HotAct findByTitle(String title);
}
