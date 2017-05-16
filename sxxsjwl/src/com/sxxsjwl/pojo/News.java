package com.sxxsjwl.pojo;

public class News {
	private int n_id;// ����
	private String n_title;// ����
	private String n_content;// ��
	private String n_author;// ����
	private String n_photo_1;// ͼһ��ַ
	private String n_photo_2;// ͼ����ַ
	private String n_photo_3;// ͼ����ַ

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

	public News(String n_title, String n_content) {
		super();
		this.n_title = n_title;
		this.n_content = n_content;
	}

	public News(int n_id, String n_title, String n_content, String n_author, String n_photo_1, String n_photo_2,
			String n_photo_3) {
		super();
		this.n_id = n_id;
		this.n_title = n_title;
		this.n_content = n_content;
		this.n_author = n_author;
		this.n_photo_1 = n_photo_1;
		this.n_photo_2 = n_photo_2;
		this.n_photo_3 = n_photo_3;
	}

}
