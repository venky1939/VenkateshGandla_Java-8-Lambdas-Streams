package com.epam.lambdas_streams;
import java.util.*;
import java.util.stream.IntStream;
interface Hello{
	void is(List<String> l);
}
public class PalindromeCheck{
	public static void isPalin(List<String> l) {
		boolean isPalindrome;
		List<String> finallist=new ArrayList<String>();
		for(int k=0;k<l.size();k++) {
			String g=l.get(k);
			isPalindrome=IntStream
					.range(0,g.length()/2)
					.noneMatch(i->g.charAt(i)!=g
					.charAt(g.length()-i-1));
			if(isPalindrome) {
				finallist.add(g);
			}
		}
		System.out.println("Palindromes from the given list are:"+finallist);
		
	}
	public static void main(String []args) {
		List<String> strlist=new ArrayList<String>();
		strlist.add("mom");
		strlist.add("dad");
		strlist.add("book");
		strlist.add("pen");
		strlist.add("level");
		strlist.add("noon");
		strlist.add("chair");
		System.out.println("Original list:"+strlist);
		Hello h=PalindromeCheck::isPalin;
		h.is(strlist);
		
		
	}
}
