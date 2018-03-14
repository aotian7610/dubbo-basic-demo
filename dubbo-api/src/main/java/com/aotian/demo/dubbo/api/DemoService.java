package com.aotian.demo.dubbo.api;

/**
 * 测试接口类
 * @author aotian
 *
 */
public interface DemoService {

	/**
	 * 测试方法，在用户名后添加一个字符串
	 * @param username	用户名
	 * @return	修改后的字符串
	 */
	String changeUsername(String username);
	
}
