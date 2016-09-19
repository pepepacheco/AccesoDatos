import java.io.*;
class Acumulador {
  public static void main( String[ ] args )
    throws IOException
  {
     DataInputStream input = new DataInputStream( System.in );
     String bufferIn;
     int valor, total = 0;
     System.out.print("\n["+total+"] ");
     while((bufferIn = input.readLine()) != null){
        try{
         valor = Integer.parseInt( bufferIn );
        total += valor;
        }catch (NumberFormatException NFE){
            System.err.println("Lo siento no entiendo el numero");
        }finally{
            System.out.print("\n["+total+"] ");
        }
     }
     System.out.println("\n["+total+"]\n");
  }
}