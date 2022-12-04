/* Напишите программу, которая на вход принимает число (N), 
а на выходе показывает все четные числа от 1 до N.
5 -> 2, 4
8 -> 2, 4, 6, 8
*/
Console.WriteLine("Введите число");
string nstring = Console.ReadLine() ?? "";
int n = Convert.ToInt32(nstring);

for (int i = (1); i <= n; i++)
{
    int number = i % 2;
    if (number == 0)
    {
    Console.Write(i+ " ");    
    }
}
