package assignment2.organizations.party;

public class Election {
    private int votersNumber;

    private boolean fair;

    private String description;

    /**
     * Create a new election.
     * @param votersNumber - the number of voters in the election
     * @param fair - the fairness of the election
     * @param description - the description of the election
     */
    public Election(int votersNumber, boolean fair, String description) {
        this.votersNumber = votersNumber;
        this.fair = fair;
        this.description = description;
    }

    /**
     * Get the number of voters in the election.
     * @return the number of voters in the election
     */
    public int getVotersNumber() {
        return votersNumber;
    }

    /**
     * Set the number of voters in the election.
     * @param votersNumber - the number of voters in the election
     */
    public void setVotersNumber(int votersNumber) {
        this.votersNumber = votersNumber;
    }

    /**
     * Get the fairness of the election.
     * @return the fairness of the election
     */
    public boolean isFair() {
        return fair;
    }

    /**
     * Set the fairness of the election.
     * @param fair - the fairness of the election
     */
    public void setFair(boolean fair) {
        this.fair = fair;
    }

    /**
     * Get the description of the election.
     * @return the description of the election
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description of the election.
     * @param description - the description of the election
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Two elections are equal if they have the same number of voters, fairness and description.
     * @param obj - the object to compare
     * @return true if the elections are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Election)) {
            return false;
        }

        Election e = (Election) obj;

        return votersNumber == e.votersNumber && fair == e.fair && description.equals(e.description);
    }
}
