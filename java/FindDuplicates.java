import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;

public class FindDuplicates {

    public static List<Integer> findModeNestedLoops(List<Integer> l) {

	List<Integer> answer = new ArrayList<Integer>();

	if (l.size() <= 1) {
		return answer;
	}

	HashSet<Integer> duplicates = new HashSet<>();
	HashSet<Integer> non_duplicate = new HashSet<>();

	for (int i : l) {
		if (!non_duplicate.add(i)) {
			duplicates.add(i);
		}		
	}

	for (int i : duplicates) {
		answer.add(i);
	}

        return answer;
    }

    public static void main(String[] args) {
        // some test strings:
        List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
        List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
        List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
        List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
        System.out.println("Sample 1: " + findModeNestedLoops(sample1));
        System.out.println("Sample 2: " + findModeNestedLoops(sample2));
        System.out.println("Sample 3: " + findModeNestedLoops(sample3));
        System.out.println("Sample 4: " + findModeNestedLoops(sample4));
    }

}
