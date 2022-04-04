package Testng.testing;

import org.testng.annotations.Test;

public class Flight {
  @Test(priority = 1)
  public void signUp() {
	  System.out.println("the user signed up");
  }
  
  @Test(priority = 2)
  public void signIn() {
	  System.out.println("user logged in ");
  }
  @Test(priority = 3)
  public void seachTicket() {
	  System.out.println("user search for a ticket");
  }
  @Test(priority = 4)
  public void bookTicket() {
	  System.out.println("user book the ticket");
  }
  @Test(priority = 5)
  public void saveTicket() {
  System.out.println("user save the ticket");
  }
  
  @Test(priority = 6)
  public void payTicket() {
	  System.out.println("user pay for the ticket");
  }
  @Test(priority = 7)
  public void logOut() {
	  System.out.println("user loggs out");
  }
  
  
  
  
  
}

