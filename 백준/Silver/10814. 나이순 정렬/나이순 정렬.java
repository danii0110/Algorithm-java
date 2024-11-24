import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        ArrayList<User> user = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            user.add(new User(age, name));
        }
        
        user.sort((u1, u2) -> {
            if (u1.age == u2.age) return 0; // 나이가 같으면 가입 순으로
            return Integer.compare(u1.age, u2.age); // 나이 오름차순으로 정렬
        });
        
        for (User u : user) {
            sb.append(u.age).append(" ").append(u.name).append("\n");
        }
        System.out.print(sb);
    }
    static class User {
        int age;
        String name;
        
        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}