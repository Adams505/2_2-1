import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
    System.out.println("wprowadz zdanie");
    String s1=scan.nextLine();
    String s2=s1.replaceALL(" ","_");
    System.out.println(s2);
  }
}
