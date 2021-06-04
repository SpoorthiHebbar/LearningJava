package collectionframework;
import java.util.*;

public class MergeLL {

	public static void main(String[] args) {
		LinkedList<Integer> ll1 = new LinkedList<>();
		LinkedList<Integer> ll2 = new LinkedList<>();
		ll1.add(43);
		ll1.add(56);
		ll1.add(03);
		ll1.add(89);
		
		ll2.add(55);
		ll2.add(5);
		ll2.add(33);
		ll2.add(-6);
		ll2.add(34);
		
		ll1 = mergell(ll1,ll2);
		System.out.println(ll1);
	}
	
	static LinkedList<Integer> mergell(LinkedList<Integer> ll1,LinkedList<Integer> ll2){
		LinkedList<Integer> res = new LinkedList<>();
		
		Collections.sort(ll1);
		Collections.sort(ll2);
		
		ArrayList<Integer> a1 = new ArrayList<>(ll1);
		ArrayList<Integer> a2 = new ArrayList<>(ll2);
		
		int m=a1.size();
		int n=a2.size();
		
		int i=0,j=0;
		while(i<m&&j<n) {
			if(a1.get(i)<=a2.get(j)) {
				res.add(a1.get(i));
				i++;
			}else {
				res.add(a2.get(j));
				j++;
			}
		}
		while(i<m) {
			res.add(a1.get(i));
			i++;
		}
		while(j<n) {
			res.add(a2.get(j));
			j++;
		}
		
		return res;
	}

}
