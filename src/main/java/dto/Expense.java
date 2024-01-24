package dto;

/**
 * Expense class for single expense with getters for attributes
 *
 * @author annikatuulivuori
 * @version 24.1.2024
 *
 */
public class Expense {
    private final String desc;
    private final double amount;

    /**
     * Constructor for expense
     * @param desc Description
     * @param amount Amount
     */
    public Expense(String desc, double amount) {
        this.desc = desc;
        this.amount = amount;
    }

    /**
     * Gettter for description
     * @return Description of expense
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Getter for amount
     * @return How much the expense was
     */
    public double getAmount() {
        return amount;
    }

}
