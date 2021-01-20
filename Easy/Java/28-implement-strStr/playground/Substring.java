package playground;

public class Substring {

    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";

        for (int i = 0; i < haystack.length(); i++) {
            System.out.println(haystack.charAt(i));
            int sliceEnd = i + needle.length();
            if (i < (haystack.length() - needle.length())) {
                String inspectionGroup = haystack.substring(i, sliceEnd);
                if (inspectionGroup.equals(needle)) {
                    System.out.println("Found at : " + i);
                }
            }
        }
    }
}
