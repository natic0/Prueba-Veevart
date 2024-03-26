import java.util.Scanner;

public class Main {

/*definirTam: Define el tamaño límite que el usuario elegira para la maleta*/
public static void definirTam() {
int tam = 0;
Scanner obj = new Scanner(System.in);
System.out.print("Introduce el límite que deseas para la maleta: ");
tam = obj.nextInt();
definirObj(tam);
}

/*definirObj: Define los objetos (5) límite que habrán disponibles para la maleta*/
public static void definirObj(int tam){
int objetos[][] = new int[5][2];
Scanner obj = new Scanner(System.in);


/*itera en la cantidad de objetos disponibles mientras el usuario va asignando peso y valor*/
for (int i = 0; i < 5; i++){
    System.out.print("Ingrese el peso del objeto: ");
    objetos[i][0] = obj.nextInt();
    System.out.print("Ingrese el valor del objeto: ");
    objetos[i][1] = obj.nextInt();
}

System.out.println("Estos son los objetos ingresados: ");
for (int i = 0; i < 5; i++){
    System.out.println(" ");
    System.out.println("Objeto " + i + " - Peso: " + objetos[i][0] + ", Valor: " + objetos[i][1]);
}
knapsack(objetos);
}

public static void knapsack(int objetos[][]){
int n = objetos.length;
for (int i = 0; i < n; i++){
    for (int j = 0; j < n - i - 1; j++){
    if(objetos[j][0] > objetos [j+1][0]){
        int[] temp = objetos[j];
        objetos[j] = objetos[j+1];
        objetos[j+1] = temp;

        System.out.println("Objeto " + i + " - Peso: " + objetos[i][0] + ", Valor: " + objetos[i][1]);
    }
    }
}

}

public static void main(String[] args) {
definirTam();
}
}
