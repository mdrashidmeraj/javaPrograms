package graph;

import java.util.*;

public class Traversal {
	private LinkedList<Integer> adj[];
	
	Traversal(int v){
		adj = new LinkedList[v];
		for(int i = 0;i<v;i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	void addEdge(int source, int designation) {
		adj[source].add(designation);
		adj[designation].add(source);
	}
	void BFS(int source, int designation) {
		Queue<Integer> q  = new LinkedList<>();
		
		boolean vis[] = new boolean[adj.length];
		int parent[] = new int[adj.length];
		
		q.add(source);
		vis[source] = true;
		parent[source] = -1;
		while(!q.isEmpty()) {
			int curr = q.poll();
			if(curr == designation) break;
			for(int i:adj[curr]) {
				if(!vis[i]) {
					q.add(i);
					vis[i] = true;
					parent[i] = curr;
				}
				
			}
		}
		int cur = designation;
		int dis = 0;
		while(parent[cur]!=-1) {
			dis++;
			cur = parent[cur];
		}
		System.out.println(dis);
	}
	 private boolean dfsutil(int s, int d,boolean[] vis) {
		 if(s==d) return true;
		 for(int i:adj[s]) {
			 if(!vis[i]) {
				 vis[i] =true;
				 boolean ans = dfsutil(i,d,vis);
				 if(ans) return true;
			 }
		 }
		 return false;
	 }
	 public boolean dfs(int s, int d) {
		 boolean vis[] = new boolean[adj.length];
		 vis[s] = true;
		 return dfsutil(s,d,vis);
	 }
	 public boolean dfsStack(int s, int d) {
		 boolean vis[] = new boolean[adj.length];
		 vis[s] = true;
		 Stack<Integer> st = new Stack<>();
		 st.push(s);
		 while(!st.isEmpty()) {
			 int cur = st.pop();
			 if(cur == d) return true;
			 for(int i:adj[cur]) {
				 if(!vis[i]) {
					 vis[i] = true;
					 st.push(i);
				 }
			 }
		 }
		 return false;
	 }
	 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		Traversal t = new Traversal(v);
		System.out.println("Enter Edges");
		for(int i=0;i<e;i++) {
			int s = sc.nextInt();
			int d = sc.nextInt();
			t.addEdge(s,d);
		}
		System.out.println("Enter source and designation");
		int s = sc.nextInt();
		int d = sc.nextInt();
		System.out.println(t.dfsStack(s, d));
		t.BFS(s,d);

	}

}
