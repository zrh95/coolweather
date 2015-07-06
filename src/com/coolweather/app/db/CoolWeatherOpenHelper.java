package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper{

	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO �Զ����ɵķ������
		db.execSQL(CREATE_PROVINCE);
		db.execSQL(CREATE_CITY);
		db.execSQL(CREATE_COUNT);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO �Զ����ɵķ������
		
	}
	
	public static final String CREATE_PROVINCE = "create table Province (" 
			+ "id integer primary key autoincrement,"
			+ "province_name text"
			+ "province_code text)";
	
	public static final String CREATE_CITY = "create table city ("
			+ "id integer primary key autoincrement,"
			+ "city_name text"
			+ "city_code text"
			+ "province_id integer)";
	
	public static final String CREATE_COUNT = "create table county ("
			+ "id integer primary key autoincrement,"
			+ "county_name text"
			+ "county_code text"
			+ "city_id integer)";
	
}
