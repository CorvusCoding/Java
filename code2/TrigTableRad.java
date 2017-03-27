class TrigTableRad {


	public static void main (String args[]){
		double c,s,t;
		int d = 0;
		double r = 0, rround = 0, cround = 0, sround = 0, tround = 0; //radian measure
		double pi = 3.141592653589793238462643383279502884197169399375105820974;
		double i = (pi/12);
		String undefined = "UN";
		System.out.println("radian measurement is represented as rad");
		System.out.println("\t\t|rad\t\t|cos(radian)\t|sin(rad)\t|tan(rad)" ) ;
		while (r<= (2*pi)){

			c = Math.cos(r);
			s = Math.sin(r);
			t = Math.tan(r);
			rround = (Math.round(r*1000.0))/1000.0;
			cround = (Math.round(c*1000.0))/1000.0;
			sround = (Math.round(s*1000.0))/1000.0;
			tround = (Math.round(t*1000.0))/1000.0;
			
			//if ((cround == 0)||(cround == 0))
			System.out.println("\t\t|"+rround+"\t\t|"+cround+"\t\t|"+sround+"\t\t|"+tround);
			r = r + i;
		}
	}
}
