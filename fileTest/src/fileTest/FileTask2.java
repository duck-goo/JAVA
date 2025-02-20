package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileTask2 {
    public static void main(String[] args) {
        // 1. User 리스트 생성
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "홍길동", 20, "도둑"));
        users.add(new User(2L, "김철수", 20, "코딩"));
        users.add(new User(3L, "김영희", 20, "교사"));
        users.add(new User(4L, "신짱구", 20, "유치원생"));
        users.add(new User(5L, "흰둥이", 20, "개"));

        // 2. Stream을 사용하여 직업 정보 리스트 생성
        List<String> jobInfoList = users.stream()
                .map(user -> user.getName() + "님의 직업은 " + user.getJob() + "입니다.")
                .collect(Collectors.toList());

        // 3. 파일에 저장
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("jobs.txt"))) {
            for (String jobInfo : jobInfoList) {
                bufferedWriter.write(jobInfo);
                bufferedWriter.newLine(); // 줄바꿈 추가
            }
            System.out.println("파일 저장 완료: jobs.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 4. 파일 내용 읽어서 콘솔 출력
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("jobs.txt"))) {
            String line;
            System.out.println("\n📄 jobs.txt 파일 내용:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
