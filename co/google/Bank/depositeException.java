package Bank;

public class depositeException extends RuntimeException{
	depositeException(String msg){
		super(msg);
	}

}
 class withdrawException extends RuntimeException{
	withdrawException(String msg){
		super(msg);
	}

}