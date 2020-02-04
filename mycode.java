public class  mycode 
{static int i=10;
 static int r=4;
 static int c=4;
 static int[][] array=new int[r][c];     
    public static void main(String[] args) 
    { myinput(array);
      myoutput(array);
        
    }
 public static void myinput(int[][] array)
 {
     for(int index=0;index<r;index++)
     {
         for(int index1=0;index1<c;index1++)
         {
             array[index][index1]=i++;
         }

     }
 }
    
 public static void myoutput(int[][] array)
 {
     for(int index2=0;index2<r;index2++)
     {
         for(int index12=0;index12<c;index12++)
         {
             System.out.print(array[index2][index12] +"\t");
         }
         System.out.println( );

     }
 }
}