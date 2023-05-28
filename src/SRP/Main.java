package SRP;

public class Main {
    public static void main(String[] args) {
        // 사용자 생성
        User user = new User("john_doe", "123456");

        // 사용자 검증
        boolean isValid = user.validate();
        if (isValid) {
            System.out.println("사용자 정보가 유효합니다.");
        } else {
            System.out.println("사용자 정보가 유효하지 않습니다.");
        }

        // UserRepository를 사용하여 사용자 저장
        UserRepository userRepository = new UserRepository();
        userRepository.save(user);
    }
}
