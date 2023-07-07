import java.util.*;
import java.util.ArrayList;
public class Trains {
	ArrayList<String> Name= new ArrayList<String>();
	ArrayList<Integer> age= new ArrayList<Integer>();
	ArrayList<String> sex= new ArrayList<String>();
	int trainno;
	String passengername;
	int rac;
	int totbookings;
	int wl;
	int totseat;
	int avlseat;
	int n,i;
	Scanner s = new Scanner(System.in);
	
	
	void tvlms() {
		System.out.println("Train From Tirunelveli to Chennai");
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("TrainNo |	TrainName			| ArrTime	|	DepTime	|	Fare|");
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("12666	| Howrah Express			| 7:55AM	|	8.00AM	|	350 |");
		System.out.println("16128	| Guruvayur Express			| 9:40AM	|	9.45AM	|	350 |");	
		System.out.println("12668	| Nagercoil Express			| 5:40PM	|	5.45AM	|	350 |");
	    System.out.println("12634	| Kanyakumari Superfast Express		| 7:15PM	|	9.45AM	|	400 |");
	    System.out.println("12632	| Nellai Superfast Express		| -----		|	7.55PM	|	400 |");
	    System.out.println("12634	| Ananthapuri Express			| 8.00PM	|	8.05AM	|	400 |");
	    System.out.println("--------------------------------------------------------------------------------------------");
	    System.out.println("Enter the Train No to Book :");
	    trainno=s.nextInt();
	    if(trainno==16128) {
	    	System.out.println("----------GURUVAYUR EXPRESS----------");
	    	details("TIRUNELVELI JUNCTION","CHENNAI EGMORE",2,3,1,2,0);
	    }
	    else if(trainno==12632) {
	    	System.out.println("----------NELLAI SUPERFAST EXPRESS----------");
	    	details("TIRUNELVELI JUNCTION","CHENNAI EGMORE",2,3,1,2,0);
	    }
	    else if(trainno==12634) {
	    	System.out.println("----------KANYAKUMARI SUPERFAST EXPRESS----------");
	    	details("TIRUNELVELI JUNCTION","CHENNAI EGMORE",2,3,1,2,0);
	    }
	    else {
	    	 System.out.println("Enter valid Train Number that Shown in the List");
	    }
	    
	}
	void sctms() {
		
			System.out.println("Train From Tirunelveli to Sengottai");
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("TrainNo |	TrainName			| ArrTime	|	DepTime	|	Fare|");
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("16102	| Kollam Express			| 3:00PM	|	3.05PM	|	370 |");
			System.out.println("20684	| Tambaram Express			| ----- 	|	4.15PM	|	435 |");
			System.out.println("20682	| Silambu SuperFast Express	        | ------	|	4.50PM	|	405 |");	
		    System.out.println("12662	| Pothigai Superfast Express		| ------	|	6.20PM	|	400 |");
		    System.out.println("--------------------------------------------------------------------------------------------");
		    System.out.println("Enter the Train No to Book :");
		    trainno=s.nextInt();
		    if(trainno==16102) {
		    	System.out.println("----------KOLLAM CHENNAI EGMORE EXPRESS----------");
		    	details("KOLLAM JUNCTION","CHENNAI EGMORE",2,3,1,2,0);
		    }
		    else if(trainno==20684) {
		    	System.out.println("----------SENGOTTAI TAMBARAM EXPRESS----------");
		    	details("SENGOTTAI","TAMBARAM",2,3,1,2,0);
		    }
		    else if(trainno==20682) {
		    	System.out.println("----------SILAMBU SUPERFAST EXPRESS----------");
		    	details("SENGOTTAI","CHENNAI EGMORE",2,3,1,2,0);
		    }
		    else if(trainno==12662) {
		    	System.out.println("----------POTHIGAI SUPERFAST EXPRESS----------");
		    	details("SENGOTTAI","CHENNAI EGMORE",2,3,1,2,0);
		    }
		    
	}
	
	void tvlsct() {
		System.out.println("Train From Tirunelveli to Sengottai");
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("TrainNo |	TrainName			| ArrTime	|	DepTime	|	Fare |");
		System.out.println("-----------------------------------------------------------------------------------------------");
	    System.out.println("06685	| Sengottai Passenger			| -----		|	9.45AM	|	 45  |");	
	    System.out.println("06681	| Sengottai Passenger			| -----		|	9.45AM	|	 45  |");
	    System.out.println("06687	| Sengottai Passenger			| ----- 	|	7.55PM	|	 45  |");
	    System.out.println("06657	| Sengottai Passenger			| ----- 	|	8.05AM	|	 45  |");
	    System.out.println("-----------------------------------------------------------------------------------------------");
	    local(45,"TIRUNELVELI","SENGOTTAI");
	}
	
	void tvltcn() {
		System.out.println("Train From TIRUNELVELI  TO  TIRUCHENDUR");
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("TrainNo |	TrainName			| ArrTime	|	DepTime	|	Fare |");
		System.out.println("-----------------------------------------------------------------------------------------------");
	    System.out.println("06685	| Tiruchendur Passenger			| -----		|	9.45AM	|	 45  |");	
	    System.out.println("06681	| Tiruchendur Passenger			| -----		|	9.45AM	|	 45  |");
	    System.out.println("06687	| Tiruchendur Passenger			| ----- 	|	7.55PM	|	 45  |");
	    System.out.println("06657	| Tiruchendur Passenger			| ----- 	|	8.05AM	|	 45  |");
	    System.out.println("-----------------------------------------------------------------------------------------------");
	    local(40,"TIRUNELVELI JUNCTION","TIRUCHENDUR");
	}	
	
	void local(int ticketprice,String orgin,String destination) {
				
		while(true) {
			System.out.println("FROM   "+orgin+" ----->  "+destination);
			System.out.println("TicketPrice Per Person is : "+ticketprice);
			System.out.println();
			System.out.println("Enter 1 to book ticket");
			System.out.println("Enter 2 to Exit");
			int useropt=s.nextInt();
			
		switch(useropt) {
		case 1:
		System.out.println("Enter the number of Persons Travelling :");
		int pass=s.nextInt();
		int totalprice=pass*ticketprice;
		System.out.println();
		System.out.println("---------------Travelling Ticket--------------   |");
		System.out.println("|    FROM : "+orgin+" TO "+destination+"  |");
		System.out.println("|          Number of Persons : "+pass+"                 |");
		System.out.println("|        Total Price : "+totalprice+"                       |");
		System.out.println("|            Happy Journey                       |");
		break;
		}
		if(useropt==2) {
			break;
		}
		}
	}
	public void details(String orgin,String destination,int avlseat,int totseat,int totbookings,int rac,int wl) {
        System.out.println(" FROM "+orgin+"   TO  "+destination);
         while(true) {
           System.out.println("----------------------------------------------");        
           System.out.println("                                 "); 
           System.out.println("Available Seat is : "+avlseat);
			System.out.println("Waiting List is : "+wl);
			System.out.println("Totalbookings is : "+totbookings);
			System.out.println("------------------------------");
			
			System.out.println("------------------------------------");
			System.out.println("|                                  |");
			System.out.println("|   Enter 1 to Book Tickets        |");
			System.out.println("|   Enter 2 to check Availability  |");
			System.out.println("|   Enter 3 to Print Tickets       |");
			System.out.println("|   Enter 4 to Exit                |");
			System.out.println("|                                  |");
			System.out.println("------------------------------------");
			System.out.println("                                    ");
			int useropt=s.nextInt();
			
			switch(useropt) {
		 
			case 1:
			
        System.out.println("Enter the Number of Passenger to Book (Maximum Limit 4 Member Per Ticket ) : ");
        n=s.nextInt();
        int r=1;
		for(i=0;i<n;i++) {
			System.out.println("Enter the Passenger Number "+i+" Details : ");
			System.out.println("Enter the Passenger Name :");
			Name.add(s.next());
		    System.out.println("Enter the Passenger age : ");	
			age.add(s.nextInt());
			System.out.println("Enter the Passenger Male (or) Female : ");
			sex.add(s.next());
			avlseat--;
			totbookings++;
			if(avlseat>0) {
				System.out.println("Conformed");
			}
			if(avlseat<0) {
				rac--;
				System.out.println("RAC : "+r);
				avlseat=0;
				r++;
			} 
			if(rac<0) {
					wl++;
					System.out.println("Wait List : "+wl);
					rac=0;
				}
	}	
		break;
		
		case 2:
		System.out.println("----------Current Position----------");
		System.out.println("Available Seat is : "+avlseat);
		System.out.println("Waiting List is : "+wl);
		System.out.println("Totalbookings is : "+totbookings);    
		System.out.println("RAC Seats is : "+rac);
		break;
		
		case 3:
			for(int i=0;i<n;i++) {
				System.out.println("Passenger Name is : "+Name.get(i));
				System.out.println("Passenger Age is : "+age.get(i));
				System.out.println("Passenger M/F is : "+sex.get(i));
			}
			break;
			}
			
			if(useropt==4) {
				break;
			}
			
         }
	}
}
         
         

