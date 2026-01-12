package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Hashmap {
	List<HashMap<String, Object>> list=new ArrayList<HashMap<String, Object>>();
	List<Member> members=new ArrayList<Member>();
	void a() {
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("name", "hong");
		map.put("age", 21);
		map.put("phone", "01012345678");
		list.add(map);
		HashMap<String, Object> map1=new HashMap<String, Object>();
		map1.put("name", "Lee");
		map1.put("age", 29);
		map1.put("phone", "01023456789");
		list.add(map1);
		
		Iterator<HashMap<String, Object>> ite=list.iterator();
		while(ite.hasNext()) {HashMap<String, Object> map3=ite.next();
		Set<String> keys=map3.keySet();
		}
		
		Member member=new Member();
		members.add(member);	
		Member member1=new Member();
		members.add(member1);	
		Iterator<Member> ite2=members.iterator();
		while(ite2.hasNext()) {Member member3=ite2.next();}}}
