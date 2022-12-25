/*
Напишите программу, которая на вход принимает позиции элемента в двумерном массиве,
 и возвращает значение этого элемента или же указание, что такого элемента нет.
Например, задан массив:
1 4 7 2
5 9 2 3
8 4 2 4
17 -> такого числа в массиве нет
*/
int GetNumber(string message)
{
    int result = 0;
    while (true)
    {
        Console.WriteLine(message);
        if (int.TryParse(Console.ReadLine(), out result))
        {
            break;
        }
        else
        {
            Console.WriteLine("Ввели не число");
        }
    }
    return result;
}

int rows = GetNumber("Введите количество строк: ");
int columns = GetNumber("Введите количество столбцов: ");

int[,] matrix = InitMatrix(rows, columns);
int[,] InitMatrix(int rows, int columns)
{
    int[,] matrix = new int[rows, columns];
    Random rnd = new Random();
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            matrix[i, j] = rnd.Next(1, 10);
        }
    }
    return matrix;

    if (rows < matrix.GetLength(0) && columns < matrix.GetLength(1))
    {
        Console.WriteLine(matrix[rows, columns]);
    }
    else
        Console.WriteLine($"{rows}{columns} -> такого числа в массиве нет");

}

void PrintMatrix(int[,] matrix)
{
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            Console.Write($"{matrix[i, j]} ");
        }
        Console.WriteLine();
    }

    Console.WriteLine();

}

PrintMatrix(matrix);

Console.WriteLine("Введите позицию элемента в строке: ");
int poz1 = Convert.ToInt32(Console.ReadLine()) - 1;
Console.WriteLine("Введите позицию элемента в столбце: ");
int poz2 = Convert.ToInt32(Console.ReadLine()) - 1;
if (poz1 < 0 | poz1 > matrix.GetLength(0) - 1 | poz2 < 0 | poz2 > matrix.GetLength(1) - 1)
{
    Console.WriteLine("Элемент не существует  ");
}
else
{
    Console.WriteLine("Значение элемента массива = {0}", matrix[poz1, poz2]);
}
Console.ReadLine();

