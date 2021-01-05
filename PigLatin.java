import java.util.Scanner;
public class PigLatin{
  public static void main(String[] args){

  }

  public static String pigLatinSimple(String s){
          if(s.charAt(0)== 'a' || s.charAt(0)== 'e' || s.charAt(0)=='i' || s.charAt(0)== 'o' || s.charAt(0)== 'u'){
            return(s + "hay");
          }

        return(s.substring(1, s.length()) + s.charAt(0) + "ay");
  }

  public static String pigLatin(String s){
        if(s.charAt(0)== 'a' || s.charAt(0)== 'e' || s.charAt(0)=='i' || s.charAt(0)== 'o' || s.charAt(0)== 'u'){
          return(s + "hay");
        }
        else{
          String opt = s.substring(0, 2);
          String out= s.substring(2, s.length());
          if(opt.equals("bl") || opt.equals("br") || opt.equals("ch") || opt.equals("ck")|| opt.equals("cl") || opt.equals("cr")||
          opt.equals("dr")|| opt.equals("fl") || opt.equals("fr") || opt.equals("gh") || opt.equals("gl") || opt.equals("gr") ||
          opt.equals("ng") || opt.equals("ph") || opt.equals("pl") || opt.equals("pr") || opt.equals("qu") || opt.equals("sc") ||
          opt.equals("sh") || opt.equals("sk") || opt.equals("sl") || opt.equals("sm") || opt.equals("sn") || opt.equals("sp") ||
          opt.equals("st") || opt.equals("sw") || opt.equals("th") || opt.equals("tr") || opt.equals("tw") || opt.equals("wh") ||
          opt.equals("wr") ){
              return(out + opt + "ay");
          }
              return(s.substring(1, s.length()) + s.charAt(0) + "ay");
      }

    }

  public static String pigLatinBest(String s){

}

}
