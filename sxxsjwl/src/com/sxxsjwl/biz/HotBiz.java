package com.sxxsjwl.biz;

import java.util.List;

import com.sxxsjwl.pojo.HotAct;
import com.sxxsjwl.pojo.News;

public interface HotBiz {
	/**
	 * 新增公告
	 * 
	 * @param h
	 * @return
	 */
	public boolean add(HotAct h);

	/**
	 * 删除公告
	 * 
	 * @param h
	 * @return
	 */
	public boolean delete(HotAct h);

	/**
	 * 修改 HotAct
	 * 
	 * @param h
	 * @return
	 */
	public boolean updata(HotAct h);

	/**
	 * 根据 id 查找 HotAct
	 * 
	 * @param id
	 * @return
	 */
	public HotAct findById(int id);

	/**
	 * 查找所有 HotAct
	 * 
	 * @return
	 */
	public List<HotAct> findAll();
}
