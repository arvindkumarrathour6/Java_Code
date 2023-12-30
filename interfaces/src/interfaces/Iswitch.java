package interfaces;

public interface Iswitch {
	void sOn();
	void sOff();

}
 interface Iregulator{
	 void increasespeed();
	 void decreasespeed();
	 
 }
 interface Combo extends Iswitch,Iregulator{
	 
 }
