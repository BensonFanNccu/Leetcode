public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();

        ListNode case1 = new ListNode(new int[] {1, 3, 5});
        ListNode case2 = new ListNode(new int[] {1, 2, 4});

        sol.mergeTwoLists(case1, case2).printNodes();
        
    }
}
