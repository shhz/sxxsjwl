package com.sxxsjwl.dao;

import java.util.List;

import com.sxxsjwl.pojo.News;

public interface NewsDao {
	/**
	 * ���ݱ����ȡ News ����
	 * 
	 * @param title
	 * @return
	 */
	public abstract News getNews(String title);

	/**
	 * ��ȡ���� News ����
	 * 
	 * @return
	 */
	public abstract List<News> getAllNews();

	/**
	 * �����ݱ��в��� News ����
	 * 
	 * @param news
	 */
	public abstract boolean setNews(News news);

	/**
	 * �����ݱ��ж�Ӧ id ���� News ����
	 * 
	 * @param user
	 */
	public abstract boolean updateNews(News news);
	
	/**
	 * ���ݱ��ж�Ӧ id �� News ����ɾ��
	 * 
	 * @param id
	 */
	public abstract boolean deleteById(int id);
}
