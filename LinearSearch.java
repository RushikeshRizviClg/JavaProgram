class LinearSearch2ex
{
 int linerSearch(int[] arr, int key)
{
 int size = arr.length;
 for(int i=0;i<size;i++)
{
 if(arr[i] == key)
{
 return i;
 }
 }
 return -1;
 }

 public static void main(String a[])
{
LinearSearch2ex ls=new LinearSearch2ex ();
 int[] arr1= {23,45,21,55,234,1,34,90};
System.out.print("ARRAY 1: ");
for (int i=0;i<arr1.length;i++)
System.out.print(arr1[i]+" -");
 int searchKey = 34;
 System.out.println("\n\n Key "+searchKey+" found at index: "+ls.linerSearch(arr1,searchKey));
 int[] arr2= {123,445,421,595,2134,41,304,190};
System.out.print("\n\n\nARRAY 2: ");
for (int i=0;i<arr2.length;i++)
System.out.print(arr2[i]+"-");
 searchKey = 421;
System.out.println("\n\n Key "+searchKey+" found at index: "+ls.linerSearch(arr2,searchKey));
 }
}