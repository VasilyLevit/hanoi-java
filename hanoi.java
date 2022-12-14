package Hanoi;

public class hanoi {
    // Переложить n дисков с from на to
    void towers(char from, char to, char tmp, int count) {
    
        if (count > 1) towers(from, tmp, to, count - 1); // перекладываем n-1 дисков с from на tmp
        System.out.println(from + " >> " + to);
        if (count > 1) towers(tmp, to, from, count - 1); // перекладываем n-1 дисков с tmp на to
    }
    
        public static void main(String[] args) {
        hanoi ob = new hanoi();
	    int n = 3;
	    ob.towers('A', 'B', 'C', n);
    }



// static void hanoi(int n,char start,char mid,char end) {
// 	if(n==1) {
// 		System.out.println(n+"Из"+start+«К»+end);
// 		return;
// 	}
// 	hanoi(n-1,start,end,mid);
// 	System.out.println(n+"Из"+start+«К»+end);
// 	hanoi(n-1,mid,start,end);

// static void hanoi(int n, int i, int k, int tmp) {
// 	if(n==1) { /* Крайний случай, когда остался последний блин */
// 		System.out.println("Переместить диск 1 c оси %d на %d.\n", i, k);
// 	}
//  else {
// 	hanoi(n-1, i, tmp); /*пирамиду высотой n-1 перекладываем с i на temp*/
// 	
//  System.out.println("Переместить диск %d c оси %d на %d.\n", n, i, k);
// 	hanoi(n-1, tmp, k);
//  }
}
