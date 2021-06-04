package collectionframework;

import java.util.ArrayDeque;

public class ImpArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.offerFirst(23);
		ad.push(34);
		ad.push(37);
		ad.offerLast(56);
		System.out.println(ad.pollFirst());
		System.out.println(ad.pollLast());

	}

}
