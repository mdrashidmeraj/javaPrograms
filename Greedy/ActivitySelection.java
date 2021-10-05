package Greedy;

import java.util.*;

public class ActivitySelection {
	static class Activity{
		int start,end,pos;
		Activity(int start,int end,int pos){
			this.start = start;
			this.end = end;
			this.pos = pos;
		}
	}
		public static void main(String[] args) {
			int[] start = {1, 3, 0, 5, 8, 5};
			int[] end = {2, 4, 6, 7, 9, 9};
			ArrayList<Activity> res = new ArrayList<>();
			for(int i = 0;i<start.length;i++) {
				res.add(new Activity(start[i],end[i],i));
			}
			Collections.sort(res,new Comparator<Activity>(){
				@Override
				public int compare(Activity o1, Activity o2) {
					if(o1.end>o2.end) return 1;
					else if(o1.end<o2.end)return -1;
					else if(o1.pos<o2.pos) return -1;
					return 1;
				}
			});
			
			ArrayList<Integer> ans = new ArrayList<>();
			int e = res.get(0).end;
			ans.add(res.get(0).pos);
			int count=1;
			for(int i = 1;i<res.size();i++) {
				if(res.get(i).start>=e) {
					count++;
					e = res.get(i).end;
					ans.add(res.get(i).pos);
				}
			}
			System.out.println(ans);
			System.out.println(count);
		}
}
