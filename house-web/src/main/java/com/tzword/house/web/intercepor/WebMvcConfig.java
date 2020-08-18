package com.tzword.house.web.intercepor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**注册拦截器
		 * */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	@Autowired
	private AuthInterceptor authInterceptor;

	@Value("${filePath.uploadFilePath}")
	private String uploadFilePath;


	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(authInterceptor)
				.addPathPatterns("/**").
				excludePathPatterns("/admin/login",
						"/admin/tokenVerify",
						"/sys-verify-code/getCode",
						"/sys-verify-code/getVerify/*",
						"/swagger-resources/**",
						"/webjars/**",
						"/v2/**",
						"/uploadFilePath/**",
						"/swagger-ui.html/**",
						"/api/fl/sync");
		registry
				.addInterceptor(authInterceptor)
				.addPathPatterns("/uploadFilePath/**");

	}
	


	/**
	 * @Description: 添加静态文件访问地址
	 * @param registry 1 
	 * @return void 
	 * @throws
	 * @author jianghy
	 * @date 2020/5/29 17:22 
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/uploadFilePath/**").addResourceLocations("file:"+uploadFilePath);
	}
}
