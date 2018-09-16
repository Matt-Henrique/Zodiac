package com.mateus.zodiac;

import java.util.ArrayList;

public class Interpreter {

    private ArrayList<Sign> signs = new ArrayList<Sign>() {{
        add(new Sign(20, 18, 1, 2, "Aquarius", "Often simple and unassuming, the Aquarian goes about accomplishing goals in a quiet, often unorthodox ways.", "@drawable/aquarius"));
        add(new Sign(19, 20, 2, 3, "Pisces", "Also unassuming, the Pisces zodiac signs and meanings deal with acquiring vast amounts of knowledge, but you would never know it. They keep an extremely low profile compared to others in the zodiac.", "@drawable/pisces"));
        add(new Sign(21, 19, 3, 4, "Aries", "Aries people are creative, adaptive, and insightful. They can also be strong-willed and spontaneous (sometimes to a fault).", "@drawable/aries"));
        add(new Sign(20, 20, 4, 5, "Taurus", "Taurus zodiac signs and meanings, like the animal that represents them, is all about strength, stamina and will. Stubborn by nature, the Taurus will stand his/her ground to the bitter end (sometimes even irrationally so).", "@drawable/taurus"));
        add(new Sign(21, 20, 5, 6, "Gemini", "Flexibility, balance and adaptability are the keywords for the Gemini.", "@drawable/gemini"));
        add(new Sign(21, 22, 6, 7, "Cancer", "Cancerians love home-life, family and domestic settings. They are traditionalists, and enjoy operating on a fundamental level.", "@drawable/cancer"));
        add(new Sign(23, 22, 7, 8, "Leo", "The zodiac signs and meanings of Leo is about expanse, power and exuberance.", "@drawable/leo"));
        add(new Sign(23, 22, 8, 9, "Virgo", "Virgo’s have keen minds, and are delightful to talk with, often convincing others of outlandish tales with ease and charm. Virgo’s are inquisitive and are very skilled at drawing information from people.", "@drawable/virgo"));
        add(new Sign(23, 22, 9, 10, "Libra", "As their zodiac signs and meanings would indicate, Libra’s are all about balance, justice, equanimity and stability.", "@drawable/libra"));
        add(new Sign(23, 21, 10, 11, "Scorpio", "The Scorpio is often misunderstood. These personalities are bold and are capable of executing massive enterprises with cool control and confidence.", "@drawable/scorpio"));
        add(new Sign(22, 21, 11, 12, "Sagittarius", "Here we have the philosopher among the zodiac signs and meanings. Like the Scorpio, they have great ability for focus, and can be very intense.", "@drawable/sagittarius"));
        add(new Sign(22, 19, 12, 1, "Capricorn", "Capricorn’s are also philosophical signs and are highly intelligent too. They apply their knowledge to practical matters, and strive to maintain stability and order.", "@drawable/capricorn"));
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
