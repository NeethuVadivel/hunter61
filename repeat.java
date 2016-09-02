class repeat
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		int i=0,f=n,out=0,c=0,j=0,q=0,w=n,z=0;
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(a[i]==a[j]){
					z=j;
					break;
				}
			}
			c=Math.abs(z-i);
			if(f>c&&i>=q&&z<=w){
				f=c;
				out=a[i];
			}
			q=i;
			w=z;
		}
		System.out.println(out);
	}
}
