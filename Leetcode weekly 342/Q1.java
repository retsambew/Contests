/**
 * 6387. Calculate Delayed Arrival Time
 */
public class Q1 {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }
}