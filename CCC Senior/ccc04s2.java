import java.util.*;

public class ccc04s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] worstRank = new int[n];
		int[] sum = new int[n];
		int max = Integer.MIN_VALUE;
		LinkedList<Integer> maxp = new LinkedList<Integer>();

		for (int i = 0; i < k; i++){
			for (int l = 0; l < n; l++){
				sum[l] += sc.nextInt();
			}
			for (int l = 0; l < n; l++){
				int p = rank(sum, l);
				
				if (p > worstRank[l]){
					worstRank[l] = p;
				}
			}
		}
		
		for (int i = 0; i < n; i++){
			if (sum[i] > max){
				max = sum[i];
				maxp.clear();
				maxp.add(i);
			} else if (sum[i] == max){
				maxp.add(i);
			}
		}
		
		for (int i = 0; i < maxp.size(); i++){
			System.out.println("Yodeller " + (maxp.get(i) + 1) + " is the TopYodeller: score " + sum[maxp.getFirst()] + ", worst rank " + worstRank[maxp.get(i)]);
		}
		


	}
	public static int rank (int[] sum, int index){
		int p = sum[index];
		int[] sum2 = Arrays.copyOf(sum, sum.length);
		Arrays.sort(sum2);
		
		for (int i = sum2.length - 1; i >= 0; i--){
			if (sum2[i] == p){
				return sum.length - i;
			}
		}
		return -1;
	}

}
