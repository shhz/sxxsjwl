package com.sxxsjwl.biz.imp;

import java.util.List;

import com.sxxsjwl.biz.HotBiz;
import com.sxxsjwl.dao.HotDao;
import com.sxxsjwl.pojo.HotAct;
import com.sxxsjwl.servse.ServseDao;

public class HotBizImpl implements HotBiz {
	HotDao dao = ServseDao.getHotDao();

	@Override
	public boolean add(HotAct h) {
		return dao.setHot(h);
	}

	@Override
	public boolean delete(HotAct h) {
		if (h == null || h.getH_id() == 0) {
			System.out.println("参数或 id 为空");
			return false;
		}
		return dao.deleteById(h.getH_id());
	}

	@Override
	public boolean updata(HotAct h) {
		return dao.updateHot(h);
	}

	@Override
	public HotAct findById(int id) {
		return dao.findById(id);
	}

	@Override
	public List<HotAct> findAll() {
		return dao.getAllHot();
	}

}
