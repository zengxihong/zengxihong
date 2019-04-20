package com.followme.common.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.Util;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * Created by ZengXihong 2019-04-20.
 */
public class LogUtil {

    private static final Map<Class<?>,Logger> loggers = new ConcurrentHashMap<>();

    public static void info(String message, Object... objects){
        Class<?> callingClass = Util.getCallingClass();
        Logger logger =loggers.computeIfAbsent(callingClass, LoggerFactory::getLogger);
        //List<Object> objectList =  Arrays.stream(objects).map(sensitiveMap()).collect(Collectors.toList());
        List<Object> objectList =  Arrays.stream(objects).collect(Collectors.toList());
        Object[] objectArr = new Object[objectList.size()];
        logger.info(message,objectList.toArray(objectArr));
    }

    public static void debug(String message, Object... objects){
        Class<?> callingClass = Util.getCallingClass();
        Logger logger =loggers.computeIfAbsent(callingClass, LoggerFactory::getLogger);
        //List<Object> objectList =  Arrays.stream(objects).map(sensitiveMap()).collect(Collectors.toList());
        List<Object> objectList =  Arrays.stream(objects).collect(Collectors.toList());
        Object[] objectArr = new Object[objectList.size()];
        logger.debug(message,objectList.toArray(objectArr));
    }

    public static void error(String message, Object... objects){
        Class<?> callingClass = Util.getCallingClass();
        Logger logger =loggers.computeIfAbsent(callingClass, LoggerFactory::getLogger);
        //List<Object> objectList =  Arrays.stream(objects).map(sensitiveMap()).collect(Collectors.toList());
        List<Object> objectList =  Arrays.stream(objects).collect(Collectors.toList());
        Object[] objectArr = new Object[objectList.size()];
        logger.error(message,objectList.toArray(objectArr));
    }
}
