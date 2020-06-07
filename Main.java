import java.util.Random;

class Main {
  public static void main(String[] args) {
    int a = 0, b = 1;
    int[][] mas1 = new int[8][8];
    System.out.println("№1\n");
    for (int i = 0; i < 8; i++)
    {
      for (int j = 0; j < 8; j++)
      {
        if(j % 2 != 0)
        {
          mas1[i][j] = a;
        }
        else
        {
          mas1[i][j] = b;
        }
        System.out.print(mas1[i][j] + "\t");
      }
      if(i % 2 != 0)
      {
        a = 0; b = 1;
      }
      else
      {
        a = 1; b = 0;
      }
        System.out.println();
    }

    int[][] mas2 = new int[10][10];
    Random rnd = new Random();
    System.out.println("\n№2\n");
    for(int i = 0; i < 10; i++){
      for(int j = 0; j < 10; j++)
      {
        mas2[i][j] = rnd.nextInt(99) + 1;
        System.out.print(mas2[i][j] + "\t");
      }
      System.out.println();
    }

    System.out.println("\n№3\n");
    int num = 1;
    for(int i = 0; i < 10; i++)
    {
      int sum = 0;
      for (int j = 0; j < 10; j++)
      {
        sum = sum + mas2[i][j];
      }
        System.out.println("Сумма " + num + " строки равна - " + sum);
        num++;
    }

    System.out.println("\n№4\n");
    for(int i = 0; i < 10; i++)
    {
      num = i + 1;
      System.out.print("В строке "+ num + " есть простые числа:  ");
      for(int j = 0; j < 10; j++)
      {
        b = 1;
        int g = mas2[i][j];
        for(int l = 1; l < g; l++)
        {
          if(g % l == 0) b++;
        }
        if(b == 2)
        {
          System.out.print( g + " ");
        }
      }
      System.out.println();
    }
  }
}