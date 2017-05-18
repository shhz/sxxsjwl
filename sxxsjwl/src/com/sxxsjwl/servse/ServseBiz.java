package com.sxxsjwl.servse;

import com.sxxsjwl.biz.HotBiz;
import com.sxxsjwl.biz.NewsBiz;
import com.sxxsjwl.biz.UserBiz;
import com.sxxsjwl.biz.imp.HotBizImpl;
import com.sxxsjwl.biz.imp.NewsBizImpl;
import com.sxxsjwl.biz.imp.UserBizImpl;

/**
 * Biz π§≥ß¿‡
 */
public class ServseBiz {
	public static UserBiz getUserBiz() {
		return new UserBizImpl();
	}

	public static NewsBiz getNewsBiz() {
		return new NewsBizImpl();
	}

	public static HotBiz getHotBiz() {
		return new HotBizImpl();
	}
}
