package com.datastructures.circularqueues;

class QueueFullException extends RuntimeException {
    
    public QueueFullException(){
        super();
    }
    
    public QueueFullException(String message){
        super(message);
    }
    
}