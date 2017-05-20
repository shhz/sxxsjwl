package com.sxxsjwl.dao;

import java.util.List;

import com.sxxsjwl.pojo.Message;

public interface MessageDao {
	/**
	 * 根据标题获取 Message 对象
	 * 
	 * @param title
	 * @return
	 */
	public abstract Message getMessage(String title);

	/**
	 * 获取所有 Message 对象
	 * 
	 * @return
	 */
	public abstract List<Message> getAllMessage();

	/**
	 * 向数据表中新增 HotAct 对象
	 * 
	 * @param m
	 * @return
	 */
	public abstract boolean setMessage(Message m);

	/**
	 * 向数据表中对应 id 修改 Message 对象
	 * 
	 * @param m
	 * @return
	 */
	public abstract boolean updateMessage(Message m);

	/**
	 * 数据表中对应 id 的 Message 对象删除
	 * 
	 * @param id
	 * @return
	 */
	public abstract boolean deleteById(int id);

	/**
	 * 根据 id 查找 Message
	 * 
	 * @param id
	 * @return
	 */
	public abstract Message findById(int id);
}
