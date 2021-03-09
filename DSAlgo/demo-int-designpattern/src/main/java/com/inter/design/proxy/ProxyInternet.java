package com.inter.design.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
	RealInternet int1 = new RealInternet();
	 private static List<String> bannedSites; 
     
	    static
	    { 
	        bannedSites = new ArrayList<String>(); 
	        bannedSites.add("abc.com"); 
	        bannedSites.add("def.com"); 
	        bannedSites.add("ijk.com"); 
	        bannedSites.add("lnm.com"); 
	    }

		@Override
		public void connectTo(String str) throws Exception {
			if(bannedSites.contains(str)) {
				throw new Exception("Access denied to " + str);
			}else {
				int1.connectTo(str);
			}
			
		} 
	      
}
