class TrigTableDeg {


	public static void main (String args[]){
		double c,s,t;
		int d = 0;
		double r = 0, rround = 0; //radian measure
		double pi = 3.14159265358979323846;
		int i = 15;
		String undefined = "UN";
		System.out.println("radian measurement is represented as rad");
		System.out.println("\trad \t|\tcos\t|\tsin\t|\ttan" ) ;
		System.out.println("----------------------------------------------------------------------------------");
		while (d <= 360){
			r = d * (pi/180.0);
			c = Math.cos(r);
			c = (Math.round(c*1000.0))/1000.0;
			s = Math.sin(r);
			s = (Math.round(s*1000.0))/1000.0;
			t = Math.tan(r);
			t = (Math.round(t*1000.0))/1000.0;
			rround = (Math.round(r*1000.0))/1000.0;
			
			if (c == 0.0)
			{ System.out.println("\t|"+ d +"\t|"+ c +"\t\t|"+ s +"\t\t| UN ");
			}else{
			System.out.println("\t|"+ d +"\t|"+ c +"\t\t|"+ s +"\t\t|" + t);
		}
			d = d + i;
		}
	}
}
