public class ex3 {

        public static void main(String[] args) {
            int count = 0;
            for (int i = 0; i <= 99999; i++) {
                int n = i;
                while (n > 0) {
                    if (n % 10 == 4 || n % 100 == 13) {
                        count ++;
                        break;
                    }
                    n/=10;
                }
            }
            System.out.println("необходимо исключить " + count );
        }
    }


