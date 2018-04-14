import java.util.*;

class LeadGame{		 
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		 
		        int N = sc.nextInt();
		        int p1 = 0, p2 = 0;
		        int lead = 0, win = 0;
		 
		 
		        for(int i=1;i<=N;i++){
		            int score1 = sc.nextInt(), score2 = sc.nextInt();
		            p1 += score1; p2 += score2;
		            if(Math.abs(p1-p2) > lead) {
		                lead = Math.abs(p1-p2);
		                win = (p1 > p2)? 1: 2;
		            }      
		        }
		 
		        System.out.println(win+" "+lead);
		    }
		 
		
		 
	}


