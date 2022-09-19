public class Pascal {
  public static void main(String[] args) {
    System.out.println(" Cn, p =" + pascal(30000, 250));
  }

  public static int pascal(int nBut, int pBut){
    var tab = new int[nBut + 1];
    int n;
    int i;

    tab[0] = 1;
    for(n = 1; n <= nBut; n++){
      tab[n] = 1;
      for(i = n-1; i > 0; i--){
        tab[i] = tab[i - 1] + tab[i];
      }
    }
    return tab[pBut];
  }
}
