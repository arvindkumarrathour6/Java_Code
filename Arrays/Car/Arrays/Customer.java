package Arrays;

public class Customer 
{
 private  int id;
 private long cont;
 private String City;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public long getCont() {
	return cont;
}
public void setCont(long cont) {
	this.cont = cont;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
@Override
public String toString() {
	return id+" "+cont+" "+City;
}


}
