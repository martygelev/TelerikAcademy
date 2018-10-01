using System;

namespace Game
{
    class Program
    {
        static void Main(string[] args)
        {
            int input = int.Parse(Console.ReadLine());

            int third = input % 10;
            int second = (input / 10) % 10;
            int first = input / 100;

            int sum = first + second + third;
            int ch1 = first * second + third;
            int ch2 = first + second * third;
            int mult = first * second * third;

            int max = Math.Max(sum, Math.Max(ch1, Math.Max(ch2, mult)));

            Console.WriteLine(max);
        }
    }
}
