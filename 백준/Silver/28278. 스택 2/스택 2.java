import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        int N = nextInt(); // 명령의 수
        int[] stack = new int[N];
        int top = -1;

        while (N-- > 0) {
            int command = nextInt();

            switch (command) {
                case 1: // Push
                    stack[++top] = nextInt();
                    break;
                case 2: // Pop
                    sb.append(top >= 0 ? stack[top--] : -1).append('\n');
                    break;
                case 3: // Size
                    sb.append(top + 1).append('\n');
                    break;
                case 4: // Empty
                    sb.append(top >= 0 ? 0 : 1).append('\n');
                    break;
                case 5: // Top
                    sb.append(top >= 0 ? stack[top] : -1).append('\n');
                    break;
            }
        }

        System.out.print(sb);
    }

    // nextInt(): System.in.read()를 이용한 입력 처리
    static int nextInt() throws IOException {
        int number = 0;
        boolean isNegative = false;
        int character = System.in.read();

        // 공백과 개행 문자를 건너뜀
        while (character <= ' ') {
            character = System.in.read();
        }

        // 음수 처리
        if (character == '-') {
            isNegative = true;
            character = System.in.read();
        }

        // 숫자 파싱
        while (character >= '0' && character <= '9') {
            number = number * 10 + (character - '0');
            character = System.in.read();
        }

        return isNegative ? -number : number;
    }
}