package com.inter.design.decoratorpract2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

	Map<String,List<EventListner>> map = new HashMap();
	
	void subscribe(String eventType,EventListner listner){
		if(map.get(eventType) != null) {
			List<EventListner> list = map.get(eventType);
			list.add(listner);
		}else {
			List<EventListner> list = new ArrayList<EventListner>();
			list.add(listner);
			map.put(eventType,list);
		}
	}
	void unsubscribe(String eventType,EventListner listner){
		if(map.get(eventType) != null) {
			List<EventListner> list = map.get(eventType);
			list.remove(listner);
		}
	}
	
	void notify(String eventType,String message) {
		List<EventListner> list = map.get(eventType);
		list.forEach(ls -> ls.update(eventType,message));
	}
	
}
