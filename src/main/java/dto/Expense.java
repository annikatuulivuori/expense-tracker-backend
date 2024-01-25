package dto;

/**
 * Expense class for single expense with getters for attributes
 *
 * @author annikatuulivuori
 * @version 24.1.2024
 *
 */
public class Expense {
    private final int id;
    private final String desc;
    private final double amount;

    /**
     * Constructor for expense
     * @param desc Description
     * @param amount Amount
     */
    public Expense(int id, String desc, double amount) {
        this.id = id;
        this.desc = desc;
        this.amount = amount;
    }

    /**
     * Getter for id
     * @return Identifier of expense
     */
    public int getId() {
        return id;
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
