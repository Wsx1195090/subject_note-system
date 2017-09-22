package com.zr.service;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public interface SubService {

	/**
	 * 插入一道新的题目
	 * @param subSummary题目描述
	 * @param subText题目内容
	 * @param subType题目类型
	 * @param subAnswer题目答案
	 * @param subTime题目创建年份
	 * @return
	 */
	public boolean insertNewSub(String subSummary,String subText,int subType,String subAnswer,int subTime);

	/**
	 * 通过题目id得到一个题目
	 * @param sid题目id
	 * @return返回一个存有题目信息的JSONObject对象
	 */
	public JSONObject getSubjectBySid(int sid);
}