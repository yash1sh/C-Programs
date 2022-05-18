
//--------------------------Dispatch------------------------
// class one
// {
//     public void name()
//     {
//         System.out.println("one");
//     }
// }
// class two extends one
// {
//     public void tname()
//     {
//         System.out.println("two");
//     }
// }
// class codewithharrypract
// {
//     public static void main(String[] args) {
//         one two = new two ();
//         two.name();
//         // two.tname();  NOT ALLOWED
        

//     }
// }

//-----------------absract-----------------------------------------
// abstract class base2
// {
//     public base2()
//     {
//         System.out.println("bi am base2");
//     }
//     public void haahaa()
//     {
//         System.out.println("after2");
//     }
//     abstract public void greet();   // if class has a abstarct then class should also be a abstarct
// }
// class base3 extends base2
// {
//     @Override
//     public void greet()
//     {
//         System.out.println("hello");
//     }
// }

// class codewithharrypract
// {
//     public static void main(String[] args) {
//         base3 base=new base3();
//         base.greet();
//         base.haahaa();
//     }
// } 

// class printm {
//     printm()
//    {
//        this(5);
//        System.out.println("hello");
//    }
//     printm(int x)
//    {

//        System.out.println("hey "+x);
//        new printm();

//    }
// }
// class codewithharrypract{
//    public static void main(String[] args) {
       
//        printm andThis = new printm(50);
//    }
   



// class codewithharrypract implements Runnable{
// public void run(){
//     System.out.println("thread is runing");
// }

//     public static void main(String[] args) {
//         codewithharrypract t1=new codewithharrypract();
//         Thread t2=new Thread(t1);
//         t2.start();
        
//     }
// }
// public class codewithharrypract  
// {  
// // Main method  
// public static void main(String argvs[])  
// {  
// // creating an object of the Thread class using the constructor Thread(String name)   
// Thread t= new Thread("My first thread");  
  
// // the start() method moves the thread to the active state  
// t.start();  
// // getting the thread name by invoking the getName() method  
// String str = t.getName();  
// System.out.println(str);  
// }  
// }  
