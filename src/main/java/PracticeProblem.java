public class PracticeProblem {

	public static void main(String args[]) {
	}

	public static String pyramid(int row) {
		String result = "";

		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < row - i; j++) {
				result += " ";
			}

			for (int y = 0; y < i; y++) {
				result += "*";
				if (y < i - 1) {
					result += " ";
				}
			}

			if (i != row) {
				result += "\n";
			}
		}
		return result;
	}
	
	public static String square(int size) {
        String result = "";

        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size - 1) {
                for (int j = 0; j < size; j++) {
                    result += "*";
                }
            } else {
                result += "*";
                for (int j = 1; j < size - 1; j++) {
                    result += " ";
                }
                result += "*";
            }
            if (i < size - 1) {
                result += "\n";
            }
        }
        return result;
	}

	public static Boolean hasLowercase(String word) {
		for (int i = 0; i < word.length(); i++) {
			if (Character.isLowerCase(word.charAt(i))) {
				return true;
			}
		}
		return false;
	}
}
