package com.easychat.bean;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

/**
 * 定义的serviceException
 */
@Builder
@Data
public class ServiceException extends RuntimeException {
	
	private static final long serialVersionUID = -5297235746439610247L;
	
	/** 响应码 */
	@Getter
	private String code;
	/** 响应码描述 */
	@Getter
	private String desc;
	
	/**
	 * 业务异常信息
	 * @param resultCode 响应码
	 * @param resultCodeDesc 响应码描述
	 */
    public ServiceException(String resultCode, String resultCodeDesc) {
    	super(resultCodeDesc);
    	this.code = resultCode;
    	this.desc = resultCodeDesc;
    }
    
	
	/**
     * 业务异常信息
     * @param resultCode 返回码，包含返回码和描述内容
     */
    public ServiceException(ResultCode resultCode) {
    	this(resultCode.getCode(), resultCode.getDesc());
    	this.code = resultCode.getCode();
    	this.desc = resultCode.getDesc();
    }
    
    
    /**
	 * 业务异常信息
	 * @param resultCode 返回码，包含返回码和描述内容
	 * @param args 描述内容中的参数列表，自动依序替换描述内容中的%s
	 */
	public ServiceException(ResultCode resultCode, Object... args) {
		this(resultCode.getCode(), String.format(resultCode.getDesc(), args));
		this.code = resultCode.getCode();
    	this.desc = String.format(resultCode.getDesc(), args);
    }
    
}
