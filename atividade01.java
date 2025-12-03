void main() {
    Scanner sc = new Scanner(System.in);

    double[] notas = new double[8];

    for (int i = 0; i < 8; i++) {
        IO.print("Digite a nota do " + (i + 1) + "º bimestre: ");
        notas[i] = sc.nextDouble();
    }

    double primeiroSemestre = (notas[0] + notas[1]) / 2;
    double segundoSemestre = (notas[2] + notas[3]) / 2;
    double terceiroSemestre = (notas[4] + notas[5]) / 2;
    double quartoSemestre = (notas[6] + notas[7]) / 2;

    double mF = (primeiroSemestre + segundoSemestre + terceiroSemestre + quartoSemestre) / 4;


    IO.println("\n===== Resultado da Média Final =====\n");

    IO.println("1º Bimestre: " + notas[0]);
    IO.println("2º Bimestre: " + notas[1]);
    IO.println("1º Semestre: " + primeiroSemestre);
    IO.println("-----------------------------");

    IO.println("3º Bimestre: " + notas[2]);
    IO.println("4º Bimestre: " + notas[3]);
    IO.println("2º Semestre: " + segundoSemestre);
    IO.println("-----------------------------");

    IO.println("5º Bimestre: " + notas[4]);
    IO.println("6º Bimestre: " + notas[5]);
    IO.println("3º Semestre: " + terceiroSemestre);
    IO.println("-----------------------------");

    IO.println("7º Bimestre: " + notas[6]);
    IO.println("8º Bimestre: " + notas[7]);
    IO.println("4º Semestre: " + quartoSemestre);
    IO.println("-----------------------------");

    double aR = Math.round(mF);

    if (mF < 6) {

        IO.println("Sua Média Final é: " + aR + ". Estude mais! Você está reprovado!");
        sc.close();

    } else {

        IO.println("Sua Média Final é: " + aR + ". Parábens! Você está aprovado!");
        sc.close();

    }

}
