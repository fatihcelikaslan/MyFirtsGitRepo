package OCA;

public class p109 {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder(5);
    String s = "";
    if(sb.equals(s)) System.out.println("Match1");
    else if(sb.toString().equals(s.toString())) System.out.println("Match2");
    else System.out.println("No match");

  }

}


// Shared via @Webclipse. To open this file type:
// /code-open p109.java 1-14 EER5cA