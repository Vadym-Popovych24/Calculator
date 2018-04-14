import java.util.LinkedList;

public class Process {

    public static boolean isDelim(char c) {
        return c == ' ';
    }
    public boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^'
                || c == '√' || c == 't' || c == 's' || c == 'c' || c == 'l'
                || c == '!' || c == 'T' || c == 'S' || c == 'C' || c == 'L';
    }

   public static void processOperator(LinkedList<Double> st, char op) {

       double l;
       double t;
        switch (op) {
            case '+':
                l = st.removeLast();
                t = st.removeLast();
                st.add(t + l);

                break;

            case '-':
                l = st.removeLast();
                t = st.removeLast();
                st.add(t - l);
                break;

            case '*':
                l = st.removeLast();
                t = st.removeLast();
                st.add(t * l);
                break;

            case '/':
                l = st.removeLast();
                t = st.removeLast();
                try {
                    st.add(t / l);
                    break;
                }catch(Exception e){

                }
            case '^':
                l = st.removeLast();
                t = st.removeLast();
                st.add(Math.pow(t ,l));
                break;

            case '!':
                double ret = 1.0;
                t = st.removeLast();

                for (int i = 1; i <= t; ++i) ret *= i;
                st.add(ret);
                break;

            case '√':
                t = st.removeLast();
                st.add(Math.sqrt(t));
                break;

            case ('s'):
                t = st.removeLast();
                st.add(Math.sin(t));
                break;

            case ('S'):
                t = st.removeLast();
                st.add(Math.sinh(t));
                break;

            case ('c'):
                t = st.removeLast();
                st.add(Math.cos(t));
                break;

            case ('C'):
                t = st.removeLast();
                st.add(Math.cosh(t));
                break;

            case ('t'):
                t = st.removeLast();
                st.add(Math.tan(t));
                break;

            case ('T'):
                t = st.removeLast();
                st.add(Math.tanh(t));
                break;

            case ('l'):
                t = st.removeLast();
                st.add(Math.log(t));
                break;

            case ('L'):
                t = st.removeLast();
                st.add(Math.log10(t));
                break;

        }

    }

}
