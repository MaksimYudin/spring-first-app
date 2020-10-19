package ru.yudin.spring;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "baseball coach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
