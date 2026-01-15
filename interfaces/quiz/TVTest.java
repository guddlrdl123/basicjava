package interfaces.quiz;

import java.util.Scanner;

public class TVTest {
    public static void main(String[] args) {
        TV t = new TV();

        t.powerOnOff(); // 전원 켜기

        t.channelUp();
        t.moveChannel(50);
        t.prevChannel(); // 다시 51번 혹은 이전 번호로 돌아가는지 확인

        t.getTvInfo();
    }

}

class TV {
    Scanner sc = new Scanner(System.in);
    // 1. TV의 상태를 나타낼 인스턴스 변수 선언
    int channel;
    int prevChannel;
    int volume;
    boolean isPowerOn;

    // 2. TV의 제한을 나타낼 클래스 상수 선언 (final)
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 300;
    final int MIN_CHANNEL = 1;

    // 3. 기본 생성자: 초기값 설정
    public TV() {
        // 채널 7, 볼륨 20으로 초기화
    }

    // 4. 전원 On/Off 기능
    void powerOnOff() {
        // isPowerOn 값을 반전시키고 상태 출력
        isPowerOn = !isPowerOn;
    }

    // 5. 볼륨 증가 기능
    void volumeUp() {
        // 전원 확인 -> 최대 볼륨 확인 -> 볼륨 증가 및 출력
        if (!isPowerOn) {
            System.out.println("전원이 꺼져 있습니다.");
        } else if (volume == MAX_VOLUME) {
            System.out.println("볼륨이 최대입니다.");
        } else {
            System.out.println("볼륨을 높입니다.");
            volume++;
            System.out.printf("현재 볼륨은 %d입니다.", volume);
        }
    }

    // 6. 볼륨 감소 기능
    void volumeDown() {
        // 전원 확인 -> 최소 볼륨 확인 -> 볼륨 감소 및 출력
        if (!isPowerOn) {
            System.out.println("전원이 꺼져 있습니다.");
        } else if (volume == MAX_VOLUME) {
            System.out.println("볼륨을 더이상 낮출 수 없습니다.");
        } else {
            System.out.println("볼륨을 낮춥니다.");
            volume--;
            System.out.printf("현재 볼륨은 %d입니다.", volume);
        }
    }

    // 7. 채널 증가 기능 (순환 구조 및 이전 채널 저장)
    void channelUp() {
        // 전원이 꺼져있으면 종료
        // 현재 채널을 prevChannel에 저장
        // 최대 채널 도달 시 처리 로직 작성
        if (!isPowerOn) {
            System.out.println("전원이 꺼져있습니다.");
            return;
        }
        // 이전 채널 기능을 위해서...
        prevChannel = channel;

        if (channel == MAX_CHANNEL) {
            channel = MIN_CHANNEL;
        } else {
            channel++;
            ;
        }
        System.out.println(channel + "CH");
    }

    // 8. 채널 감소 기능 (순환 구조 및 이전 채널 저장)
    void channelDown() {
        // 전원이 꺼져있으면 종료
        // 현재 채널을 prevChannel에 저장
        // 최소 채널 도달 시 처리 로직 작성
        if (!isPowerOn) {
            System.out.println("전원이 꺼져있습니다.");
            return;
        }
        prevChannel = channel;
        if (channel == MIN_CHANNEL) {
            channel = MAX_CHANNEL;
        } else {
            channel--;
        }

    }

    // 9. 특정 채널 이동 기능
    boolean moveChannel(int ch) {
        // 전원 확인 -> 범위 확인(MIN ~ MAX) -> 채널 이동 및 출력
        if (!isPowerOn) {
            System.out.println("전원이 꺼져있습니다.");
            return false;
        }
        if (ch >= MIN_CHANNEL && ch <= MAX_CHANNEL) {
            prevChannel = channel; // 현재 채널 저장
            channel = ch; // 이동
            System.out.println(channel + "CH");
            return true;
        } else {
            System.out.println("잘못된 채널 번호를 입력했습니다.");
            return false;
        }
    }

    // 10. 이전 채널 복구 기능
    void prevChannel() {
        // 현재 채널과 prevChannel을 스왑(Swap)
        if (!isPowerOn) {
            System.out.println("전원이 꺼져있습니다.");
            return;
        } else if (prevChannel == 0) { // 전원이 켜지고 채널 이동이 없는 경우
            System.out.println("이전 채널이 없습니다.");
            return;
        }
        int temp = channel;
        channel = prevChannel;
        prevChannel = temp;

        getTvInfo();
    }

    // TV 정보 출력 보조 메서드
    void getTvInfo() {
        System.out.println("--- TV 상태 정보 ---");
        System.out.println("전원: " + isPowerOn);
        System.out.println("채널: " + channel);
        System.out.println("볼륨: " + volume);
        System.out.println("이전 채널: " + prevChannel);
    }
}

// 테스트 실행 클래스
class TVtest {

}
