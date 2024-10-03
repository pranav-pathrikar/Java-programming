class SwapVariable {
    public static void main(String[] args) {
        
        int A = 35;
        int B = 85;
        int C = 15;
        // A = C 15 , B = A 35 , C = B 85 .
        
        A = A + B + C;   // A = 60 , B= 20 ,C= 30
        B = A - B- C;    // A = 60 , B = 10 C =30
        C = A -B - C;   // A = 60, B = 10, C = 20
        A = A - B - C;  // A = 30 , B = 10 ,C = 20
        
        System.out.println( " after swap : A ,B,C = " + A + " " + B + " " + C );
        
        
    
    }
}
