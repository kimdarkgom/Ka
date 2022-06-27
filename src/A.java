import java.util.Scanner;

public class A {
        public static void main (String[] args){

            System.out.printf("집에 갈려는대 교수님의 기습 과제 공격%n"+
                    "선택 :%n"+
                    "1.도망친다.%n"+
                    "2.맞서 싸운다%n");
            System.out.print("1 또는 2 입력 : ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if(a==1) {
                System.out.println("분노한 교수님의 F낫 공격을 날렸다");
                System.out.println("당신의 학점은 F 사망");
            }else{

                System.out.println("1. 꺼무위키 가져오기 공격");
                System.out.println("2. 직접 제작 공격");
                System.out.print("1 또는 2 입력 : ");
                Scanner x = new Scanner(System.in);
                int b = x.nextInt();
                if(b==1) {
                    System.out.printf("꺼무위키 공격이 미미했다%n" +
                            "어이 없어하는 교수님의  C칼 공격%n" +
                            "중상을 입었다%n" +
                            "1. 재시도를 한다 %n"+
                            "2. 포기 한다%n");
                    System.out.print("1 또는 2 입력 : ");
                    Scanner y = new Scanner(System.in);
                    int c = y.nextInt();
                    if(c==1){
                        System.out.printf("성의를 봐서 교수님의  B 힐%n"+
                                "치유가 되었다%n"+
                                "당신의 성적 B 어느 정도 치유되어 절뚝이며 집에 갔다");
                    }else{
                        System.out.println("당신의 성적 C 불구가 되어 집까지 기어갔다");
                    }

                }else {
                    System.out.println("교수님의 마음에 크리티컬 데미지 ");
                    System.out.printf("당신의 학점은 A 살아 남앗다.%n 무사히 집에 갔다 ");
                }
            }

        }
}


