public class Main {

    //print A and B using array and star(*)
    public static void main(String[] args) {

        String[][] letter = new String[6][4];

        for (int i= 0; i< letter.length;i++){
            for (int j=0 ; j< letter[i].length;j++){
                if (i==0||i==2){
                    letter[i][j]=" *";
                }else if(j==0||j==2){
                    letter[i][j]=" *";
                }else{
                    letter[i][j]="    ";
                }
            }
        }
        for (String[] row: letter ){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        
        String[][] letter2 = new String[5][4];
        for (int i= 0; i< letter2.length;i++){
            for (int j=0 ; j< letter2[i].length;j++){
                if (i==0||i==2||i==4){
                    letter2[i][j]=" *";
                }else if(j==0||j==2){
                    letter2[i][j]=" *";
                }else{
                    letter2[i][j]="    ";
                }
            }
        }
        for (String[] row: letter2 ){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }


    }
}
