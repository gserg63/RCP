import java.util.Random;

class Players {
        Random random = new Random();
        int a = random.nextInt(3) + 1;
    String player(){
        String abc = null;
        if (a == 1){
            abc = "Rock";
        }else if(a == 2){
            abc = "Clippers";
        }else if(a == 3){
            abc = "Paper";
        }
        return abc;
    }
}
