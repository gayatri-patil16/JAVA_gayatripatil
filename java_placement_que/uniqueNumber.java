public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {10,20,30,40,50};
        int[] array2 = {30,40,20,70,80};

        Set<Integer> set = new HashSet<>();
        for (int num : array1) {
            set.add(num);
        }

        List<Integer> commonElements = new ArrayList<>();
        for (int num : array2) {
            if (set.contains(num)) {
                commonElements.add(num);
            }
        }

        System.out.println("Common elements between the two arrays are: " + commonElements);
    }
}
