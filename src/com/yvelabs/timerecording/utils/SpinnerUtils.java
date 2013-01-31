package com.yvelabs.timerecording.utils;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;

import com.yvelabs.timerecording.EventCategoryModel;
import com.yvelabs.timerecording.R;
import com.yvelabs.timerecording.dao.EventCategoryDAO;

public class SpinnerUtils {
	
	public List<MyKeyValuePair> categorySpinner (Context context) {
		EventCategoryModel para = new EventCategoryModel();
		para.setStatus("1");
		List<EventCategoryModel> categoryList = new EventCategoryDAO(context).query(para);
		
		List<MyKeyValuePair> list = new ArrayList<MyKeyValuePair>();
		MyKeyValuePair pair = null;
		
		for (EventCategoryModel model : categoryList) {
			pair = new MyKeyValuePair();
			pair.setKey(model.getEventCategoryName());
			pair.setValue(model.getEventCategoryName());
			list.add(pair);
		}
		
		return list;
	}

	public List<MyKeyValuePair> orderSpinner () {
		List<MyKeyValuePair> list = new ArrayList<MyKeyValuePair>();
		MyKeyValuePair pair = null;
		
		pair = new MyKeyValuePair();
		pair.setKey(1);
		pair.setValue(1);
		list.add(pair);
		
		pair = new MyKeyValuePair();
		pair.setKey(2);
		pair.setValue(2);
		list.add(pair);
		
		pair = new MyKeyValuePair();
		pair.setKey(3);
		pair.setValue(3);
		list.add(pair);
		
		pair = new MyKeyValuePair();
		pair.setKey(4);
		pair.setValue(4);
		list.add(pair);
		
		pair = new MyKeyValuePair();
		pair.setKey(5);
		pair.setValue(5);
		list.add(pair);
		
		return list;
	}
	
	public List<MyKeyValuePair> statusSpinner (Context context) {
		List<MyKeyValuePair> stateList = new ArrayList<MyKeyValuePair>();
		MyKeyValuePair pair = new MyKeyValuePair();
		pair.setKey(1);
		pair.setValue(context.getString(R.string.enable));
		stateList.add(pair);
		
		pair = new MyKeyValuePair();
		pair.setKey(2);
		pair.setValue(context.getString(R.string.disable));
		stateList.add(pair);
		
		return stateList;
	}

}