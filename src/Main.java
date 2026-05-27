void main() {
   int maior = 0, menor;
   int[] n = {1,2,3,4,5,6,7,8,9,10,11};
    menor = n.length;
    for(int i = 0; i < n.length; i++){
        if (n[i] > maior){
            maior = n[i];
        }
        if (n[i] < menor){
            menor = n[i];
        }
    }
    IO.println("Menor: " + menor);
    IO.println("Maior: " + maior);
}