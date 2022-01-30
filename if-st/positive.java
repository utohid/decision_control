class positive {
  public static void main (String args[])
{ 
   int number;
    Scanner sr=new Scanner(System.in);
    
    System.out.println("Enter an number");
    number=sr.nextInt();
    
    if(number>0)
    {
      System.out.println("The number is positive ");
    }
    else {
    System.out.println("The number is negative ");
    }
}
}
