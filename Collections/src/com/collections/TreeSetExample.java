package com.collections;

import java.util.TreeSet;

class StudentRankingSystem {
    private TreeSet<Integer> ranks; // TreeSet to store student ranks

    // Constructor
    public StudentRankingSystem() {
        ranks = new TreeSet<>();
    }

    // Add a rank
    public void addRank(int rank) {
        if (ranks.add(rank)) {
            System.out.println("Rank " + rank + " has been added.");
        } else {
            System.out.println("Rank " + rank + " already exists.");
        }
    }

    // Remove a rank
    public void removeRank(int rank) {
        if (ranks.remove(rank)) {
            System.out.println("Rank " + rank + " has been removed.");
        } else {
            System.out.println("Rank " + rank + " does not exist.");
        }
    }

    // View all ranks
    public void viewRanks() {
        if (ranks.isEmpty()) {
            System.out.println("No ranks available.");
        } else {
            System.out.println("Student ranks: " + ranks);
        }
    }

    // Check if a rank exists
    public void checkRank(int rank) {
        if (ranks.contains(rank)) {
            System.out.println("Rank " + rank + " exists.");
        } else {
            System.out.println("Rank " + rank + " does not exist.");
        }
    }

    // Get the top and bottom ranks
    public void getTopAndBottomRank() {
        if (!ranks.isEmpty()) {
            System.out.println("Top rank: " + ranks.first());
            System.out.println("Bottom rank: " + ranks.last());
        } else {
            System.out.println("No ranks available to display.");
        }
    }
}

public class TreeSetExample {
    public static void main(String[] args) {
        StudentRankingSystem rankingSystem = new StudentRankingSystem();

        // Adding ranks
        rankingSystem.addRank(3);
        rankingSystem.addRank(1);
        rankingSystem.addRank(2);
        rankingSystem.addRank(2); // Duplicate rank

        // Viewing all ranks
        rankingSystem.viewRanks();

        // Checking for a specific rank
        rankingSystem.checkRank(2);
        rankingSystem.checkRank(4);

        // Removing a rank
        rankingSystem.removeRank(1);
        rankingSystem.viewRanks();

        // Viewing top and bottom ranks
        rankingSystem.getTopAndBottomRank();
    }
}

