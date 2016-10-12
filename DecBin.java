class DecBin{
	public static void main (String a[]){
	int n; 
	String bin, n1, n2, hex, nn; 
		System.out.println("DEC BIN HEX");
	for(n = 1; n <= 64; n ++){
			bin = Integer.toBinaryString(n);
			hex = Integer.toHexString(n);
			if(bin.length() == 1)bin = "00000000"+bin;
			if(bin.length() == 2)bin = "0000000"+bin;
			if(bin.length() == 3)bin = "000000"+bin;
			if(bin.length() == 4)bin = "00000"+bin;
			
			if(bin.length() == 5)bin = "0000"+bin;
			if(bin.length() == 6)bin = "000"+bin;
			if(bin.length() == 7)bin = "00"+bin;
			if(bin.length() == 1)bin = "0"+bin;

			n1 = bin.substring(0, 4);
			n2 = bin.substring(4, 8);
			nn = n1+" "+n2;
			System.out.println(n+"|"+nn+"|"+hex);
			System.out.println(n+"|" +n1+"|"+n2+"|"+hex);
		}
	}
}
