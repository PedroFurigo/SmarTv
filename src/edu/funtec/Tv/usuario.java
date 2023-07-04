package edu.funtec.Tv;

public class usuario {

	public static void main(String[] args) {
		SmarTv tv = new SmarTv(false,10,30);
		tv.Ligar();
		tv.aumentarVolume();
		tv.aumentarCanal();
		tv.diminuirCanal();
		tv.diminuirVolume();
		tv.mudarCanal(50);
		System.out.println(tv.toString());
		tv.desligar();

	}

}
