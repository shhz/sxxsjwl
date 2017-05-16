package com.sxxsjwl.servse;

import com.sxxsjwl.biz.UserBiz;
import com.sxxsjwl.biz.imp.UserBizImpl;

/**
 * Biz π§≥ß¿‡
 */
public class ServseBiz {
	public static UserBiz getUserBiz() {
		return new UserBizImpl();
	}
}
