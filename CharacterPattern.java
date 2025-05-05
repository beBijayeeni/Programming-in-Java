class CharacterPattern {

    public static void main(String[] args) {

        int rows = 4;
        int totalWidth = 7;
        char startChar = 'A';
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < totalWidth; j++) {

                // Determine whether to print a character or a space at the current position (i, j)
                // Characters are printed at positions j where j is within the range [0, 3-i]
                // or within the range [3+i, 6]. Otherwise, print a space.
                if (j <= 3 - i || j >= 3 + i) {
                    // Calculate the character to print based on the distance from the center (position 3)
                    // For the left side (j <= 3), the character is 'A' + j
                    // For the right side (j >= 4), the character is 'A' + (6 - j)
                    char charToPrint;
                    if (j <= 3) {
                        charToPrint = (char) (startChar + j);
                    } else {
                        charToPrint = (char) (startChar + (totalWidth - 1 - j)); // Equivalent to 'A' + (6 - j)
                    }
                     // Only print the character if it's within the valid range for the current row
                    if (charToPrint >= startChar && charToPrint <= (char)(startChar + (3 - i)) ) {
                         System.out.print(charToPrint);
                    } else {
                         System.out.print(" "); // Print a space if the calculated character is outside the range for this row
                    }

                } else {
                    // Print a space for positions outside the character ranges
                    System.out.print(" ");
                }
            }
            // Move to the next line after printing all characters/spaces for the current row
            System.out.println();
        }
    }
}
