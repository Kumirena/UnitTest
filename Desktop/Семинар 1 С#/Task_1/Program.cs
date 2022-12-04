/*Напишите программу, которая на вход принимает два числа и выдает,
какое число большее, а какое меньшее.
a = 5; b = 7 -> max = 7
a = 2; b = 10 -> max = 10
a = -9; b = -3 -> max = -3
*/
Console.WriteLine ("Введите первое число");
string nfirst = Console.ReadLine() ?? "";
int n1 = Convert.ToInt32(nfirst);

Console.WriteLine ("Введите второе число");
string nsecond = Console.ReadLine() ?? "";
int n2 = Convert.ToInt32(nsecond);

if(n2 > n1)
{
    Console.Write($"Большее число {n2}");  
}
if(n1 == n2)
{
    Console.WriteLine($"Числа равны {n1}={n2}");
}
if(n1 > n2)
{
    Console.WriteLine($"Большее число {n1}");
}