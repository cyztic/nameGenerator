package nameGenerator;

import java.util.*;

public class NameGenerator {

    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = scanner.nextLine();
        getUserInput(name);
        finalTurnup();

    }

    public static void finalTurnup() {
        int j = 0;
        for (int meme = 0; meme <5; meme++) {
            
        for (int i = 0; i < test.size(); i++) {
            
            if (((test.get(i)).equals('a'))) {
                while (j < 5) {
                    Letters.letterA(j);
                    concat += Letters.letterA(j);
                    break;
                }
            } else if (((test.get(i)).equals('b'))) {
                while (j < 5) {
                    Letters.letterB(j);
                    concat += Letters.letterB(j);
                    break;
                }
            } else if (((test.get(i)).equals('c'))) {
                while (j < 5) {
                    Letters.letterC(j);
                    concat += Letters.letterC(j);
                    break;
                }
            } else if (((test.get(i)).equals('d'))) {
                while (j < 5) {
                    Letters.letterD(j);
                    concat += Letters.letterD(j);
                    break;
                }
            } else if (((test.get(i)).equals('e'))) {
                while (j < 5) {
                    Letters.letterE(j);
                    concat += Letters.letterE(j);
                    break;
                }
            } else if (((test.get(i)).equals('f'))) {
                while (j < 5) {
                    Letters.letterF(j);
                    concat += Letters.letterF(j);
                    break;
                }
            } else if (((test.get(i)).equals('g'))) {
                while (j < 5) {
                    Letters.letterG(j);
                    concat += Letters.letterG(j);
                    break;
                }
            } else if (((test.get(i)).equals('h'))) {
                while (j < 5) {
                    Letters.letterH(j);
                    concat += Letters.letterH(j);
                    break;
                }
            } else if (((test.get(i)).equals('i'))) {
                while (j < 5) {
                    Letters.letterI(j);
                    concat += Letters.letterI(j);
                    break;
                }
            } else if (((test.get(i)).equals('j'))) {
                while (j < 5) {
                    Letters.letterJ(j);
                    concat += Letters.letterJ(j);
                    break;
                }
            } else if (((test.get(i)).equals('k'))) {
                while (j < 5) {
                    Letters.letterK(j);
                    concat += Letters.letterK(j);
                    break;
                }
            } else if (((test.get(i)).equals('l'))) {
                while (j < 5) {
                    Letters.letterL(j);
                    concat += Letters.letterL(j);
                    break;
                }
            } else if (((test.get(i)).equals('m'))) {
                while (j < 5) {
                    Letters.letterM(j);
                    concat += Letters.letterM(j);
                    break;
                }
            } else if (((test.get(i)).equals('n'))) {
                while (j < 5) {
                    Letters.letterN(j);
                    concat += Letters.letterN(j);
                    break;
                }
            } else if (((test.get(i)).equals('o'))) {
                while (j < 5) {
                    Letters.letterO(j);
                    concat += Letters.letterO(j);
                    break;
                }
            } else if (((test.get(i)).equals('p'))) {
                while (j < 5) {
                    Letters.letterP(j);
                    concat += Letters.letterP(j);
                    break;
                }
            } else if (((test.get(i)).equals('q'))) {
                while (j < 5) {
                    Letters.letterQ(j);
                    concat += Letters.letterQ(j);
                    break;
                }
            } else if (((test.get(i)).equals('r'))) {
                while (j < 5) {
                    Letters.letterR(j);
                    concat += Letters.letterR(j);
                    break;
                }
            } else if (((test.get(i)).equals('s'))) {
                while (j < 5) {
                    Letters.letterS(j);
                    concat += Letters.letterS(j);
                    break;
                }
            } else if (((test.get(i)).equals('t'))) {
                while (j < 5) {
                    Letters.letterT(j);
                    concat += Letters.letterT(j);
                    break;
                }
            } else if (((test.get(i)).equals('u'))) {
                while (j < 5) {
                    Letters.letterU(j);
                    concat += Letters.letterU(j);
                    break;
                }
            } else if (((test.get(i)).equals('v'))) {
                while (j < 5) {
                    Letters.letterV(j);
                    concat += Letters.letterV(j);
                    break;
                }
            } else if (((test.get(i)).equals('w'))) {
                while (j < 5) {
                    Letters.letterW(j);
                    concat += Letters.letterW(j);
                    break;
                }
            } else if (((test.get(i)).equals('x'))) {
                while (j < 5) {
                    Letters.letterX(j);
                    concat += Letters.letterX(j);
                    break;
                }
            } else if (((test.get(i)).equals('y'))) {
                while (j < 5) {
                    Letters.letterY(j);
                    concat += Letters.letterY(j);
                    break;
                }
            } else if (((test.get(i)).equals('z'))) {
                while (j < 5) {
                    Letters.letterZ(j);
                    concat += Letters.letterZ(j);
                    break;
                }
                
            } else if (((test.get(i)).equals(' '))) {
                while (j < 5) {
                    Letters.letterSpace();
                    concat += Letters.letterSpace();
                    break;
                }
                
            }
        }
        j++;
        System.out.println(concat);
        concat = " ";
        }
    }

    public static ArrayList<Character> test = new ArrayList<Character>();

    public static String concat =  " "; 
    public static int tick = 0;
    
    public static void getUserInput(String userInput) {

        for (int i = 0; i < userInput.length(); i++) {

                test.add(userInput.charAt(i));

        }

    }

}