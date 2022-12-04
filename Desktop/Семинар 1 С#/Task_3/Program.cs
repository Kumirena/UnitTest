/* Напишите программу, которая на вход принимает число и выдает,
является ли число четным (делится ли оно на два без остатка).
4 -> да
-3 -> нет
7 -> нет
*/
Console.WriteLine("Введите число");
string nstring = Console.ReadLine() ?? "";
int n = Convert.ToInt32(nstring);

if (n % 2 == 0)
{
    Console.WriteLine("Это четное число");
}
else
{
    Console.WriteLine("Это нечетное число");
}