package graph;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class dfs_iterative__recursion{

	static Vector<Integer> v[];
	static int visited[]=new int[10000];

	public static void main(String[] args){

		Scanner ob=new Scanner(System.in);
		int node=ob.nextInt();
		v=new Vector[node+1];
		for(int i=1;i<=node;i++){
			v[i]=new Vector();
		}
		//System.out.println(v);
		int edge=ob.nextInt();
		for(int i=0;i<edge;i++){
			int x=ob.nextInt();
			int y=ob.nextInt();
			v[x].add(y);
			v[y].add(x);
		}

		/*Stack<Integer> s=new Stack();
		s.push(1);
		while(!s.isEmpty())
		{
			int u=s.pop();
			System.out.println(u);
			visited[u]=1;
			for(int i=0;i<v[u].size();i++){
				int x=v[u].get(i);
				if(visited[x]!=1){
					s.push(x);
				}
			}
		}
		 */
		dfs(1);

	}

	static void dfs(int u){
		System.out.println(u);
		visited[u]=1;
		for(int i=0;i<v[u].size();i++){
			int x=v[u].get(i);
			if(visited[x]==0){
				dfs(x);
			}
		}
	}

}
