package com.yc.shopping.vo;


/**
 * 
  *  类描述: 用户返回结果的展示
 * @author Administrator
  *  创建时间: 2019年6月3日下午8:38:03
 */
public class Result {
	public static final Integer SUCCESS = 1;
	public static final Integer FAILURE = 0;
	
	private Integer code;
	private String message;
	private Object data;
	
	public Result() {
		super();			
	}
	
	public Result(Integer code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	
	public Result(Integer code, String message, Object data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
}
