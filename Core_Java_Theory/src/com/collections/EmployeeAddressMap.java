package com.collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class EmployeeAddressMap {

	String city;
	String state;
	EmployeeMap m;
	public EmployeeAddressMap(String city,String state) {
		this.city=city;
		this.state=state;
	}
	@Override
	public String toString() {
		return "EmployeeMap [city=" + city + ", state=" + state + "]";
	}
	public static void main(String[] args) {
		
		Map<EmployeeMap,EmployeeAddressMap> h=new HashMap<EmployeeMap,EmployeeAddressMap>();
		h.put(new EmployeeMap(1,"Shishi"),new EmployeeAddressMap("knl","AP"));
		h.put(new EmployeeMap(2,"Prabha"),new EmployeeAddressMap("knl","AP"));
		h.put(new EmployeeMap(3,"Maru"),new EmployeeAddressMap("Hyd","Tnl"));
		//we can use any loop to get the values
//		Set entrySet = h.entrySet();
//		Iterator it3 = entrySet.iterator();
//		while(it3.hasNext()) {
//			Map.Entry<EmployeeMap,EmployeeAddressMap> e=(Entry)it3.next();
//			System.out.println(e.getKey()+":"+e.getValue());
//		}
		Set es=h.entrySet();
		Iterator it=es.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//		for(Map.Entry<EmployeeMap,EmployeeAddressMap> entry: h.entrySet()) {
//			
//				System.out.println(entry.getKey()+":"+ entry.getValue());
//		}	
	}

}