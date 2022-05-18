import java.util.Scanner;
class marks{

public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("enter the total marks");
    int total_mark=s.nextInt();
    float a[]=new float[10];
    float sum= 0.0f;
    for(int i=1;i<6;i++)
    {
        System.out.println("marks for "+i+" subject");
        a[i]=s.nextFloat();
        sum+=a[i];
    }
    float total=sum/(total_mark*5)*100;
    System.out.println("marks obtained is "+total);
    s.close();
    


}
}