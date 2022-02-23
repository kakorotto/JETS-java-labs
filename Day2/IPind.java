import java.util.*;
public class IPind{
public static void main(String[] args){
String str=args[0];
int i,i1,i2,i3;

//for(int i=0;i<=4;i++)
//{
//	if(i<3)
//{

i=str.indexOf('.');
i1=str.indexOf('.',i);
i2=str.indexOf('.',i1);
i3=str.lastIndexOf('.');
System.out.println(str.substring(0,i));
System.out.println(str.substring(i+1,i1));
System.out.println(str.substring(i1+1,i2));
System.out.println(str.substring(i3+1,str.length()-1));
//str=str.substring(index++);
//if(index==str.lastIndexOf('.')) break;
}
//else System.out.println(str);

//}

}
