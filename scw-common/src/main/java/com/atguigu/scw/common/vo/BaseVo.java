package com.atguigu.scw.common.vo;

import lombok.Data;

//需要使用用accessToken的类的父类
@Data
public class BaseVo {

	private String accessToken;//用戶登录成功的token
}
