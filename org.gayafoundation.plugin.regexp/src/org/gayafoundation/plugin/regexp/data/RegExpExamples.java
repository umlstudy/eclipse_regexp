package org.gayafoundation.plugin.regexp.data;

import java.util.HashMap;
import java.util.Map;

public class RegExpExamples {

	public static Map<String, TitleBody> MAP_DATA = new HashMap<String,TitleBody>();
	
	static {
		MAP_DATA.put(
				"[Example 1] IP Address", 
				TitleBody.create(
				"\\b(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b", 
				"192.168.0.1\n255.255.255.0\n256.10.10.1"));
		MAP_DATA.put(
				"Tag Search", 
				TitleBody.create(
				"<([A-Z][A-Z0-9]*)\\b[^>]*>.*</\\1>", 
				"<B1> TEST </B1>"));
		MAP_DATA.put("[예제] 공백 찾기3", TitleBody.create("${Space}", 
				"공배  공백"));
		MAP_DATA.put("[예제] 공백 찾기4", TitleBody.create("${Space}", 
				"공배  공백"));
	}
}
