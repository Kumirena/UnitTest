/* Задайте одномерный массив, заполненный случайными числами. 
Найдите сумму элементов, стоящих на нечетных позициях.
*/

int GetNumber(string message)

{
    int result;
    while (true)
    {
        Console.WriteLine(message);
        if (int.TryParse(Console.ReadLine(), out result))

        {
            break;
        }
        else
        {
            Console.WriteLine("Ввели не число. Введите корректное число");
        }
    }
    return result;
}

int dimension = GetNumber("Введите число   ");

int[] InitArray(int dimension)

{
    int[] array = new int[dimension];
    Random rnd = new Random();


    for (int i = 0; i < dimension; i++)
    {
        array[i] = rnd.Next(1, 10);
    }
    return array;
}


int[] array = InitArray(dimension);

int sum = 0;

for (int a = 0; a < array.Length; a += 2)
    sum = sum + array[a];

Console.WriteLine($"всего {array.Length} чисел, сумма элементов, которые стоят на нечётных позициях = {sum}");

