package com.sxxsjwl.pojo;

import java.io.Serializable;

public class Message  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int m_id;
	private String m_title;
	private String m_context;
	private String m_date;

	public int getM_id() {
		return m_id;
	}

	public String getM_title() {
		return m_title;
	}

	public void setM_title(String m_title) {
		this.m_title = m_title;
	}

	public String getM_context() {
		return m_context;
	}

	public void setM_context(String m_context) {
		this.m_context = m_context;
	}

	public String getM_date() {
		return m_date;
	}

	public void setM_date(String date) {
		this.m_date = date;
	}

	public Message(int m_id, String m_title, String m_context, String m_date) {
		super();
		this.m_id = m_id;
		this.m_title = m_title;
		this.m_context = m_context;
		this.m_date = m_date;
	}

	public Message(String m_title, String m_context, String m_date) {
		super();
		this.m_title = m_title;
		this.m_context = m_context;
		this.m_date = m_date;
	}

}
