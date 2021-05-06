public class StepTrack {
    private int least;
    private int total_steps;
    private int active_days;
    private int days;
    public StepTrack(int least) {
        this.least = least;
        total_steps = 0;
        active_days = 0;
        days = 0;
    }

    public int activeDays() {
        return active_days;
    }
    public double averageSteps() {
        if(total_steps == 0)
            return 0.0;
        return total_steps/days;
    }
    public void addDailySteps(int DailySteps) {
        this.total_steps += DailySteps;
        this.days += 1;
        if (DailySteps >= least) {
            this.active_days += 1;
        }
    }
}
