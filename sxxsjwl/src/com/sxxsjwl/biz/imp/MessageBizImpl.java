package com.sxxsjwl.biz.imp;

import java.util.List;

import com.sxxsjwl.biz.MessageBiz;
import com.sxxsjwl.dao.MessageDao;
import com.sxxsjwl.pojo.Message;
import com.sxxsjwl.servse.ServseDao;

public class MessageBizImpl implements MessageBiz {
	MessageDao dao = ServseDao.getMessageDao();

	@Override
	public boolean add(Message m) {
		return dao.setMessage(m);
	}

	@Override
	public boolean delete(int id) {
		return dao.deleteById(id);
	}

	@Override
	public boolean updata(Message m) {
		return dao.updateMessage(m);
	}

	@Override
	public Message findById(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Message> findAll() {
		return dao.getAllMessage();
	}

}
