package com.sxxsjwl.pojo;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class News implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int n_id;// 索引
	private String n_title;// 标题
	private String n_content;// 文
	private String n_author;// 作者
	private String n_photo_1;// 图一地址
	private String n_photo_2;// 图二地址
	private String n_photo_3;// 图三地址
	private String n_date;// 发布日期
	private String n_url;// 链接

	private String n_cont;// 缩略内容

	public String getN_cont() {
		return n_cont;
	}

	private void setN_cont(String n_content) {
		StringBuffer sb = new StringBuffer(n_content);
		if (sb.length() > 100) {
			this.n_cont = sb.substring(0, 100);
		} else {
			this.n_cont = this.n_content;
		}
	}

	public int getN_id() {
		return n_id;
	}

	public String getN_title() {
		return n_title;
	}

	public void setN_title(String n_title) {
		this.n_title = n_title;
	}

	public String getN_content() {
		return n_content;
	}

	public void setN_content(String n_content) {
		this.n_content = n_content;
	}

	public String getN_author() {
		return n_author;
	}

	public void setN_author(String n_author) {
		this.n_author = n_author;
	}

	public String getN_photo_1() {
		return n_photo_1;
	}

	public void setN_photo_1(String n_photo_1) {
		this.n_photo_1 = n_photo_1;
	}

	public String getN_photo_2() {
		return n_photo_2;
	}

	public void setN_photo_2(String n_photo_2) {
		this.n_photo_2 = n_photo_2;
	}

	public String getN_photo_3() {
		return n_photo_3;
	}

	public void setN_photo_3(String n_photo_3) {
		this.n_photo_3 = n_photo_3;
	}

	public Date getN_date_date() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse(n_date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}

	public String getN_date() {
		return n_date;
	}

	public void setN_date(String n_date) {
		this.n_date = n_date;
	}

	public String getN_url() {
		return n_url;
	}

	public void setN_url(String n_url) {
		this.n_url = n_url;
	}

	public News(String n_title, String n_content, String n_date) {
		super();
		this.n_title = n_title;
		this.n_content = n_content;
		this.n_date = n_date;
		setN_cont(n_content);
	}

	public News(int n_id, String n_title, String n_content, String n_author, String n_photo_1, String n_photo_2,
			String n_photo_3, String n_date, String n_url) {
		super();
		this.n_id = n_id;
		this.n_title = n_title;
		this.n_content = n_content;
		this.n_author = n_author;
		this.n_photo_1 = n_photo_1;
		this.n_photo_2 = n_photo_2;
		this.n_photo_3 = n_photo_3;
		this.n_date = n_date;
		this.n_url = n_url;
		setN_cont(n_content);
	}

}
