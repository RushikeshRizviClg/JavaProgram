import java.io.DataInputStream; //load class for input
class MatrixMultiplication3
{
public static void main(String args[ ])
{
outer:{
int i , j , k; //variable declaration
int mul[][]=new int[0][0];//declaring and creating arrays for initialization
 int set1[ ][ ]=new int[0][0];
 int set2[ ][ ]=new int[0][0];
int r1=0;//initialising values
 int c1=0;
 int r2=0;
 int c2=0;
DataInputStream in=new DataInputStream(System.in);
try
{
 System.out.println("Enter the size of First matrix (row & column) :\n");
 System.out.println(" Enter size of the row ");
 r1=Integer.parseInt(in.readLine());
 System.out.println(" Enter size of the column ");
 c1=Integer.parseInt(in.readLine());
 set1=new int[r1][c1];//creating set1 arrays

 System.out.println("Enter the element of First "+r1+" * "+c1+" matrix :\n");
 for (i=0 ; i<r1 ; i++)
 {
 for (j=0 ; j<c1 ; j++)
set1[i][j]=Integer.parseInt(in.readLine());
 System.out.println(" ");
 }
 System.out.println(" ");
 System.out.println("Enter the size of Second matrix (row & column) :\n");
 System.out.println(" Enter size of the row ");
 r2=Integer.parseInt(in.readLine());
 START :System.out.println(" Enter size of the column ");
 c2=Integer.parseInt(in.readLine());
 set2=new int[r2][c2];//creating set2 arrays
 mul=new int[r1][c2];//creating add arrays
 System.out.println("Enter the element of Second "+r2+" * "+c2+" matrix :\n");
 for (i=0 ; i<r2 ; i++)
 {
 for (j=0 ; j<c2 ; j++)
set2[i][j]=Integer.parseInt(in.readLine());
 System.out.println(" ");
 }
 System.out.println(" ");
}
catch(Exception e)//handle runtime error
{
System.out.println(" I/o error");
 break outer; //bring out of outer braces
Rizvi College of Engineering
Computer Department
 15 Prof. Muhammed Ashfaque Shaikh (RCOE)
}
 System.out.println("The First "+r1+" * "+c1+" matrix is :\n");
 for (i=0 ; i<r1 ; i++)
 {
 for (j=0 ; j<c1 ; j++)
 System.out.print(set1[i][j]+"\t");//display of first arrays
 System.out.println(" ");
 }
 System.out.println(" ");
 System.out.println("The Second "+r2+" * "+c2+" matrix is : ");
 for (i=0 ; i<r2 ; i++)
 {
 for (j=0 ; j<c2 ; j++)
 System.out.print(set2[i][j]+"\t");//display of second arrays
 System.out.println(" ");
 }
 System.out.println(" ");
 if(c1!=r2)
{
System.out.println(" SIZE OF COLUMN1(matrix 1) AND ROW2(matrix 2) MUST BE SAME ");
 break outer;
}
else
{ for (i=0 ; i<r1 ; i++)
{
for (k=0 ; k<c2 ; k++)
 mul[i][k]=0;
}
 for (i=0 ; i<r1 ; i++)
 {
 for (j=0 ; j<r2 ; j++)
{
 for (k=0 ; k<c2 ; k++)
 mul[i][k] += set1[i][j] * set2[j][k] ;
}
 }
 System.out.println("The Resultant multiplication "+r1+" * "+c2+" matrix is :") ;
 for (i=0 ; i<r1 ; i++)
{
 for (j=0 ; j<c2 ; j++)
System.out.print(mul[i][j]+"\t");//displaying resultant arrays
 System.out.println(" ");
 }
}//end of else
 }//outer
}
}