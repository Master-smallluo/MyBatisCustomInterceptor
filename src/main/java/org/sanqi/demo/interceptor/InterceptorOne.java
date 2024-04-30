package org.sanqi.demo.interceptor;

import com.baomidou.mybatisplus.core.toolkit.PluginUtils;
import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import java.sql.Connection;

/**
 * @author: JenSen
 * @Date: 2024/4/17 16:23
 * @Description: InterceptorOne
 */

@Intercepts(@Signature(type = StatementHandler.class,method = "prepare",args = {Connection.class,Integer.class}))
public class InterceptorOne implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        //打印被拦截的sql语法构建代理对象
        System.out.println(invocation);
//        System.out.println( "得到其代理的参数" + invocation.getArgs());
//        System.out.println("得到其代理的方法" + invocation.getMethod());
//        System.out.println("得到其代理的对象" + invocation.getTarget());
        //获取真正被代理的对象
//        StatementHandler o = (StatementHandler)PluginUtils.realTarget(invocation.getTarget());
        //获取被代理对象的元对象(工具类对象)
//        MetaObject metaObject = SystemMetaObject.forObject(o);
        //获取被代理对象的构建的sql或者参数等信息
//        metaObject.getValue("de");
//        metaObject.getValue()
//        System.out.println(metaObject.getGetterNames());
        return invocation.proceed();
    }
}
