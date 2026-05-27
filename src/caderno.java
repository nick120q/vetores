void main() {
    int[] impares = {9,7,4,2,1};
    Arrays.sort(impares);
    for (int i = impares.length-1; i >= 0; i--){
            IO.println(impares[i]);
    }
}