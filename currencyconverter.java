import java.util.Scanner;
class currencyconverter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("which currency You want to Convert ? ");
		System.out.println("1:Ruppe \t2:Dollar \t3:Pound \n4:Euro \t5:Yen \t6:Ringgit ");
		int code = sc.nextInt();
        System.out.println("to which currency You want to Convert ? ");
        System.out.println("1:Ruppe \t2:Dollar \t3:Pound \n4:Euro \t5:Yen \t6:Ringgit ");
        int code1 = sc.nextInt();		
		System.out.println("How much Money you want to convert ?");
		float amount = sc.nextFloat();
        if(code==1)
        {
            if(code1==1)
            System.out.println(amount);
            if(code1==2)
            System.out.println("the dollar amount is "+amount/70);
            if(code1==3)
            System.out.println("the pound amount is "+amount/88);
            if(code1==4)
            System.out.println("the euro amount is "+amount/80);
            if(code1==5)
            System.out.println("the yen amount is "+amount/0.63);
            if(code1==6)
            System.out.println("the ringgit amount is "+amount/16);
        }
        else if(code==2)
        {
            if(code1==1)
            System.out.println("the ruppe amount is "+amount* 70);
            if(code1==2)
            System.out.println(amount);
            if(code1==3)
            System.out.println("the pound amount is "+amount*0.78);
            if(code1==4)
            System.out.println("the euro amount is "+amount*0.87);
            if(code1==5)
            System.out.println("the yen amount is "+amount*111.087);
            if(code1==6)
            System.out.println("the ringgit amount is "+amount*4.17);
        }
        else if (code==3)
        {
            if(code1==1)
            System.out.println("the ruppe amount is "+amount* 88);
            if(code1==3)
            System.out.println(amount);
            if(code1==2)
            System.out.println("the dollar amount is "+amount*1.26);
            if(code1==4)
            System.out.println("the euro amount is "+amount*1.10);
            if(code1==5)
            System.out.println("the yen amount is "+amount*140.93);
            if(code1==6)
            System.out.println("the ringgit amount is "+amount*5.29);
        }
        else if(code==4)
        {
            if(code1==1)
            System.out.println("the ruppe amount is "+amount* 80);
            if(code1==4)
            System.out.println(amount);
            if(code1==2)
            System.out.println("the dollar amount is "+amount*1.14);
            if(code1==3)
            System.out.println("the pound amount is "+amount*0.90);
            if(code1==5)
            System.out.println("the yen amount is "+amount*127.32);
            if(code1==6)
            System.out.println("the ringgit amount is "+amount*4.27);
        }
        else if(code==5)
        {
            if(code1==1)
            System.out.println("the ruppe amount is "+amount* 0.63);
            if(code1==5)
            System.out.println(amount);
            if(code1==2)
            System.out.println("the dollar amount is "+amount*0.008);
            if(code1==3)
            System.out.println("the pound amount is "+amount*0.007);
            if(code1==4)
            System.out.println("the euro amount is "+amount*0.007);
            if(code1==6)
            System.out.println("the ringgit amount is "+amount*0.037);
        }
        else if(code==6)
        {
            if(code1==1)
            System.out.println("the ruppe amount is "+amount* 1.68);
            if(code1==6)
            System.out.println(amount);
            if(code1==2)
            System.out.println("the dollar amount is "+amount*2.239);
            if(code1==3)
            System.out.println("the pound amount is "+amount*0.118);
            if(code1==4)
            System.out.println("the euro amount is "+amount*0.209);
            if(code1==5)
            System.out.println("the ringgit amount is "+amount*26.63);
        }
        else
        {
            System.out.println("invalid input try again:");
        }
        

    }
}