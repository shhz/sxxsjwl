package com.sxxsjwl.biz;

import java.util.List;

import com.sxxsjwl.pojo.News;

public interface NewsBiz {
	/**
	 * ��������
	 * 
	 * @param n
	 * @return
	 */
	public boolean add(News n);

	/**
	 * ɾ������
	 * 
	 * @param n
	 * @return
	 */
	public boolean delete(News n);

	/**
	 * �޸� News
	 * 
	 * @param n
	 * @return
	 */
	public boolean updata(News n);

	/**
	 * ���� id ���� News
	 * 
	 * @param id
	 * @return
	 */
	public News findById(int id);

	/**
	 * �������� News
	 * 
	 * @return
	 */
	public List<News> findAll();

}
