package com.training.entity;

import java.lang.reflect.Field;

import com.training.Column;
import com.training.sterotypes.Table;

public class AnnotationProcessor {

	public static void main(String[] args) {
		Student stud = new Student();
		Class<?> cls = stud.getClass();
        Table tableRef=cls.getAnnotation(Table.class);
		
        String tableName = tableRef.tableName();
        String sql = "select * from "+tableName;
        System.out.println(sql);
        
        try {
			Field idField = cls.getDeclaredField("id");
			Column idCol = idField.getAnnotation(Column.class);
			String colName = idCol.name();
			String sql2 = "select * from "+tableName+ " where "+colName+"=?";
			System.out.println(sql2);
			
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
