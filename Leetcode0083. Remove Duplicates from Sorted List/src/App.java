public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();

        ListNode case1 = new ListNode(new int[] {1, 1, 2});
        ListNode case2 = new ListNode(new int[] {1, 1, 2, 3, 3});

        case1.printNodes();
        System.out.print(" Output: ");
        sol.deleteDuplicates(case1).printNodes();

        System.out.println();

        case2.printNodes();
        System.out.print(" Output: ");
        sol.deleteDuplicates(case2).printNodes();
    }
}
