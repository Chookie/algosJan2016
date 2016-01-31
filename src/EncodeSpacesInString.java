/**
 * Cracking the coding interview question 1.4
 */
public class EncodeSpacesInString {

    public static char[] encode(char[] str, int lastCharacter) {

        if(str.length == 0){
            return str;
        }

        // How many spaces
        int spaces = 0;
        for(int i=0;i<lastCharacter;i++){
            if(str[i] == ' '){
                spaces++;
            }
        }

        if(spaces == 0){
            return str;
        }

        // How long string will be once encoded
        int newLength = lastCharacter + spaces * 2;
        int i = lastCharacter-1;
        while(i > 0 && spaces > 0){
            if(str[i] == ' '){
                str[newLength-1] = '0';
                str[newLength-2] = '2';
                str[newLength-3] = '%';
                newLength -= 3;
                spaces--;
            } else {
                str[newLength-1] = str[i];
                newLength--;
            }
            i--;
        }
        return str;
    }
}
