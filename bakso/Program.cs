using System;

class Bakso
{
    static void Main()
    {
        int height = 10;
        CreateLeaves(height);
        CreateTrunk(height); // trunk height relative to tree height
    }

    static void CreateLeaves(int t)
    {
        for (int i = 1; i <= t; i++)
        {
            for (int j = t; j > i; j--)
            {
                Console.Write(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                Console.Write("* ");
            }
            Console.WriteLine();
        }
    }

    static void CreateTrunk(int height)
    {
        int t = height;

        for (int i = 1; i<=t; i++)
        {
            for (int j = t-2; j>=0;j--)
            {
                Console.Write(" ");
            }
            Console.WriteLine("*");
        }
    }
}