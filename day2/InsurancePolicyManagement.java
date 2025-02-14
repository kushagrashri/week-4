package org.week4.day2;

import java.util.*;

class Policy1 implements Comparable<Policy1> {
    private String policyNumber;
    private String policyholderName;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;

    public Policy1(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() { return policyNumber; }
    public Date getExpiryDate() { return expiryDate; }
    public String getCoverageType() { return coverageType; }

    @Override
    public int compareTo(Policy1 other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Policy1 policy = (Policy1) obj;
        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public String toString() {
        return policyNumber + " - " + policyholderName + " - " + coverageType + " - Expiry: " + expiryDate;
    }
}

public class InsurancePolicyManagement {
    private final Set<Policy1> hashSetPolicies = new HashSet<>();
    private final Set<Policy1> linkedHashSetPolicies = new LinkedHashSet<>();
    private final Set<Policy1> treeSetPolicies = new TreeSet<>();

    public void addPolicy(Policy1 policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public void displayPolicies() {
        System.out.println("All Unique Policies:");
        for (Policy1 policy : treeSetPolicies) {
            System.out.println(policy);
        }
    }

    public void displayExpiringSoon() {
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date threshold = calendar.getTime();

        System.out.println("Policies Expiring Soon:");
        for (Policy1 policy : treeSetPolicies) {
            if (policy.getExpiryDate().before(threshold)) {
                System.out.println(policy);
            }
        }
    }

    public void displayByCoverageType(String coverageType) {
        System.out.println("Policies with Coverage Type: " + coverageType);
        for (Policy1 policy : treeSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(policy);
            }
        }
    }

    public void displayDuplicatePolicies() {
        Map<String, Integer> policyCount = new HashMap<>();
        for (Policy1 policy : hashSetPolicies) {
            policyCount.put(policy.getPolicyNumber(), policyCount.getOrDefault(policy.getPolicyNumber(), 0) + 1);
        }

        System.out.println("Duplicate Policies:");
        for (Map.Entry<String, Integer> entry : policyCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Policy Number: " + entry.getKey() + " - Count: " + entry.getValue());
            }
        }
    }

    public void performanceComparison() {
        int size = 10000;
        Set<Policy1> hashSet = new HashSet<>();
        Set<Policy1> linkedHashSet = new LinkedHashSet<>();
        Set<Policy1> treeSet = new TreeSet<>();

        long start, end;

        System.out.println("Performance Comparison:");

        // Add performance
        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashSet.add(new Policy1("P" + i, "Holder" + i, new Date(), "Health", 1000));
        }
        end = System.nanoTime();
        System.out.println("HashSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedHashSet.add(new Policy1("P" + i, "Holder" + i, new Date(), "Health", 1000));
        }
        end = System.nanoTime();
        System.out.println("LinkedHashSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            treeSet.add(new Policy1("P" + i, "Holder" + i, new Date(), "Health", 1000));
        }
        end = System.nanoTime();
        System.out.println("TreeSet Add Time: " + (end - start) + " ns");
    }

    public static void main(String[] args) {
        InsurancePolicyManagement system = new InsurancePolicyManagement();
        system.addPolicy(new Policy1("P1001", "John Doe", new Date(2025, 5, 10), "Health", 500.0));
        system.addPolicy(new Policy1("P1002", "Alice Smith", new Date(2024, 8, 15), "Auto", 600.0));
        system.addPolicy(new Policy1("P1003", "Bob Brown", new Date(2026, 1, 1), "Home", 700.0));
        system.addPolicy(new Policy1("P1002", "Alice Smith", new Date(2024, 8, 15), "Auto", 600.0));

        system.displayPolicies();
        system.displayExpiringSoon();
        system.displayByCoverageType("Auto");
        system.displayDuplicatePolicies();
        system.performanceComparison();
    }
}