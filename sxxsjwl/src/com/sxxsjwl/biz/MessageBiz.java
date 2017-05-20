package com.sxxsjwl.biz;

import java.util.List;

import com.sxxsjwl.pojo.Message;

public interface MessageBiz {
	/**
	 * 新增 Message
	 * 
	 * @param m
	 * @return
	 */
	public boolean add(Message m);

	/**
	 * 删除 Message
	 * 
	 * @param id
	 * @return
	 */
	public boolean delete(int id);

	/**
	 * 修改 Message
	 * 
	 * @param m
	 * @return
	 */
	public boolean updata(Message m);

	/**
	 * 根据 id 查找 Message
	 * 
	 * @param id
	 * @return
	 */
	public Message findById(int id);

	/**
	 * 查找所有 Message
	 * 
	 * @return
	 */
	public List<Message> findAll();
}
