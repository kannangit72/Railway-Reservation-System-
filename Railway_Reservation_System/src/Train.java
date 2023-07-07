import java.util.Scanner;
public class Train {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Trains t = new Trains();
		int useropt;
		String orgin,destination;
		while(true) {
		System.out.println("Enter 1 to book ticket");
		System.out.println("Enter 2 to Exit");
		useropt=s.nextInt();
		if(useropt==2) {
			System.out.println("--------------------------------------------------------------------------------------------");
			break;
		}
		switch(useropt) {
		case 1:
		System.out.println("Welcome to Indian Railways");
		System.out.println("Enter the Orgin :");
		orgin=s.next();
		System.out.println("Enter the Destination :");
		destination=s.next();
		if(orgin.equals("tvl") && destination.equals("ms")){
			t.tvlms();
		}
		else if(orgin.equals("tvl") && destination.equals("sct")) {
			t.tvlsct();
		}
		else if(orgin.equals("tvl") && destination.equals("tcn")) {
			t.tvltcn();
		}
		else if(orgin.equals("sct") && destination.equals("ms")) {
			t.sctms();
		}
		
		break;
		default:System.out.println("Enter the Valid Option");
		}
		}
}
}
