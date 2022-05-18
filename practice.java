

// class Answer{
//             Answer(){
//                 System.out.println("You got nothing.");
//             }
//             Answer(int marks, String type){
//               this();
//                 System.out.print("You got "+marks+" for an "+ type);
//             }
//         }
    // class addition{
    //     addition()
    //     {
    //         System.out.println("gaand mara");
    //     }
    //     addition(int a,int b)
    //     {
            
    //         System.out.println("hatt");

    //     }
    


    // public class practice extends Point{
        
    // public static void main(String[] args) {
    
    //      Scanner sc = new Scanner(System.in);
    //      Point p1=new Point();
    //      p1.x=sc.nextDouble();
    //      p1.y=sc.nextDouble();
    //      Point p2=new Point();
    //      p2.x=sc.nextDouble();
    //      p2.y=sc.nextDouble(); 
    //      Point c1=new Point();
    //     c1.distance(p1,p2);
        
    //   }
    
    // }
    
    // class Point{
    //   double x;
    //   double y;
    
    // public static void distance(Point p1,Point p2){
    //         double d;
    //       d=Math.sqrt((p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y));
    //       System.out.println(d);
    //   }	
    // }  
// public class practice
// {
 
//  public static int x = 7;
//  public static void main(String[] args) {
 
//     practice a = new practice (); 
//     practice b = new practice (); 
//  a.x = 2; 
//  b.x = 3; 
//  System.out.println(practice.x);
//  }
// }
// class Men
// {
//  int walkingDistance(int weight)
//  {
//  System.out.println(10);
//  return 10;
//  }
// }
// class WildMen extends Men
// {
//  void walkingDistance(int weight,int a)
//  {
//  System.out.println("20");
//  }
// }
// public class practice
// {
//  public static void main(String[] args)
//  {
//  WildMen wc = new WildMen();
//  wc.walkingDistance(30);
//  }
// }
// public class practice{
//     practice() {
//         practice obj1 = new practice();
//    }
//    public static void main(String []args) {
//     practice obj = new practice();
//     System.out.println("Hello");
//    }
//    }
// class practice
// {
//     public static void main(String[] args) {
//        int a=System.in.println();
//         System.out.println(a);
//     }
// }
// class practice
// {
//     public static void main(String[] args) {
//         int year,month,date;
//         //  Calendar curr=Calendar.getInstance();
//         // month=curr.getMONTH();
//         // year=curr.getYEAR();
//         // date=curr.getDATE();
//         System.out.println(java.time.LocalDateTime.now());
        
//     }
// }
// interface Drawable{  
//     void draw();  
//     }  
//     //Implementation: by second user  
//     class Rectangle implements Drawable{  
//     public void draw(){System.out.println("drawing rectangle");}  
//     }  
//     class Circle implements Drawable{  
//     public void draw(){System.out.println("drawing circle");}  
//     }  
//     //Using interface: by third user  
//     class practice{  
//     public static void main(String args[]){  
//     Drawable d=new Rectangle();//In real scenario, object is provided by method e.g. getDrawable()  
//     d.draw();  
//     }}  
//  interface number{
//      int findsqr(int i);
//  }
//  class a implements number{
//      int i,square;
//      public int findsqr(int i)
//      {
//          square=i*i;
     
//      return square;
//      }
//     }

//     class practice
//     {
//         public static void main(String[] args) {
//             a aa=new a();
//             Scanner sc=new Scanner(System.in);
//             int i=sc.nextInt();
//             System.out.println(a.findsqr(i));
//         }
//     }
// import java.util.Scanner;
// public class practice{
// 	public static void main (String   args[ ] ) {
//            Scanner scan = new Scanner(System.in);
//             int i = scan.nextInt();
// 	    int j; 
//               try {
// 	         switch (i) {
// 		    case 0 : 
// 			int zero = 0; 
// 			j = 92/ zero; 		
// 			break;
// 		    case 1 : 
// 			int b[ ] = null; 
// 			j = b[0] ; 	
// 			break;
// 	           default:
// 		       System.out.println("No exception");
// 		    } 		
// 	      }
//             // catch block			
// 		catch (Exception e) {		
// 		   System.out.println(e) ;
// 		}

//  }
// }
// import static java.lang.Math.*;
//  class practices{
// public static void main(String args[]){ 
// System.out.println(cos(2*PI));
// }
// }
// import java.lang.System.*;
// class main
// {
//     public static void main(String[] args) {
//         out.println("hii");
//     }
// }
// class practice
// {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         for(int i=0;i<s.length();i++)
//         System.out.println(s.charAt(i));
//     }
// }
// class practice
// {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.next();
//         char a[]=s.toLowerCase().toCharArray();
//         Arrays.sort(a);
//         System.out.println(a);
//     }
// }


    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     String s=sc.nextLine();
    //     System.out.println("no trim length  - "+s.length());
    //     System.out.println("trim length"+s.trim().length());
    // }
//     public static void main(String[] args) 
// {
//   Scanner scan = new Scanner(System.in);
//   String s=scan.nextLine();
// //Complete the code
//     if (s.trim().length()==0 || s.trim().length()>400000)
//     {
//         System.out.println(0);
//         return;
//     }

//     String words[]=s.trim().split("[ !,?.\\_'@]+");
//     System.out.println(words.length);
//     for (String word:words)
//         System.out.println(word);
// }
    // Scanner in = new Scanner(System.in);
    // int testCases = Integer.parseInt(in.nextLine());
    // while(testCases-->0){
    //     String pattern = in.nextLine();
    //     try{
    //         Pattern.compile(pattern);
    //         System.out.println("Valid");
    //     }
    //     catch(PatternSyntaxException e)
    //     {
    //         System.out.println("Invalid");
    //     }
        
    //       //Write your code
    // }
//     int a=10;
//     int b=10;
//     if(a == b)
//             System.out.println("yes ");
//     else
//      System.out.println("no");
// }



// static int[] input(int n,int[]a)
// {
//     Scanner sc= new Scanner(System.in);
//     for(int i=0;i<n;i++)
//     {
//         a[i]=sc.nextInt();
//     }
//     Arrays.sort(a);
//     return a;
// }
// public static void main (String[] args)
// {
//     Scanner sc= new Scanner(System.in);
//     // your code goes here
//     int t=sc.nextInt();
//     int min=0;
//     while(t-->0)
//     {
//         int n=sc.nextInt();
//         int a[]=new int[n];
//         a=input(n,a);
//         System.out.println(a[0]+a[1]);
        
//     }
// }
// }
//  public static void main(String[] args) {
//     static final boolean flag = true; // class attribute ...
//     s: {
//         if (flag) break s;
//         System.out.println("I am not supposed to print this");
//     }
//     System.out.println("I am suppose to print this");
//  }
// class practice
// {
// public static void main(String[] args) {
//     char a='A';
//     for(int i=0;i<=5;i++)
//     {
//         for(int j=0;j<=i;j++)
//             System.out.printf("%c",a+j);
//         System.out.println();
//     }
    
// }
// }
// class bank
// {
//     String name;
//     private int balance;
//     public void setter(int balance){
//         this.balance=balance;
//     }
//     public long getter(){
//         return this.balance;
//     }
// }
// public class practice{
//     public static void main(String[] args) {
//         bank b1=new bank();
//         b1.name="yash";
//         b1.setter(10000000);
//         System.out.println("Bank Balance of "+b1.name+" is "+b1.getter());

//     }
// }



// class practice{
//     public static void dum(int n,int r)
//     {
//         if(n<4-r)
//         {
//             System.out.print(" ");
//             dum(n++,r);
//         }
//     }
//     public static void main(String[] args) {
//         int r=1;
//         int n=0;
//         String o=" * ";
//         for(int i=0;i<4;i++)
//         {
//             dum(n,r);
//             String l= o.repeat(r);
//             System.out.println("l");
//             r++;
//             System.out.println();
//         }
//     }
// }

class practice
{
    int a=15;
    {
        a=20;
        
    }
    public void  m1()
    {
        a=43;
    }
    public static void main(String[] args) {
        // boolean a= true;
        // int b=2;
        // if(a){
        //     int c=b*2;
        //     System.out.println(c);
        // }
        // int c=0;
        // System.out.print(c);
        
        // while(true)
        // System.out.println("hello");
        practice p=new practice();
        System.out.println(p.m1());


    }
}
