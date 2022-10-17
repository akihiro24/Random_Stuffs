public class App {
    public static void main(String[] args) throws Exception {
        
        char[] firstName = {'R','A','I','L','E','Y'};

        // System.out.println(firstName[5]);
        // System.out.println(firstName[4]);
        // System.out.println(firstName[3]);
        // System.out.println(firstName[2]);
        // System.out.println(firstName[1]);
        // System.out.println(firstName[0]);
        
        for (int i = 0; i < firstName.length; i++) {
              
              if (firstName[i].contains 'A' || firstName[i] == 'E' || firstName[i] == 'I' || firstName[i] == 'O' || firstName[i] == 'U'){
            System.out.println(firstName[i]);
         }
        
        }
        
        // for (int i = firstName.length -1; i >= 0; i--) {
        //     System.out.println(firstName[i]);
            
        // }
        
        
        

    }
}
