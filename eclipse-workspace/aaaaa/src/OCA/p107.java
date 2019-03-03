package OCA;

public class p107 {
  
public static void main(String[] args) {
  String ta = "A "; // ta = ‘A’
  ta=ta.concat("B "); // ta = AB
  String tb = "C "; // tb = ‘C’
  ta = ta.concat(tb); // ta = ABC
  ta = ta.replace('C', 'D'); // This replace old char ‘C’ with new char ‘D’. so ta = ABD
  ta=ta.concat(tb); // ta = ABDC
  System.out.println(ta);
  }
  

}


// Shared via @Webclipse. To open this file type:
// /code-open p107.java 1-16 DNrIMg