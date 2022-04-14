<<<<<<< HEAD
<<<<<<< HEAD

=======
=======
>>>>>>> branch2
public class testSelectionSort
   {

   SelectionSort sort = new SelectionSort();

<<<<<<< HEAD

   @Test
   public void testPositive(){

       int[] arr = new int[5];
       arr[0] = 8;
       arr[1] = 9;
       arr[2] = 7;
       arr[3] = 10;
       arr[4] = 2;

       int[] Sortedarr = new int[5];
       Sortedarr[0] = 2;
       Sortedarr[1] = 7;
       Sortedarr[2] = 8;
       Sortedarr[3] = 9;
       Sortedarr[4] = 10;

       sort.basicSelectionSort(arr);
       assert(Arrays.equals(arr, Sortedarr));
   }

   @Test
   public void testNegative(){

       int[] arr = new int[5];
       arr[0] = -8;
       arr[1] = -9;
       arr[2] = -7;
=======
   @Test
   public void testMixed(){

       int[] arr = new int[5];
       arr[0] = 8;
       arr[1] = -9;
       arr[2] = 7;
>>>>>>> branch2
       arr[3] = -10;
       arr[4] = -2;

       int[] Sortedarr = new int[5];
       Sortedarr[0] = -10;
       Sortedarr[1] = -9;
<<<<<<< HEAD
       Sortedarr[2] = -8;
       Sortedarr[3] = -7;
       Sortedarr[4] = -2;
=======
       Sortedarr[2] = -2;
       Sortedarr[3] = 7;
       Sortedarr[4] = 8;

       sort.basicSelectionSort(arr);
       assert(Arrays.equals(arr, Sortedarr));
   }

   @Test
   public void testDuplicates(){

       int[] arr = new int[5];
       arr[0] = 8;
       arr[1] = 10;
       arr[2] = 2;
       arr[3] = 10;
       arr[4] = 2;

       int[] Sortedarr = new int[5];
       Sortedarr[0] = 2;
       Sortedarr[1] = 2;
       Sortedarr[2] = 8;
       Sortedarr[3] = 10;
       Sortedarr[4] = 10;
>>>>>>> branch2

       sort.basicSelectionSort(arr);
       assert(Arrays.equals(arr, Sortedarr));
   }
}
<<<<<<< HEAD
>>>>>>> branch1
=======
>>>>>>> branch2
