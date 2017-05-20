package com.sxxsjwl.dao;

import java.util.List;

import com.sxxsjwl.pojo.Message;

public interface MessageDao {
	/**
	 * ���ݱ����ȡ Message ����
	 * 
	 * @param title
	 * @return
	 */
	public abstract Message getMessage(String title);

	/**
	 * ��ȡ���� Message ����
	 * 
	 * @return
	 */
	public abstract List<Message> getAllMessage();

	/**
	 * �����ݱ������� HotAct ����
	 * 
	 * @param m
	 * @return
	 */
	public abstract boolean setMessage(Message m);

	/**
	 * �����ݱ��ж�Ӧ id �޸� Message ����
	 * 
	 * @param m
	 * @return
	 */
	public abstract boolean updateMessage(Message m);

	/**
	 * ���ݱ��ж�Ӧ id �� Message ����ɾ��
	 * 
	 * @param id
	 * @return
	 */
	public abstract boolean deleteById(int id);

	/**
	 * ���� id ���� Message
	 * 
	 * @param id
	 * @return
	 */
	public abstract Message findById(int id);
}
