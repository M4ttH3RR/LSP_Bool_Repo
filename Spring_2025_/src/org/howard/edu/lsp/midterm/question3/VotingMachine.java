package org.howard.edu.lsp.midterm.question3;
/** sources https://codewithcurious.com/projects/online-voting-system-using-java/ */
/**
 * Driver class to test the functionality of the VotingMachine class.
 * This class demonstrates the creation and usage of a VotingMachine.
 */
public class VotingMachine {
    /**
     * The main method that serves as the entry point for the program.
     * It tests the VotingMachine implementation.
     */
    public static void main(String[] args) {
        /** Create a new voting machine */
        VotingMachine vm = new VotingMachine();
 
        /** Adding candidates */
        vm.addCandidate("Alice");
        vm.addCandidate("Bob");
        vm.addCandidate("Charlie");
 
        /** Casting votes */
        vm.castVote("Alice");
        vm.castVote("Alice");
        vm.castVote("Bob");
        vm.castVote("Charlie");
        vm.castVote("Charlie");
        vm.castVote("Charlie");
       
        /** Attempt to vote for a non-existent candidate */
        boolean success = vm.castVote("Eve");
        System.out.println("Vote for Eve successful? " + success);
 
        /** Displaying results */
        System.out.println(vm); 
        
        /** Display the winner */
        System.out.println("Winner: " + vm.getWinner());
    }
}