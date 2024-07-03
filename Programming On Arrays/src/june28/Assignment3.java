package june28;

class Assignment3 {
	
	static void printFrequency(int[] ar) {
		int[] br = new int[ar.length];
		int[] cr = new int[ar.length];
		int k=0;
		for(int i=0; i<ar.length; i++) {
			int count=1;
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]==ar[j]) {
					count++;
				}
				
			}
			int p=k-1;
			while(p>=0) {
				if(ar[i]==ar[p]) {
					break;
				}
				p--;
			}
			
			if(p==-1) {
				br[k++]=count;
				cr[k-1]=ar[i];
			}
			
		}
		
		int rs[] = new int[k];
		int rs1[] = new int[k];
		for(int i=0; i<rs.length;i++) {
			rs[i] = br[i];
			rs1[i] = cr[i];
		}
		
		for(int i=0; i<rs.length; i++) {
			System.out.println(rs1[i]+" "+rs[i]);
		}
	}
	
	
	public static void main(String[] args) {
		
		int[] ar = {10,30,40,10,20,10,80,20,1000,20,60,60};
		printFrequency(ar);
		
	}

}
