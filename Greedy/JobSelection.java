package Greedy;

import java.util.*;

public class JobSelection {
	static class Job{
		char job;
		int deadline;
		int profit;
		Job(char job,int deadline,int profit){
			this.job = job;
			this.deadline = deadline;
			this.profit = profit;
		}
	}

	public static void main(String[] args) {
		ArrayList<Job> arr = new ArrayList<>();
		arr.add(new Job('a', 3, 100)); 
        arr.add(new Job('b', 1, 19)); 
        arr.add(new Job('c', 2, 27)); 
        arr.add(new Job('d', 1, 25)); 
        arr.add(new Job('e', 3, 15));
        
        Collections.sort(arr,new Comparator<Job>() {
        	public int compare(Job o1, Job o2) {
        		if(o1.deadline>o2.deadline) return 1;
        		else if(o2.deadline>o1.deadline) return -1;
        		else if(o1.profit>o2.profit)return -1;
        		return 1;
        	}
        });
        int end = 0;
        int prof = 0;
        ArrayList<Character> ans = new ArrayList<>();
        for(int i = 0;i<arr.size();i++) {
        	if(arr.get(i).deadline>end) {
        		end ++;
        		prof +=arr.get(i).profit;
        		ans.add(arr.get(i).job);
        	}
        }
        System.out.println(prof);
        System.out.println(ans);
	}

}
