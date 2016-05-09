import java.util.Scanner;
public class BlackJack3_2{
  
  public static void main(String[] args){
    
    //Don't change this line
    System.out.println("What`s your name??");
    Scanner in = new Scanner(System.in);
    String a = in.nextLine();
    for (int i = 1; i<4; ++i){
      int human_money = 10;
      int computer_money = 10;
      int human_bet = human_bet(a,human_money, computer_money);
      int human_total=play_human(a);
      int computer_total=play_computer();
      calculate_winner(human_total, computer_total, computer_money, human_money, a, human_bet);
    }
  }
  public static int human_bet(String a, int human_money, int computer_money){
    Scanner in = new Scanner(System.in);
    System.out.println(a+" has "+ human_money);
    System.out.println("computer has "+ computer_money);
    System.out.println("How much will you bet??");
    int b = in.nextInt(); 
    
    return b;
  }
  
  
  public static int card(){
    
    int num =(int)(Math.random()*12)+1;
    switch(num){
      case 1:
        return 1;
      case 2:
        return 2;
      case 3:   
        return 3;
      case 4:
        return 4;
      case 5:   
        return 5;
      case 6:   
        return 6;
      case 7:   
        return 7;
      case 8:   
        return 8;
      case 9:   
        return 9;
      case 10:  
        return 10;
      case 11:  
        return 10;
      case 12:  
        return 10;
      case 13:  
        return 10;
      default:  
        return 0;
    }
    
  }
  
  
  public static int play_human(String a){
    Scanner in = new Scanner(System.in);
    
    
    
    
    int human_card1 =card();
    int human_card2 =card();
    int human_total = human_card1 + human_card2;
    System.out.println(a +" got");
    System.out.println(human_card1+" and "+human_card2);
    for (int i = 1; i<4; ++i){
      System.out.println("Do you want another card (Y/N)");
      String s = in.nextLine();
      
      if(s.equals("Y")){
        human_total = human_total + (int)(Math.random()*11)+1;
        System.out.println(a +" human_total "+ human_total);
      }
      if(s.equals("N")){
        break;
      }    
    }
    return human_total;
  }
  
  
  public static int play_computer(){
    Scanner in = new Scanner(System.in);

    int computer_card1 =card();
    int computer_card2 =card();
    int computer_total = computer_card1 + computer_card2;
    System.out.println("Computer player got");
    System.out.println("");
    System.out.println(computer_card1+" and "+computer_card2);
    
    return computer_total;
  }
    
  public static void calculate_winner(int human_total, int computer_total,int computer_money, int human_money, String a, int human_bet){
    Scanner in = new Scanner(System.in);
    
    if(human_total<=21 && computer_total<human_total){
      System.out.println("Human Wins");
      System.out.println("");
      human_money= human_money + human_bet;
      computer_money= computer_money- human_bet;
      System.out.println(a+" has "+human_money);
      System.out.println("computer has" + computer_money);
      System.out.println("-------------------------------------");
      
      
    }
    else {
      System.out.println("Computer Wins");
      System.out.println("");
      human_money=human_money-human_bet;
      computer_money = computer_money+human_bet;
      System.out.println(a+" has "+human_money);
      System.out.println("computer has" + computer_money);
      System.out.println("-------------------------------------");
     
    }
    
    }
    
  }
  
  


