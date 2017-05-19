package com.sxxsjwl.dao;

import java.util.List;

import com.sxxsjwl.pojo.HotAct;

public interface HotDao {
	/**
	 * 根据标题获取 HotAct 对象
	 * 
	 * @param title
	 * @return
	 */
	public abstract HotAct getHot(String title);

	/**
	 * 获取所有 HotAct 对象
	 * 
	 * @return
	 */
	public abstract List<HotAct> getAllHot();

	/**
	 * 向数据表中新增 HotAct 对象
	 * 
	 * @param h
	 * @return
	 */
	public abstract boolean setHot(HotAct h);

	/**
	 * 向数据表中对应 id 修改 HotAct 对象
	 * 
	 * @param h
	 * @return
	 */
	public abstract boolean updateHot(HotAct h);

	/**
	 * 数据表中对应 id 的 HotAct 对象删除
	 * 
	 * @param id
	 * @return
	 */
	public abstract boolean deleteById(int id);

	/**
	 * 根据 id 查找 HotAct
	 * 
	 * @param id
	 * @return
	 */
	public abstract HotAct findById(int id);

	/**
	 * 根据 title 查找 HotAct
	 * 
	 * @param title
	 * @return
	 */
	public abstract HotAct findByTitle(String title);
}
