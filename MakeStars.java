import java.util.Scanner;
public class MakeStars{
  public static void main( String[]args ){
    String cat = "*";
    String blank= " ";
      //use the standard input (terminal input)
      //as the string that you read from
      Scanner n = new Scanner( System.in );
      while(n.hasNextLine() == true){
        String line= n.nextLine();
        Scanner scanline= new Scanner(line);
          while(scanline.hasNext() == true){
            String word= scanline.next();
              for(int i=0; i< word.length(); i++){
                System.out.print("*");
              }
              if(scanline.hasNext()){
                System.out.print(blank);
              }
          }
          if(n.hasNextLine()){
        System.out.println();
        }
      }
    }

}
      //use hasNextLine()/nextLine() to loop over
      //all of the data

      //If you want to read the input word by word
      //this can be replaced with hasNext() and next()
