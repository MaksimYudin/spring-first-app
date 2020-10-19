package ru.yudin.spring;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "from HappyFortuneService";
    }
}
