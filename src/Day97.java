

public class Day97 {
    public static void main(String[] args) {
        int[][][] arrayRGB = {
            {{2,7,243,28},
             {6,8,9,68},
             {4,6,89,3}
            },
            {{8,3,254,4},
            {1,9,21,32},
            {4,6,89,3}
            },
            {{8,3,254,4},
            {1,9,21,32},
            {4,6,89,3}
            }   
        
        };
        
        for(int i=0; i<arrayRGB.length; i++){
            if(i==0){
                System.out.println("Channel_R");
            }else if(i==1){
                System.out.println("Channel_G");
            }else if(i==2){
                System.out.println("Channel_B");
            }
            for(int j=0; j<arrayRGB[i].length; j++){
                for(int k=0; k<arrayRGB[i][j].length; k++){
                    System.out.print("|");
                    System.out.print(arrayRGB[i][j][k]);
                }
                System.out.println("|");
            }
            System.out.println("");
        }
    }
}
