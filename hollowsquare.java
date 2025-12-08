public class hollowsquare 
{
    public static void main(String[] args) {
        int size = 5; // Define the size of the square (0 to 5 is 6 stars)
        for(int i=0; i<=size; i++){
            for(int j=0; j<=size; j++){
                // Print star for first/last row OR first/last column
                if(i==0 || i==size || j==0 || j==size){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}