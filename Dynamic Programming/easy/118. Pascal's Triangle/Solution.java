class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>(List.of(1)));

        for (int i = 1; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> prevRow = triangle.get(i - 1);
                    row.add(prevRow.get(j) + prevRow.get(j - 1));
                }

            }
            triangle.add(row);
        }
        return triangle;
    }
}
