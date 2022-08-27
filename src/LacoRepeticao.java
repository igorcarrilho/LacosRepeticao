public class LacoRepeticao {
    public static void main(String[] args){
        //Comando While (Laço pré testado)
        System.out.println("Comando WHILE");
        int numVezes = 1;
        while(numVezes <= 10){
            System.out.println("Estou fazendo a " + numVezes + "º vez");
            numVezes++;
        }
        System.out.println("Sai do laço e executei " + (numVezes-1) + " vezes");

        //Comando DO WHILE (Laço pós testado)
        System.out.println("Comando DO...WHILE");
        numVezes = 1;
        do {
            System.out.println("Estou fazendo a " + numVezes + "º vez");
            numVezes++;
        } while (numVezes <= 10);
        System.out.println("Sai do laço e executei " + (numVezes-1) + " vezes");

        //FOR
        System.out.println("Comando FOR");
        numVezes = 0;
        for (int numVezes1 = 1; numVezes1 <= 10; numVezes1++) {
            System.out.println("Estou fazendo a " + numVezes1 + "º vez");
            numVezes = numVezes1;
        }
        System.out.println("Sai do laço e executei " + (numVezes) + " vezes");
        for (int numVezes1 = 1; numVezes1 <= 10; numVezes1++) {
            System.out.println("Estou fazendo a " + numVezes1 + "º vez");
            if (numVezes1 == 5){
                System.out.println("Parei na " + numVezes1 + "º vez");
                break;
            }
        }
    }
}
