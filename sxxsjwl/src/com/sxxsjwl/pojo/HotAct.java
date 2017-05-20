package com.sxxsjwl.pojo;

import java.io.Serializable;
import java.util.Date;

public class HotAct implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int h_id;// 索引
	private String h_title;// 标题
	private String h_url;// 连接
	private int h_flag;// 标识
	private String h_photo;// 图片
	private Date h_start_date;// 起始时间
	private Date h_over_date;// 结束时间

	public int getH_id() {
		return h_id;
	}

	public String getH_title() {
		return h_title;
	}

	public void setH_title(String h_title) {
		this.h_title = h_title;
	}

	public String getH_url() {
		return h_url;
	}

	public void setH_url(String h_url) {
		this.h_url = h_url;
	}

	public int getH_flag() {
		return h_flag;
	}

	public void setH_flg(int h_flg) {
		this.h_flag = h_flg;
	}

	public String getH_photo() {
		return h_photo;
	}

	public void setH_photo(String h_photo) {
		this.h_photo = h_photo;
	}

	public Date getH_start_date() {
		return h_start_date;
	}

	public void setH_start_date(Date h_start_date) {
		this.h_start_date = h_start_date;
	}

	public Date getH_over_date() {
		return h_over_date;
	}

	public void setH_over_date(Date h_over_date) {
		this.h_over_date = h_over_date;
	}

	public HotAct(int h_id, String h_title, String h_url, int h_flag, String h_photo, Date h_start_date,
			Date h_over_date) {
		super();
		this.h_id = h_id;
		this.h_title = h_title;
		this.h_url = h_url;
		this.h_flag = h_flag;
		this.h_photo = h_photo;
		this.h_start_date = h_start_date;
		this.h_over_date = h_over_date;
	}

	public HotAct(String h_title, String h_url, String h_photo, Date h_start_date, Date h_over_date) {
		super();
		this.h_title = h_title;
		this.h_url = h_url;
		this.h_photo = h_photo;
		this.h_start_date = h_start_date;
		this.h_over_date = h_over_date;
	}

}
