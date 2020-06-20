package com.example.util;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;


    @WebFilter(filterName = "DruidStatFilter", urlPatterns = "/*",
                initParams = {@WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")})
    public class  DruidStatFilter extends WebStatFilter{

    }

