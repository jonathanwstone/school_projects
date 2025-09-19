public class DNALib {

    // Validator
    public static boolean validator(String Sequence) {
        if (Sequence.length() % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Variables needed
    static StringBuilder reversedSequence = new StringBuilder();
    static int reverserIndex = 0;

    // Reverser
    public String reverser(String Sequence) {

        // Loopington City
        if (reverserIndex < Sequence.length()){
            char character = Sequence.charAt(Sequence.length() - 1 - reverserIndex);
            reversedSequence.append(character);
            reverserIndex++;
        }

        if (reversedSequence.length() < Sequence.length()){
            return reverser(Sequence);
        }
        else if (reversedSequence.length() == Sequence.length()){
            String trueReversedSequence = reversedSequence.toString();
            return trueReversedSequence;

        }
        return "";
    }

    // Variables needed
    static int inverserIndex = 0;
    static StringBuilder inversedSequence = new StringBuilder();

    //Inverser
    static String inverser(String trueReversedSequence){
        if (inverserIndex < trueReversedSequence.length()){
            char character = trueReversedSequence.charAt(trueReversedSequence.length() - 1 - inverserIndex);

            if (character == 'A'){
                inversedSequence.append('T');
            }
            if (character == 'C'){
                inversedSequence.append('G');
            }
            if (character == 'G'){
                inversedSequence.append('C');
            }
            if (character == 'T'){
                inversedSequence.append('A');
            }
            inverserIndex++;
        }
        if (inverserIndex < trueReversedSequence.length()){
            return inverser(trueReversedSequence);
        }
        if (inverserIndex == trueReversedSequence.length()){
            String trueInversedSequence = inversedSequence.toString();
            return trueInversedSequence;
        }
        return "";
    }

static String translator(String trueInversedSequence){
        
}

}

