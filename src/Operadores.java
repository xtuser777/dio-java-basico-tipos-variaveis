public class Operadores {
    public static void main(String[] args) {
        String concat = "";

        concat = 1+1+1+"1";

        concat = 1+"1"+1+1;

        concat = 1+"1"+1+"1";
        
        concat = "1"+1+1+1;

        concat = "1"+(1+1+1);

        int numero = 5;

        numero = - 5;

        numero = numero * -1;

        numero++; //numero = numero + 1

        ++numero;

        numero--;

        --numero;

        boolean value = true;

        value = !value; //value = false

        int a = 5, b = 5;

        int resultado = a == b ? 1 : 0;

        boolean val1 = a == b; // a.equals(b)
        boolean val2 = a != b;
        boolean val3 = a <= b;
        boolean val4 = a >= b;
        boolean val5 = a < b;
        boolean val6 = a > b;
    }
}
