import java.util.Scanner;
public class PigLatin{
  public static void main(String[] args){
    Scanner n= new Scanner(System.in);
    while(n.hasNext()){
      String input= n.nextLine().toLowerCase();
      Scanner line= new Scanner(input);
      while(line.hasNext()){
        System.out.print(pigLatinBest(line.next()));
        if( line.hasNext() == true){
          String space= " ";
          System.out.print(space);
        }
      }
      if(n.hasNextLine()) System.out.println();
    }
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
  String ret="";
  Boolean gotcase= false;
  String input = s;
if(!Character.isLetter(s.charAt(0))) return s; //if symbol is in front return input;
if(!Character.isLetter(s.charAt(s.length()-1))){
  input = s.substring(0, s.length()-1);
  gotcase= true;
}
  ret= pigLatin(input);
if(gotcase == true){
  ret = ret+ s.charAt(s.length()-1);
}
return ret;
}

}
