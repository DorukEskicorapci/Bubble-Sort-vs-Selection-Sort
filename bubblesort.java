import java.util.Random;
import java.util.Scanner;
    
public class bubblesort {
    
    static void SelectionSort(int array[]){
        
        

        int small = 0;

        System.out.print("Original Order: ");
        for(int i = 0;i<array.length; i++){
          System.out.print(array[i] + " ");
        }

        for(int i = 0; i < array.length;i++){
            for(int j = i + 1; j < array.length;j++){
                if(array[i] > array[j]){
                    small = array[i];
                    array[i] = array[j];
                    array[j] = small;
                }
            }
        }
        System.out.println();
        System.out.print("Ordered Series: ");
        for(int i = 0; i < array.length;i++){

           System.out.print(array[i] + " ");

        }

    
    }


    static void BubbleS(int array[]){

    

    int temp = 0;
    
    System.out.print("Original Order: ");
      for(int i = 0;i<array.length; i++){
        System.out.print(array[i] + " ");
      }

    for (int i = 0; i < array.length - 1; i++) {
        
        for (int j = 0; j < array.length - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                    
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
      }

      
      System.out.println();
      System.out.print("Ordered Series: ");
      for(int i = 0;i<array.length; i++){
        System.out.print(array[i] + " ");
      }
    }

    static void timer(int array[], int orig[]){
        original(array, orig);
        double start = System.currentTimeMillis();

        BubbleS(array);

        double end = System.currentTimeMillis();
        double time = end - start;

        System.out.println();
        System.out.print("Time elapsed in ms for Bubble Sort: ");
        System.out.print(time);
        
        System.out.println();
        System.out.println();

        original(array, orig);
        double start2 = System.currentTimeMillis();
        
        SelectionSort(array);
        
        double end2 = System.currentTimeMillis();
        double time2 = end2 - start2;

        System.out.println();
        System.out.print("Time elapsed in ms for Selection Sort: ");
        System.out.print(time2);

        System.out.println();
        System.out.println("------------------");
        System.out.println("Summary: ");
        System.out.println();
        System.out.print("Time elapsed for Selection Sort: ");
        System.out.print(time2 + " ms");
        System.out.println();
        System.out.print("Time elapsed for Bubble Sort: ");
        System.out.print(time+ " ms");
    }

    static void driver(int array[], int orig[]){
        
        Scanner myObj = new Scanner(System.in);
        System.out.println();


        
        


        System.out.println();
        System.out.println("1. Bubble Sort");
        System.out.println("2. Previous Alghoritm (Selection Sort)");
        System.out.println("3. No");
        System.out.print("Do you want to test a spesific algorithm again?: ");
        int function = myObj.nextInt();

        System.out.println();

        if(function == 1){
        
            original(array, orig);
            double start = System.currentTimeMillis();

            BubbleS(array);
    
            double end = System.currentTimeMillis();
            double time = end - start;
    
            System.out.println();
            System.out.print("Time elapsed in ms for Bubble Sort: ");
            System.out.print(time);

        

        } else if (function == 2){
            original(array, orig);
            double start2 = System.currentTimeMillis();
        
            SelectionSort(array);
        
            double end2 = System.currentTimeMillis();
            double time2 = end2 - start2;

            System.out.println();
            System.out.print("Time elapsed in ms for Selection Sort: ");
            System.out.print(time2);
        } else {}       
        
    }
    

    static void original(int array[], int orig[]){

        for(int i = 0;i<array.length; i++){
            array[i] = orig[i];
        }
    }


    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        boolean check = false;

        System.out.print("How many numbers do you want to test with?: ");
        int count = myObj.nextInt();
        
        System.out.println();

        int[] array = new int[count];
        int[] orig = new int[count];
        for(int i = 0; i< count; i++){
            
            //int random = (int) (Math.random() * 100);
            //int random = random.nextInt(100 + 10) - 10;
            int random = new Random().nextInt(100 + 100) - 100;
            array[i] = random;
            orig[i] = array[i];
        }

        
        original(array, orig);
        timer(array, orig);
        original(array, orig);
        driver(array, orig);

        
        while(check == false){
            
            System.out.println();
            System.out.println();
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Try again?: ");
            int check2 = myObj.nextInt();
                if(check2 != 1){
                    check = true;
                } else if (check2 == 1){
                    System.out.println();
                    original(array, orig);
                    timer(array, orig);
                    System.out.println();
                    original(array, orig);
                    driver(array, orig);
                }
        }
        System.out.println();

    }
}
