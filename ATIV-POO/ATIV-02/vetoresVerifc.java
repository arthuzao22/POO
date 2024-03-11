    // Escreva um programa que carregue dois valores A e B pelo teclado e imprima todos
    // os números ímpares entre A e B.
public class vetoresVerifc
{    
    public int vetorA[] = new int[5];
    public int vetorB[] = new int[5];

    public vetoresVerifc(int[] nVetorA, int[] nVetorB){
        this.vetorA = nVetorA;
        this.vetorB = nVetorB;
    }
    
    //vetorA
    public void setVetorA(int[] nVetorA){
        this.vetorA = nVetorA;
    }
    public int[] getVetorA(){
        return vetorA;
    }
    //vetorB
    public void setVetorB(int[] nVetorB){
        this.vetorA = nVetorB;
    }
    public int[] getVetorB(){
        return vetorB;
    }
    
    //Vetores calculo
    public int[] verificarImparesA() {
        int[] guardA = new int[10];
        for (int i = 0; i < vetorA.length; i++) {''
            if (vetorA[i] % 2 != 0) {
                guardA[i] = vetorA[i];
            }
        }
        return guardA;
    }
    public int[] verificarImparesB() {
        int[] guardB = new int[10];
        for (int i = 0; i < vetorB.length; i++) {
            if (vetorB[i] % 2 != 0) {
                guardB[i] = vetorB[i];
            }
        }
        return guardB;
    }
}
