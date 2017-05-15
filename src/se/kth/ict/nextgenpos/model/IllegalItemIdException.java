package se.kth.ict.nextgenpos.model;

public class IllegalItemIdException extends Exception {

    public IllegalItemIdException (String msg, Exception rootCause) {
        super (msg, rootCause);
    }
}