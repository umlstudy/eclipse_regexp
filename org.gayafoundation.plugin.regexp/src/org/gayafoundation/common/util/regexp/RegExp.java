package org.gayafoundation.common.util.regexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
	
	public static class Location {
		private int start;
		private int end;
		
		private Location(int start, int end) {
			this.start = start;
			this.end = end;
		}
		
		public static Location create(int start, int end) {
			return new Location(start, end);
		}
		
		public String toString() {
			return start + "-" + end;
		}

		public int getStart() {
			return start;
		}

		public void setStart(int start) {
			this.start = start;
		}

		public int getEnd() {
			return end;
		}

		public void setEnd(int end) {
			this.end = end;
		}

		public int getLength() {
			return end - start;
		}
	}
	
	public static List<Location> find(String pattern, String input) {
		try {
			Pattern compiledPattern = Pattern.compile(pattern);
			Matcher matcher = compiledPattern.matcher(input);
			
			List<Location> foundLocations = new ArrayList<Location>();
			while ( matcher.find() ) {
				int start = matcher.start();
				int end   = matcher.end();
				
				foundLocations.add(Location.create(start, end));
			}
			
			return foundLocations;
		} catch ( Exception e ) {
			return Collections.emptyList();
		}
	}
	
	public static void main(String[] args) {
		String input= "my java project java ";
		String pattern = "java";
		
		System.out.println(find(pattern, input));
	}
}
