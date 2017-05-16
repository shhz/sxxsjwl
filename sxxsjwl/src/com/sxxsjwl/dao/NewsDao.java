package com.sxxsjwl.dao;

import java.util.List;

import com.sxxsjwl.pojo.News;

public interface NewsDao {
	/**
	 * 根据标题获取 News 对象
	 * 
	 * @param title
	 * @return
	 */
	public abstract News getNews(String title);

	/**
	 * 获取所有 News 对象
	 * 
	 * @return
	 */
	public abstract List<News> getAllNews();

	/**
	 * 向数据表中插入 News 对象
	 * 
	 * @param news
	 */
	public abstract boolean setNews(News news);

	/**
	 * 向数据表中对应 id 更新 News 对象
	 * 
	 * @param user
	 */
	public abstract boolean updateNews(News news);
	
	/**
	 * 数据表中对应 id 的 News 对象删除
	 * 
	 * @param id
	 */
	public abstract boolean deleteById(int id);
}
