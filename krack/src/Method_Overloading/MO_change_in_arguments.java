package Method_Overloading;

class Adders{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
}  
class MO_change_in_arguments{  
public static void main(String[] args){  
System.out.println(Adders.add(11,11));  
System.out.println(Adders.add(11,11,11));  
}}  
