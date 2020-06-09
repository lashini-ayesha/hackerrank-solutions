//Write your code here
public static int B , H;
public static boolean flag=true;


static
{
  Scanner scan = new Scanner(System.in);
  B=scan.nextInt();
  H=scan.nextInt();
  if (B<=0 || H<=0)
    {
    System.out.println("java.lang.Exception: Breadth and height must be positive"); 
    flag = false;
    }
}


