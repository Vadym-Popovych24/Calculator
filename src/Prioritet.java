public class Prioritet {
    static int priority(char op) {
        switch (op) {

            case '+':
            case '-':

                return 1;

            case '*':
            case '/':

                return 2;
            case 's':
            case 'c':
            case 't':
            case 'l':
            case 'T':
            case 'S':
            case 'C':
            case 'L':
            case '√':
            case '!':

                return 3;

            case '^':

                return 4;

            default:

                return -1;
        }
    }
}
