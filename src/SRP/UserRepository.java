package SRP;

public class UserRepository {
    public void save(User user) {
        // 사용자 정보를 데이터베이스에 저장하는 로직
        System.out.println("사용자 " + user.getUsername() + "을(를) 저장했습니다.");
    }
}
