package com.followme.common.aspect;

import com.alibaba.fastjson.JSON;
import com.followme.common.utils.LogUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by ZengXihong 2019-04-20.
 */
@Aspect
@Component
public class ControllerLogAspect {
    @Pointcut("execution(* com.followme.controller..*(..))")
    public void log() {
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) throws Exception {
        LogUtil.info(joinPoint.getSignature().getDeclaringTypeName()+"." + joinPoint.getSignature().getName() + "启动：请求数据为：{}",
        this.buildArgs(joinPoint.getArgs()));
    }

    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfterReturning(JoinPoint joinPoint,Object object) throws Exception {
        LogUtil.info(joinPoint.getSignature().getDeclaringTypeName()+"." + joinPoint.getSignature().getName() + "结束：响应数据为：{}",
                this.buildArgs(joinPoint.getArgs()));
    }
    @AfterThrowing(throwing = "e",pointcut = "log()")
    public void doAfterThrowing(JoinPoint joinPoint,Exception e) throws Exception {
        LogUtil.info(joinPoint.getSignature().getDeclaringTypeName()+"." + joinPoint.getSignature().getName() + "结束：响应异常为：{}:{}",
                e.getClass(),e.getMessage());
    }


    private String buildArgs(Object[] objects) {
        StringBuffer result = new StringBuffer();
        for (Object obj : objects) {
            result.append(JSON.toJSONString(obj));
        }
        return result.toString();
    }
}
