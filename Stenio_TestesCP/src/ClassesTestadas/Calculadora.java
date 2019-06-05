package ClassesTestadas;
import java.util.ArrayList;

public class Calculadora {
	
	public int RaizQ(int valor){
        ArrayList<Integer> impares = new ArrayList<>();// 1,3,5,7,9
        impares.add(1);
        ArrayList<Integer> valores = new ArrayList<>();// 23,20,15,8
        valores.add(valor);
        tentativa: for (int i = 0; true; i++) {
            int calculo = valores.get(i) - impares.get(i);
            valores.add(calculo);// 24-1=23 , 23-3=20 , 20-5=15 , 15-7=8 ,
            int impar = impares.get(i) + 2;// 1+2 =3 , 3+2=5 , 5+2=7 , 7+2=9
            impares.add(impar);
            if (impares.get(i) > valores.get(i)) {
                break tentativa;
            } else {
                continue;
            }
        }
        int resultado = valores.size() - 2;
        return resultado;
    }
	
	public double Sqrt(double x){
		return Math.sqrt(x);
	}
}