package com.example.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    private static WebDriver driver;

    // Metoda do uzyskania instancji WebDrivera
    public static WebDriver getDriver() {
        if (driver == null) {
            io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup(); // Automatyczne ustawienie ChromeDrivera
            driver = new ChromeDriver(); // Utworzenie nowej instancji ChromeDrivera
            driver.manage().window().maximize(); // Maksymalizacja okna przeglądarki
        }
        return driver; // Zwrócenie instancji WebDrivera
    }

    // Metoda do zamknięcia WebDrivera
    public static void quitDriver() {
        if (driver != null) {
            driver.quit(); // Zamknięcie przeglądarki
            driver = null; // Ustawienie na null, aby umożliwić ponowne utworzenie
        }
    }
}
