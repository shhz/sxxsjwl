package com.sxxsjwl.biz;

import java.util.List;

import com.sxxsjwl.pojo.News;

public interface NewsBiz {
	/**
	 * 新增公告
	 * 
	 * @param n
	 * @return
	 */
	public boolean add(News n);

	/**
	 * 删除公告
	 * 
	 * @param n
	 * @return
	 */
	public boolean delete(News n);

	/**
	 * 修改 News
	 * 
	 * @param n
	 * @return
	 */
	public boolean updata(News n);

	/**
	 * 根据 id 查找 News
	 * 
	 * @param id
	 * @return
	 */
	public News findById(int id);

	/**
	 * 查找所有 News
	 * 
	 * @return
	 */
	public List<News> findAll();

}
