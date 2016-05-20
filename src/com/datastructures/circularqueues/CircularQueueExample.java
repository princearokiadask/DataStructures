package com.datastructures.circularqueues;

import java.util.Scanner;

public class CircularQueueExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of circular Queue :");
		int queueSize = sc.nextInt();
		CircularQueue<Integer> circularQueue = new CircularQueue<Integer>(queueSize); //Initial size of CircularQueueArray
		System.out.println("Please enter "+queueSize+" values to the circular Queue : ");
		for(int i =0; i<queueSize; i++){
			System.out.print("Enter the value :" );
			int value = sc.nextInt();
			circularQueue.enqueue(value);
		}
		System.out.print("Elements deQueueing from circular Queue: ");
		for(int i=0; i<queueSize; i++){
			System.out.print(circularQueue.dequeue()+" ");
		}

	}
}
