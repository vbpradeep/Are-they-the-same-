import java.io.BufferedReader;
import java.io.InputStreamReader;

class Same {
    public static void main(String args[] ) throws Exception {
               String Flag="NO";
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                 String st1=in.readLine();
                 String st2=in.readLine();
                 if(st1.length()==st2.length())
                 {
                     for(int i=0;i<st1.length();i++)
                     {
                        CharSequence ch=String.valueOf(st1.charAt(i));
                      if(st2.contains(ch))
                      {
                          st2=st2.replaceFirst(ch.toString(),"");
                          Flag="YES";
                      }
                      else
                      {
                          Flag="NO";
                          break;
                      }
                     }
                 }
                 System.out.println(Flag);
              }
}
