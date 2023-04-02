package com.tarrasques.blog.commons.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.stream.Collectors;

/**
 * <p>Title: BeanUtils.java</p>
 * <p>Description:BeanUtils工具类</p>
 *
 */
public class BeanUtils {

	private transient static Logger logger = LoggerFactory.getLogger(BeanUtils.class);

	private BeanUtils(){}

	/**
	 * <p>Title: convert</p>
	 * <p>Description: 对象之间相同属性复制</p>
	 *
	 */
	public static <T> T copyProperties(Object src, Class<T> tClass) {
		try {
			if(src== null){
				return null;
			}
			T newInstance = tClass.newInstance();
			org.springframework.beans.BeanUtils.copyProperties(src, newInstance);
			return newInstance;
		} catch (BeansException e) {
			logger.error("{}",e);
		} catch (InstantiationException e) {
			logger.error("{}",e);
		} catch (IllegalAccessException e) {
			logger.error("{}",e);
		}
		return null;
	}
	
	/**
	 * 
	 * <p>Title: convertMap</p>  
	 * <p>Description:转换List集合 </p>  
	 * @param srcList 源List
	 * @param clazz 目标对象Class
	 * @return  目标对象集合
	 */
	public static <E , T> List<E> convertMap(List<T> srcList, Class<E> clazz) {
		if(CollectionUtils.isEmpty(srcList)){
			return Collections.emptyList();
		}
		return srcList.stream().map(src -> copyProperties(src, clazz)).collect(Collectors.toList());
	}

	/**
	 * 实体对象转成Map
	 * @param obj 实体对象
	 * @return
	 */
	public static Map<String, Object> object2Map(Object obj) {
		Map<String, Object> map = new HashMap<>();
		if (obj == null) {
			return map;
		}
		Class clazz = obj.getClass();
		Field[] fields = clazz.getDeclaredFields();
		try {
			for (Field field : fields) {
				field.setAccessible(true);
				map.put(field.getName(), field.get(obj));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	/**
	 * Map转成实体对象
	 * @param map   实体对象包含属性
	 * @param clazz 实体对象类型
	 * @return
	 */
	public static Object map2Object(Map<String, Object> map, Class<?> clazz) {
		if (map == null) {
			return null;
		}
		Object obj = null;
		try {
			obj = clazz.newInstance();

			Field[] fields = obj.getClass().getDeclaredFields();
			for (Field field : fields) {
				int mod = field.getModifiers();
				if (Modifier.isStatic(mod) || Modifier.isFinal(mod)) {
					continue;
				}
				field.setAccessible(true);
				field.set(obj, map.get(field.getName()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

}