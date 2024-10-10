public class Divisores {

    int numero, sumaDivisores = 0;

  
    public Divisores(int numero) {
        this.numero = numero;
    }


    public void calcularSuma(){
        for (int i = 1; i < numero; i++){
            if (numero % i == 0){
                sumaDivisores =  sumaDivisores + i;

            }
        }

        if (sumaDivisores == numero) {
            System.out.println(numero +  " es un número perfecto");

        } else {
            System.out.println(numero + " no es un número perfecto");
            
        }
    
    }
} 