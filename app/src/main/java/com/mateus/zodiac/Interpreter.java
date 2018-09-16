package com.mateus.zodiac;

import java.util.ArrayList;

public class Interpreter {

    private ArrayList<Sign> signs = new ArrayList<Sign>() {{
        add(new Sign(20, 18, 1, 2, "Aquarius", "@drawable/aquarius"));
        add(new Sign(19, 20, 2, 3, "Pisces", "@drawable/pisces"));
        add(new Sign(21, 19, 3, 4, "Aries", "@drawable/aries"));
        add(new Sign(20, 20, 4, 5, "Taurus", "@drawable/taurus"));
        add(new Sign(21, 20, 5, 6, "Gemini", "@drawable/gemini"));
        add(new Sign(21, 22, 6, 7, "Cancer", "@drawable/cancer"));
        add(new Sign(23, 22, 7, 8, "Leo", "@drawable/leo"));
        add(new Sign(23, 22, 8, 9, "Virgo", "@drawable/virgo"));
        add(new Sign(23, 22, 9, 10, "Libra", "@drawable/libra"));
        add(new Sign(23, 21, 10, 11, "Scorpio", "@drawable/scorpio"));
        add(new Sign(22, 21, 11, 12, "Sagittarius", "@drawable/sagittarius"));
        add(new Sign(22, 19, 12, 1, "Capricorn", "@drawable/capricorn"));
    }};

    public Sign interpret(int dia, int mes) {
        Sign sign = null;
        for (Sign s : signs) {
            if (s.getFirstMonth() == mes && dia >= s.getFirstDay()) {
                sign = s;
                break;
            } else if (s.getLastMonth() == mes && dia <= s.getLastDay()) {
                sign = s;
                break;
            }
        }
        return sign;
    }
}
