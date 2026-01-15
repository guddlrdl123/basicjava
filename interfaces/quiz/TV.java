
/*
 * package interfaces.quiz;
 * 
 * import java.util.Scanner;
 * 
 * public class Tv {
 * 
 * Scanner sc = new Scanner(System.in);
 * // 1. TV의 상태를 나타낼 인스턴스 변수 선언
 * int channel;
 * int prevChannel;
 * int volume;
 * boolean isPowerOn;
 * 
 * // 2. TV의 제한을 나타낼 클래스 상수 선언 (final)
 * final int MAX_VOLUME = 100;
 * final int MIN_VOLUME = 0;
 * final int MAX_CHANNEL = 300;
 * final int MIN_CHANNEL = 1;
 * 
 * // 3. 기본 생성자: 초기값 설정
 * public Tv() {
 * // 채널 7, 볼륨 20으로 초기화
 * this.channel = 7;
 * this.volume = 20;
 * }
 * 
 * // 4. 전원 On/Off 기능
 * void powerOnOff() {
 * // isPowerOn 값을 반전시키고 상태 출력
 * if (isPowerOn) {
 * System.out.println("전원을 켭니다.");
 * isPowerOn = true;
 * } else {
 * System.out.println("전원을 끕니다.");
 * isPowerOn = false;
 * }
 * }
 * 
 * // 5. 볼륨 증가 기능
 * void volumeUp() {
 * // 전원 확인 -> 최대 볼륨 확인 -> 볼륨 증가 및 출력
 * if (!isPowerOn) {
 * System.out.println("전원이 꺼져 있습니다.");
 * } else if (volume == MAX_VOLUME) {
 * System.out.println("볼륨이 최대입니다.");
 * } else {
 * System.out.println("볼륨을 높입니다.");
 * volume++;
 * }
 * }
 * 
 * // 6. 볼륨 감소 기능
 * void volumeDown() {
 * // 전원 확인 -> 최소 볼륨 확인 -> 볼륨 감소 및 출력
 * if (!isPowerOn) {
 * System.out.println("전원이 꺼져 있습니다.");
 * } else if (volume == MIN_VOLUME) {
 * System.out.println("볼륨이 최대입니다.");
 * } else {
 * System.out.println("볼륨을 낮춥니다.");
 * volume--;
 * }
 * }
 * 
 * // 7. 채널 증가 기능 (순환 구조 및 이전 채널 저장)
 * void channelUp() {
 * // 전원이 꺼져있으면 종료
 * // 현재 채널을 prevChannel에 저장
 * // 최대 채널 도달 시 처리 로직 작성
 * 
 * while (true) {
 * String up = sc.next();
 * switch (up) {
 * case "up":
 * if (!isPowerOn) {
 * System.out.println("전원이 꺼져있습니다.");
 * break;
 * } else if (channel == MAX_CHANNEL) {
 * System.out.println("최대 채널입니다.");
 * break;
 * } else {
 * prevChannel = channel;
 * channel++;
 * System.out.println("현재 채널 : " + channel);
 * }
 * break;
 * case "exit":
 * break;
 * default:
 * System.out.println("잘못된 입력");
 * break;
 * }
 * }
 * }
 * 
 * public int getChannel() {
 * return channel;
 * }
 * 
 * public void setChannel(int channel) {
 * this.channel = channel;
 * }
 * 
 * public int getPrevChannel() {
 * return prevChannel;
 * }
 * 
 * public void setPrevChannel(int prevChannel) {
 * this.prevChannel = prevChannel;
 * }
 * 
 * public int getVolume() {
 * return volume;
 * }
 * 
 * public void setVolume(int volume) {
 * this.volume = volume;
 * }
 * 
 * public boolean isPowerOn() {
 * return isPowerOn;
 * }
 * 
 * public void setPowerOn(boolean isPowerOn) {
 * this.isPowerOn = isPowerOn;
 * }
 * 
 * }
 */