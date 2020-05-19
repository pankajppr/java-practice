package com.models;
import java.util.*;

public class UserListModel {
	private Map<Integer,List<String>> map = new HashMap<Integer,List<String>>();;

	public Map<Integer,List<String>> getMap() {
		return map;
	}

	public void setMap(Map<Integer,List<String>> map) {
		this.map = map;
	}
	
}
