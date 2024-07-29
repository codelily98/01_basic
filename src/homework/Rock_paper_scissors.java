package homework;

import java.io.IOException;
import java.util.Scanner;

public class Rock_paper_scissors {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("가위(1), 바위(2), 보자기(3) 입력 : ");
        int my_rps = (int)(System.in.read() - '0');
        
        System.out.print("배팅 금액 : ");
        int bat = sc.nextInt();
        
        System.out.println();
        System.out.print("결과를 보시려면 Enter를 치세요.");
        
        System.in.read();		//엔터 입력
        
        System.out.println();
        
        int base_bat = 1000;
        int com_rps = (int)(Math.random() * 3 + 1);       
        int fin_bat = base_bat;
        
        String com_string_rps = "";
        String my_string_rps = "";
        
        switch (com_rps) {
        case 1: com_string_rps = "가위"; break;
        case 2: com_string_rps = "바위"; break;
        case 3: com_string_rps = "보자기"; break;
        default: com_string_rps = "";        
        }
        
        switch (my_rps) {
        case 1: my_string_rps = "가위"; break;
        case 2: my_string_rps = "바위"; break;
        case 3: my_string_rps = "보자기"; break;
        default: my_string_rps = "";        
        }

        if (com_rps == my_rps) {
            System.out.println("컴퓨터는 " + com_string_rps + " 나는 " + my_string_rps);
            System.out.println("ㅡㅡ..비겼다");
            System.out.println(fin_bat);
        } else if ((my_rps == 1 && com_rps == 3) || (my_rps == 2 && com_rps == 1) || (my_rps == 3 && com_rps == 2)) {
            System.out.println("컴퓨터는 " + com_string_rps + " 나는 " + my_string_rps);
            System.out.println("ㅎㅎ..이겼다");
            fin_bat += bat;
            System.out.println(fin_bat);

        } else {
            System.out.println("컴퓨터는 " + com_string_rps + " 나는 " + my_string_rps);
            System.out.println("ㅠㅠ..졌다");
            fin_bat -= bat;
            System.out.println(fin_bat);
        }
        
        System.out.println("현재 금액은 : " + fin_bat);
        sc.close();
        
        if (fin_bat <= 0) {
        	System.out.println("파산하셨습니다.");
        }
    }
}


/*
[문제] 가위 바위 보 게임
- 가위(1), 바위(2), 보자기(3)으로 설정한다. <- System.in.read()를 사용하여 작성하시오
- 컴퓨터는 난수 1 ~ 3 사이의 숫자를 발생한다.
- 기본 금액은 1000원을 기본으로 설정한다.

[실행결과]
가위(1), 바위(2), 보자기(3) 입력 : 1
배팅 금액 : 600

결과를 보시려면 Enter를 치세요

컴퓨터 바위, 나는 가위
ㅠㅠ..졌다
현재 금액은 400윈

public class Game {

 public static void main(String[] args) throws IOException {
 Scanner scan = new Scanner(System.in);
 int com, user;
 int money = 1000;
 int coin; //배팅금액
 
 com = (int)(Math.random()*3+1);
 //System.out.println("com = " + com);
 
 System.out.print("가위(1), 바위(2), 보자기(3) 입력 : ");
 user = System.in.read()-'0';
 
 System.out.print("배팅 금액 : ");
 coin = scan.nextInt();
 System.out.println();
 
 System.out.println("결과를 보시려면 Enter를 치세요");
 System.in.read();
 
 
 if(com == 1) { //컴이 가위라면
 if(user == 1) {
 System.out.println("컴퓨터 : 가위, 나 : 가위");
 System.out.println("비겼다");
 }else if(user == 2) {
 System.out.println("컴퓨터 : 가위, 나 : 바위");
 System.out.println("이겼다");
 
 money += coin; //money = money + coin
 }else if(user == 3) {
 System.out.println("컴퓨터 : 가위, 나 : 보자기");
 System.out.println("졌다");
 
 money -= coin;
 }
 
 }else if(com == 2) { //컴이 바위라면
 if(user == 1) {
 System.out.println("컴퓨터 : 바위, 나 : 가위");
 System.out.println("졌다");
 
 money -= coin;
 }else if(user == 2) {
 System.out.println("컴퓨터 : 바위, 나 : 바위");
 System.out.println("비겼다");
 }else if(user == 3) {
 System.out.println("컴퓨터 : 바위, 나 : 보자기");
 System.out.println("이겼다");
 
 money += coin;
 }
 
 }else if(com == 3) { //컴이 보자기라면
 if(user == 1) {
 System.out.println("컴퓨터 : 보자기, 나 : 가위");
 System.out.println("이겼다");
 
 money += coin;
 }else if(user == 2) {
 System.out.println("컴퓨터 : 보자기, 나 : 바위");
 System.out.println("졌다");
 
 money -= coin;
 }else if(user == 3) {
 System.out.println("컴퓨터 : 보자기, 나 : 보자기");
 System.out.println("비겼다");
 }
 }
 
 System.out.println("현재 금액은 " + money + "윈");
	}

}

*/