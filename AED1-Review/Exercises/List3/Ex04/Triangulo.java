package List3.Ex04;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) throws TrianguloInvalidoError {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;

        if(ladoA <=0 || ladoB <=0 || ladoC <= 0) {
            throw new TrianguloInvalidoError("Algum lado deste triângulo é igual a 0 ou negativo! \n portanto, triangulo inválido");
        } else if(ladoA >= ladoB + ladoC || ladoB >= ladoA + ladoC || ladoC >= ladoA + ladoB) {
            throw new TrianguloInvalidoError("Foi detectada desigualdade triangular! \n portanto, este triangulo é inválido");
        }
    }
    public int determinarTipo() {
        //0 equilatero
        //1 isoceles
        //2 escaleno
        if(ladoA == ladoB && ladoA == ladoC) {
            return 0;
        } else if(ladoA == ladoB || ladoA == ladoC  || ladoC == ladoB ) {
            return 1;
        } else {
            return 2;
        }
    }
}
