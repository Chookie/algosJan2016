/**
 * Cracking the coding interview 1.5
 */
public class StringCompress {

    public static String compressBad(String raw){

        String compressed = "";
        char lastChar = raw.charAt(0);
        int lastCount = 1;
        for(int i=1; i<raw.length(); i++){
            char c = raw.charAt(i);
            if(c == lastChar){
                lastCount++;
            } else {
                compressed += String.valueOf(lastChar) + lastCount;
                lastChar = c;
                lastCount = 1;
            }
        }
        compressed += String.valueOf(lastChar) + lastCount;
        return compressed;
    }

    public static String compressBetter(String raw){

        StringBuilder builder = new StringBuilder();
        char lastChar = raw.charAt(0);
        int lastCount = 1;
        for(int i=1; i < raw.length(); i++){
            char c = raw.charAt(i);
            if(c == lastChar){
                lastCount++;
            } else {
                builder.append(String.valueOf(lastChar));
                builder.append(lastCount);
                lastChar = c;
                lastCount = 1;
            }
        }
        builder.append(String.valueOf(lastChar));
        builder.append(lastCount);
        return builder.toString();
    }

    public static String compressBest(String raw){
        // If no better of with compression hen leave as is.
        int compressedSize = getCompressedSize(raw);
        if(compressedSize >= raw.length()){
            return raw;
        }

        char[] compressed = new char[compressedSize];
        char lastChar = raw.charAt(0);
        int lastCount = 1;
        int index = 0;
        for(int i=1; i < raw.length(); i++){
            char c = raw.charAt(i);
            if(c == lastChar){
                lastCount++;
            } else {
                compressed[index++] = lastChar;
                char[] countChars = String.valueOf(lastCount).toCharArray();
                for(char d : countChars){
                    compressed[index++] = d;
                }
                lastChar = c;
                lastCount = 1;
            }
        }
        compressed[index++] = lastChar;
        char[] countChars = String.valueOf(lastCount).toCharArray();
        for(char d : countChars){
            compressed[index++] = d;
        }
        return String.valueOf(compressed);
    }

    private static int getCompressedSize(String raw){

        int length = 0;
        char lastChar = raw.charAt(0);
        for(int i=1; i<raw.length(); i++){
            char c = raw.charAt(i);
            if(c != lastChar){
                length += 2;
                lastChar = c;
            }
        }
        return length+2;
    }
}
