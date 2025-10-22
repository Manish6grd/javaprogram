public class SumOfDigits{
public static void main(String[] args){
int n = 57;
int d;
int sum=0;
while(n!=0){
	d=n%10;//new comment
	sum=sum+d;//new comment
	n=n/10;//new line
	
}
System.out.println(sum);
}


}
