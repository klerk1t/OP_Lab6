public class ShuntingYard {
    String s;
    public ShuntingYard(String s) {
        this.s = s;
    }

    void shuntingYard() {
        char priority0[] = {'(', ')'};
        char priority1[] = {'*', '/', '^'};
        char priority2[] = {'-', '+'};

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        char str[] = s.toCharArray();
        char str1[] = new char[str.length];

        for(char x : str) {
            if(x == '(')
                count0++;
            if(x == '*' || x == '/' || x == '^')
                count1++;
            if(x == '-' || x == '+')
                count2++;
        }
        System.out.println(count0 + " " + count1 + " " + count2);
    }
}
