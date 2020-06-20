package com.example.demo;

import io.github.yedaxia.apidocs.Docs;
import io.github.yedaxia.apidocs.DocsConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@SpringBootApplication
@ServletComponentScan(basePackages = "com.example.util")
@MapperScan(basePackages = "com.example.demo.dao")
public class DemoApplication extends  SpringBootServletInitializer{

	public static void main(String[] args) {

		DocsConfig config = new DocsConfig();
		config.setProjectPath("/SpringDemo"); // 项目根目录
		config.setProjectName("SpringDemo"); // 项目名称
		config.setApiVersion("V1.0");       // 声明该API的版本
		config.setDocsPath("/API_Document"); // 生成API 文档所在目录
		config.setAutoGenerate(Boolean.TRUE);  // 配置自动生成
		Docs.buildHtmlDocs(config); // 执行生成文档

		SpringApplication.run(DemoApplication.class, args);
	}

}
