package com.aotian.demo.dubbo.provider;

import com.aotian.demo.dubbo.api.DemoService;

/**
 * 测试服务端接口实现类
 * @author aotian
 *
 */
public class DemoServiceImpl implements DemoService{

	/**
	 * 测试方法，在用户名后添加一个字符串
	 * @param username	用户名
	 * @return	修改后的字符串
	 */
	@Override
	public String changeUsername(String username) {
		return username + " is changed";
	}

}
