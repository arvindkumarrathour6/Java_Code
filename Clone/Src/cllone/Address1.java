package cllone;

public class Address1 implements Cloneable{
	int id;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
