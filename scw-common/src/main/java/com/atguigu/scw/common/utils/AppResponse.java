package com.atguigu.scw.common.utils;

import com.atguigu.scw.common.consts.AppConsts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//响应类：统一响应数据的格式，让调用者快速判断成功失败，或异常信息
@Data
@AllArgsConstructor
@NoArgsConstructor 
public class AppResponse<T> {
	//响应状态码
	private int code;  //10000 代表成功 ， 10001 代表xxx异常
	//响应信息：描述本次响应状态
	private String message;
	//响应数据
	private T data;
	
	//响应成功的方法
	public static <T> AppResponse<T> ok(T data ,String message) {
		return new AppResponse<T>(AppConsts.SUCCESS_CODE, message, data);//封装响应状态码+信息+数据成为响应对象交给调用者
	}
	//响应失败的方法
	public static <T> AppResponse<T> fail(T data ,String message) {
		return new AppResponse<T>(AppConsts.ERROR_CODE, message, data);//封装响应状态码+信息+数据成为响应对象交给调用者
	}
	
}
