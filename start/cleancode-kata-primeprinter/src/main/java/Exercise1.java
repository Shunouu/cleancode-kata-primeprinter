import java.time.LocalDate;

public class Exercise1 {

    private LocalDate expirationDate;
    private Boolean approvedForConsumption;
    private Integer inspectorId;

    public Exercise1(LocalDate expirationDate, Boolean approvedForConsumption, Integer inspectorId) {
        this.expirationDate = expirationDate;
        this.approvedForConsumption = approvedForConsumption;
        this.inspectorId = inspectorId;
    }

    public boolean isEdible() {
        return expirationDate.isAfter(LocalDate.now()) && approvedForConsumption && inspectorId != null;
    }
}