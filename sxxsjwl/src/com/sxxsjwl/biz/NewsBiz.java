package com.sxxsjwl.biz;

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

}
