package contest_questions;

import java.util.Scanner;

public class ccc10s5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//(5 ((7 1) (3 4)))
				Scanner sc = new Scanner(System.in);
				String S = sc.nextLine();
				int growth = sc.nextInt();
				Node root = createTreeNode(S);
				
				
			}
			
			public static Node createTreeNode(String S) {
				//no bracket is leave
				if (!S.startsWith("(")) {
					return new Node(Integer.parseInt(S));
				} else {
					//remove outer bracket
					S = S.substring(1,S.length()-1).trim();
					int index = -1;
					if (S.startsWith("(")) {
						//left side is Node
						int count = 1;//one (
						for (int i=1;i<S.length(); i++) {
							if (S.charAt(i)=='(') {
								count++;
							} else if (S.charAt(i)==')') {
								count--;
							}
							if (count==0) {
								index = i+1;
								break;
							}
						}
					} else {
						index = S.indexOf(" ");
					}
					String left = S.substring(0, index);
					String right = S.substring(index+1);
					System.out.println("Left: "+left);
					System.out.println("Right: "+right);
					return new Node(createTreeNode(left), createTreeNode(right));
				}
			}
			
			//Postorder left right value

			public static class Node {
				int value;
				Node left;
				Node right;
				public Node(int v) {
					value = v;
					left = null;
					right = null;
				}
				public Node(Node l, Node r) {
					value = 0;
					left = l;
					right = r;
				}
		
	}

}
