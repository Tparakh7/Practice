package tejas; //Reverse array in same array
public class array {
	public static void main(String arg[])
	{
		int i,j,temp;
		int arr[]={10,20,30,40,50,60,70,80,90,100};
		for(i=0;j=arr.lenght()-1;i<arr.lenght()/2;i++,j--)
		{
			temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
		}
		for(i=0;i<arr.lenght();i++)
		{
			System.out.print(arr[i]);
		}
		
	}

}
