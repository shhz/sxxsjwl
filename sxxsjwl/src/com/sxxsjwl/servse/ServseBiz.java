package com.sxxsjwl.servse;

import com.sxxsjwl.biz.UserBiz;
import com.sxxsjwl.biz.imp.NewsBizImpl;
import com.sxxsjwl.biz.imp.UserBizImpl;

/**
 * Biz ������
 */
public class ServseBiz {
	public static UserBiz getUserBiz() {
		return new UserBizImpl();
	}

	public static NewsBizImpl getNewsBiz() {
		return new NewsBizImpl();
	}
}