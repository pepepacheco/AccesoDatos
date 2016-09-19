import java.io.*;
 
class FileIO{
public static void main(String [] args)
   throws FileNotFoundException, IOException{
 
   FileInputStream in = new FileInputStream(args[0]);
   FileOutputStream out = new FileOutputStream(args[1]);
 
   int n=0,c;
   System.out.print ("\nCopiando ...");
   while( (c = in.read()) != -1){
      out.write(c);
      n++;
   }
   in.close();
   out.close();
   System.out.print ("\nSe han copiado "+n+" caracteres\n");
}}