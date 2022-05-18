import java.util.*;
import java.io.*;
class errorcrc
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       int []data;
       int []msg;
       int []gen;
       int []rem;
       int []crc;
       
       int data_bits,gen_bits,tot_length;
       System.out.println("enter the no of data");
       data_bits=s.nextInt();
       data=new int[data_bits];

       System.out.println("enter the data");
       for(int i=0;i<data_bits;i++)
       data[i]=s.nextInt();

       System.out.print(Arrays.toString(data)) ;
       System.out.println("enter the number of generator bits");
       gen_bits=s.nextInt();
       gen=new int[gen_bits];

       System.out.println("enter the  generator bits");
       for(int i=0;i<gen_bits;i++)
       gen[i]=s.nextInt();

       System.out.println(Arrays.toString(gen));
       tot_length= data_bits+gen_bits-1;
       msg=new int[tot_length];
       rem=new int[tot_length];
       crc=new int[tot_length];

       for(int i=0;i<data.length;i++)
       msg[i]=data[i];

       System.out.println("message after adding 0's are:");
       System.out.println(Arrays.toString(msg));
       for(int i=0;i<msg.length;i++)
       rem[i]=msg[i];

       rem=xor(gen,rem);
       for(int i=0;i<msg.length;i++)
       crc[i]=msg[i]^rem[i];

       System.out.println();
       System.out.println("crc code");
       System.out.println(Arrays.toString(crc));
       System.out.println("enter the crc code of"+tot_length+" bits");
       for(int i=0;i<msg.length;i++)
       rem[i]=s.nextInt();

       rem=xor(gen,rem);
       for(int i=0;i<rem.length;i++)
       {
        if(rem[i]!=0)
        {
            System.out.println("error");
            break;
        }
            if(i==rem.length-1)
            System.out.println("no error");
       }
       System.out.println("thank you..");
    }
    static int[] xor(int gen[],int rem[])
    {
        int curr=0;
        while(true)
        {
        for(int i=0;i<gen.length;i++)
        {
            rem[curr+i]=rem[curr+i]^gen[i];
        }
            while(rem[curr]==0 && curr!=rem.length-1)
            curr++;
            if((rem.length-curr)<gen.length)
            break;
        }
           return rem;
    }
}