package com.training;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class MemberService {

	
	HashMap<String,List<String>>details;
	
	public MemberService() {
		details = new HashMap<>();
		details.put("Rakshitha", Arrays.asList("Calling Sehemat","Monk who sold his ferrari","Wings of fire"));
		details.put("Sahana", Arrays.asList("Painter of signs","Malgudi Days","Swami and Friends"));
		
	}
	public List<String> findByMember(String memberName) {
		return details.get(memberName);
	}
}
