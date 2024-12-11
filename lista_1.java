using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("🐝 Partiu, Sym ou \n");

        // Exercício 1
        ImprimirSaudacao();

        // Exercício 2
        ImprimirMensagem("Tá suave demais, manda mais aí!");

        // Exercício 3
        int soma = Somar(7, 13);
        Console.WriteLine($"Soma: {soma} (Mais fácil que andar pra frente!)");

        // Exercício 4
        int produto = Multiplicar(6, 9);
        Console.WriteLine($"Multiplicação: {produto} (É número ou código de Matrix? Kkkkkk)");

        // Exercício 5
        int maior = MaiorNumero(42, 24);
        Console.WriteLine($"Maior número: {maior} (Nem precisa pensar muito)");

        // Exercício 6
        Console.WriteLine($"O número 8 é par? {EhPar(8)} (Par ou ímpar?)");

        // Exercício 7
        string dataAtual = ObterDataAtual();
        Console.WriteLine($"Data atual: {dataAtual} (Porque quem vive de passado é museu)");

        // Exercício 8
        int fatorial = CalcularFatorial(5);
        Console.WriteLine($"Fatorial de 5: {fatorial} (Parece difícil, mas foi tranquilo)");

        // Exercício 9
        string concatenacao = ConcatenarStrings("PROA acabou", " 😭 que raiva...");
        Console.WriteLine($"Concatenação: {concatenacao}");

        // Exercício 10
        decimal media = CalcularMedia(8.5m, 9.3m, 7.2m);
        Console.WriteLine($"Média: {media} (Easy)");

        Console.WriteLine("\n🚩 Ah, acabaram os exercícios... 😭\n");
        Console.WriteLine("Complicado...\n");
    }

    static void ImprimirSaudacao()
    {
        Console.WriteLine("Olá, bem-vindo ao Jajava");
    }

    static void ImprimirMensagem(string mensagem)
    {
        Console.WriteLine($"Mensagem recebida: \"{mensagem}\" (Mandou bem, tá indo!)");
    }

    static int Somar(int a, int b)
    {
        return a + b;
    }

    static int Multiplicar(int a, int b)
    {
        return a * b;
    }

    static int MaiorNumero(int a, int b)
    {
        return a > b ? a : b;
    }

    static bool EhPar(int numero)
    {
        return numero % 2 == 0;
    }

    static string ObterDataAtual()
    {
        return DateTime.Now.ToString("dd/MM/yyyy");
    }

    static int CalcularFatorial(int numero)
    {
        if (numero == 0 || numero == 1)
        {
            Console.WriteLine($"Calculando fatorial de {numero}... Moleza, já é 1!");
            return 1;
        }

        Console.WriteLine($"Calculando fatorial de {numero}... Trabalhando duro aqui!");
        return numero * CalcularFatorial(numero - 1);
    }

    static string ConcatenarStrings(string str1, string str2)
    {
        return str1 + str2;
    }

    static decimal CalcularMedia(decimal num1, decimal num2, decimal num3)
    {
        return (num1 + num2 + num3) / 3;
    }
}