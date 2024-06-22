import java.io.*;
import java.util.Scanner;
class busapp2{
	public static void main(String[] args)throws IOException 
		{
			Scanner sc = new Scanner(System.in);
 
     


			busapp2  bs= new busapp2();
			
			//String [][]bss=bs.add();
			//bs.display(bss);
			String bss[][]=new String[3][4];
			int a=1;
			while (a !=0)
			{
				   System.out.println("enter 1 for  add the buss \n 2 for show all buss \n 3 for book the bus");
                  a = sc.nextInt();
                  switch(a)
                  {
                  case 1:
                  	bs.add(bss);
                  	break;

                  
                   case 2:
                   	bs.display(bss);
                   	break;
                   case 3:
                   	if(isavaiable(bss))
                   	{
                   		System.out.println("booked succfully.!!!!!!");
                   	}
                   	else
                   	{
                   		System.out.println("sorry seat are not .!!!!!!");
                   	}
                   	break;
                   }

              

			}



		}
		String[][] add(String[][]bss)
		{
			Scanner sc = new Scanner(System.in);
 
        
        
		 
		 for(int i=0; i<3; i++)
		 {
		 	 System.out.println(" enter number 0 for busid \n 1 for start_location \n 2 for to_location \n 3 for qunitiy for buss");
		 	for (int j=0; j<4;j++)
		 	{
        System.out.println(" enter for "+j);
        String bus = sc.next();
        bss[i][j]=bus;
         System.out.println(" done");
		 	}
		 }
		
		 return bss;
		}

		void display(String [][] bss)
		{
			System.out.println("     |    BUS NO     | FORM LOCATION | TO LOCATION |  CAPACITY   |");
			for(int i=0; i<bss.length; i++)
		 {
		 	System.out.print("  ");
		 	for (int j=0; j<4;j++)
		 	{
         System.out.print("           "+bss[i][j]+"           ");
      
        
		 	}
		 	System.out.println();
		 }

		}

		public static boolean isavaiable(String [][] bss)
		{
			Scanner sc = new Scanner(System.in);
 
        System.out.println("enter bus number");
        int  bn = sc.nextInt();
        boolean r=true;
			for(int i=0; i<bss.length; i++)
		 {
		 	if(bn==Integer.parseInt(bss[i][0]))
		 	{
		 	 
		  int q=Integer.parseInt(bss[i][3]);
		  q--;
		  bss[i][3]= Integer.toString(q);
		  if (Integer.parseInt(bss[i][0])>0 )
		  {
            r=true;
		  }
		  else
		  {
		  	r=false;

		  }
		}
        
     }
      
        
		return r; 	
		 	

		 }

		 	}