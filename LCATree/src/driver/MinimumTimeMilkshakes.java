package driver;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimumTimeMilkshakes {
		int seconds=0;
		Scanner sc=new Scanner(System.in);
		//max heap
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		public void getData() {
			System.out.println("Total number of orders for Mango milkshake");
			pq.add(sc.nextInt());
			
			System.out.println("Total number of orders for Orange milkshake");
			pq.add(sc.nextInt());
			
			System.out.println("Total number of orders for Pineapple milkshake");
			pq.add(sc.nextInt());
		}
		
		public void getMinimumTime() {
			
			Iterator values=pq.iterator();
			
			while(!pq.isEmpty()) {
				int tap1=0, tap2=0;
				
				//get top 2 values.
				if(values.hasNext()) {
					tap1=pq.remove();
				}
				if(values.hasNext()) {
					tap2=pq.remove();
				}
				
				if(tap1==0 && tap2>0) {
					seconds=seconds+tap2;
					break;
				}
				
				if(tap1>0 && tap2==0) {
					seconds=seconds+tap1;
					break;
				}
				
				if(tap1>0 && tap2>0) {
					tap1--;
					tap2--;
					seconds++;
				}
				
				if(tap1>0) {
					pq.add(tap1);
				}
				if(tap2>0) {
					pq.add(tap2);
				}
			}
			
		}
		
		public static void main(String[] args) {
			MinimumTimeMilkshakes minimumTimeMilkshakes=new MinimumTimeMilkshakes();
			minimumTimeMilkshakes.getData();
			minimumTimeMilkshakes.getMinimumTime();
			
			System.out.println("\nMinimum time needed to deliver all orders is: "+ minimumTimeMilkshakes.seconds);
		}
		
		
		
}
