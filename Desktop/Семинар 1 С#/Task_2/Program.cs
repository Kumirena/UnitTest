/* Напишите программу, которая принимает на вход три числа и
выдает максимальное из этих чисел.
2, 3, 7 -> 7
44 5 78 -> 78
22 3 9 -> 22
*/
Console.WriteLine("Введите первое число");
string nfirst = Console.ReadLine() ?? "";
int n1 = Convert.ToInt32(nfirst);

Console.WriteLine("Введите второе число");
string nsecond = Console.ReadLine() ?? "";
int n2 = Convert.ToInt32(nsecond);

Console.WriteLine("Введите третье число");
string nthird = Console.ReadLine() ?? "";
int n3 = Convert.ToInt32(nthird);

int max = n1;

if (n1 > max) max = n1;
if (n2 > max) max = n2;
if (n3 > max) max = n3;

Console.Write("max = ");
Console.WriteLine(max);
