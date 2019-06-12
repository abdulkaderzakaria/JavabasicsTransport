package org.air;

import org.road.Road;
import org.transport.Air;
import org.water.Water;

public class Transport {
	public void transportForm(String a)
	{
      System.out.println(a);
	}
	public static void main(String[] args) {
		 Transport  x=new Transport();
		 Road  y=new  Road();
		 Air z=new Air();
		 Water k=new Water();
		 x.transportForm("Chennai Transportation");
		  y.bike();
		 y.cycle();
		 y.bus();
		 y.car();
		 z.aeroPlane();
		 z.heliCopter();
		 k.boat();
		 k.ship();
		 
		 

	}

}
