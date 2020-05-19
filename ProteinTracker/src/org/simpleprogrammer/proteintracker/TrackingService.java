package org.simpleprogrammer.proteintracker;

import java.util.List;
import java.util.ArrayList;

public class TrackingService {
	private int total;
	private int goal;
	private int historyId = 0;
	private List<HistoryItem> history = new ArrayList<HistoryItem>();
	
	public void addProtein(int amount){
		total += amount;
		history.add(new HistoryItem(historyId++, amount,"add", total));
	}
	public void removeProtein(int amount){
		total -= amount;
		if(total<0) total=0;
	}
	public int getTotal(){
		return total;
	}
	public void setGoal(int value){
		goal = value;
	}
	public boolean isGoalMet(){
		return total >= goal;
	}
	public List<HistoryItem> getHistory(){
		return history;
	}

}
