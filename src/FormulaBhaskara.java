public class FormulaBhaskara {
    public static void main(String[] args) {
        double R1;
        double R2;
        double A = 10.0;
        double B = 20.1;
        double C = 5.1;
        double DELTA = (B*B) - 4*A*C;
        R1 = ((B*-1) + Math.sqrt(DELTA))/(2*A);
        R2 = ((B*-1) - Math.sqrt(DELTA))/(2*A);
        
        if(A != 0 && DELTA >= 0){
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
        else{
            System.out.println("Impossível calcular");
       }
   }
}                                                   
