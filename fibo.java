import java.util.*;
class Fibo
{
public static void main(String args[])
{
System.out.println("Eneter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("Fibonac series:1,1,");
int s=1,e=1;
for(int i=3;i<n;i++)
{
sum=s+e;
Syatem.out.println(sum+",");
s=e;
e=sum;
}
}
}


