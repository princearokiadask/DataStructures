package com.datastructures.circularqueues;

class QueueEmptyException extends RuntimeException {
	 
    public QueueEmptyException(){
        super();
    }
    
    public QueueEmptyException(String message){
        super(message);
    }
    
}
