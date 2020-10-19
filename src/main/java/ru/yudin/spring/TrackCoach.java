package ru.yudin.spring;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "track coach";
    }

    @Override
    public String getDailyFortune() {
        return "do it " + fortuneService.getFortune();
    }
}
