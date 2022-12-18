/*Задайте массив, заполненный случайными положительными трехзначными числами.
Напишите программу, которая покажет количество четных чисел в массиве.
*/

int GetNumber(string message)

{
    int result;
    while (true)
    {
        Console.WriteLine(message);
        if (int.TryParse(Console.ReadLine(), out result) && result > 0)

        {
            break;
        }
        else
        {
            Console.WriteLine("Введите корректное число");
        }
    }
    return result;
}

int dimension = GetNumber("Введите положительное трехзначное число");

int[] InitArray(int dimension)

{

    Random rnd = new Random();
    int[] array = new int[dimension];


    for (int i = 0; i < dimension; i++)
    {
        array[i] = rnd.Next(99, 999);
    }
    return array;
}

int[] array = InitArray(dimension);

int count = 0;

for (int i = 0; i < array.Length; i++)
    if (array[i] % 2 == 0)
        count++;

Console.WriteLine($" {count} чисел в массиве чётные");

