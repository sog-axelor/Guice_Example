package com.unique.interceptor;

import com.google.inject.matcher.Matchers;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("Entering method: " + invocation.getMethod().getName());
        Object result = invocation.proceed();
        System.out.println("Exiting method: " + invocation.getMethod().getName());
        return result;
    }
}