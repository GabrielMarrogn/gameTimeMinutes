import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int horaIncial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();
        sc.close();

        LocalTime time1 = LocalTime.of(horaIncial, minutoInicial, 00); 
        LocalTime time2 = LocalTime.of(horaFinal, minutoFinal, 00); 

        long hours = ChronoUnit.HOURS.between(time1, time2); 
        long minutes = ChronoUnit.MINUTES.between(time1, time2) % 60; 

        if(horaIncial == horaFinal && minutoInicial == minutoFinal){
            hours = hours + 24;
        }else if(hours < 0 ){
            hours = hours + 23;
            if(minutes < 0){
                minutes = minutes + 60;
            }
        }if(horaIncial == horaFinal && minutes < 0){
            hours = 23;
            minutes = minutes + 60;
        }

        System.out.println("O JOGO DUROU " + hours + " HORA(S)" +" E " +minutes +" MINUTO(S)"); 
    }
}

