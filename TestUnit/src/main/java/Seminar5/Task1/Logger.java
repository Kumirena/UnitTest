package Seminar5.Task1;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    //создание массива для логов
    private List<String> logs = new ArrayList<>();

    // метод log позволяет добавлять новые сообщения в список logs
    public void log(String message) {
        logs.add(message);
    }

    // метод getLogs возвращает список всех сохраненных сообщений
    public List<String> getLogs() {
        return logs;
    }
}