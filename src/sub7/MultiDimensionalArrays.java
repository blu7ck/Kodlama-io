package sub7;

public class MultiDimensionalArrays {
    public static void main(String...args){

        String[][] players = new String[2][2];

        players[0][0]= "camiryo";
        players[0][1]= "cafer";
        players[1][0]= "president present";
        players[1][1]= "ekrem imaro";

        for(int i = 0; i<=1;i++){
            System.out.println("_____________________");
            for(int k = 0; k<=1;k++){
                System.out.println(players[i][k]);
            }
        }
    }
}
