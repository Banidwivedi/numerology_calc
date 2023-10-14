class Numerology {
    private int destinyNumber;
    private int luckyNumber;
    private String zodiacSign;
    private String personality;

    public int getDestinyNumber() {
        return destinyNumber;
    }

    public int getLuckyNumber() {
        return luckyNumber;
    }

    public String getZodiacSign() {
        return zodiacSign;
    }

    public String getPersonality() {
        return personality;
    }

    // bd -> birthdate
    public Numerology(String firstName, String secondName, Birthday bd, String placeOfBirth) {
        int day = bd.getDay();
        int month = bd.getMonth();
        int year = bd.getYear();

        destinyNumber = destinyNumber(day);
        luckyNumber = luckyNumber();
        zodiacSign = zodiacSign(day, month);
        personality = personality(day);
    }
    public int destinyNumber(int day) {
        int rem, sum = 0;
        while (day > 0 || sum > 9) {
            if (day == 0) {
                day = sum;
                sum = 0;
            }
            rem = day % 10;
            sum = sum + rem;
            day = day / 10;
        }
        return sum;
    }

    public int luckyNumber() {
        int veryLuckyNumber = 7; // just because
        final int MAX = 10, MIN = 0;
        int random = (int) (Math.random() * (MAX - MIN)) * MIN;

        if (random % 3 == 0) {
            return veryLuckyNumber;
        } else {
            return random;
        }
    }

    public String zodiacSign(int day, int month) {
        String zodiacSign = "";

        if (month == 12) {
            if (day < 22)
                zodiacSign = "sagittarius";
            else
                zodiacSign = "capricorn";
        } else if (month == 1) {
            if (day < 20)
                zodiacSign = "capricorn";
            else
                zodiacSign = "aquarius";
        } else if (month == 2) {
            if (day < 19)
                zodiacSign = "aquarius";
            else
                zodiacSign = "pisces";
        } else if (month == 3) {
            if (day < 21)
                zodiacSign = "pisces";
            else
                zodiacSign = "aries";
        } else if (month == 4) {
            if (day < 20)
                zodiacSign = "aries";
            else
                zodiacSign = "taurus";
        } else if (month == 5) {
            if (day < 21)
                zodiacSign = "taurus";
            else
                zodiacSign = "gemini";
        } else if (month == 6) {
            if (day < 21)
                zodiacSign = "gemini";
            else
                zodiacSign = "cancer";
        } else if (month == 7) {
            if (day < 23)
                zodiacSign = "cancer";
            else
                zodiacSign = "leo";
        } else if (month == 8) {
            if (day < 23)
                zodiacSign = "leo";
            else
                zodiacSign = "virgo";
        } else if (month == 9) {
            if (day < 23)
                zodiacSign = "virgo";
            else
                zodiacSign = "libra";
        } else if (month == 10) {
            if (day < 23)
                zodiacSign = "libra";
            else
                zodiacSign = "scorpio";
        } else if (month == 11) {
            if (day < 22)
                zodiacSign = "scorpio";
            else
                zodiacSign = "sagittarius";
        }
        return zodiacSign;
    }

    public String personality(int day) {
        String personality = "";

        if (day == 1 || day == 10 || day == 19 || day == 28) {
            personality = "Dominating nature , reserved in both your personal and professional life,your vision is clear,you are good in leadership.";
        } else if (day == 2 || day == 11 || day == 20 || day == 29) {
            personality = "You are very emotional, you trust others sometimes quite easily . You may be a kind individual.You value sentimental facts";
        } else if (day == 3 || day == 12 || day == 21 || day == 30) {
            personality = "You are a very spiritual person and a good advisor. You are good at making money by investing in stock market and funds. you are blessed with great communication skills";
        } else if (day == 4 || day == 13 || day == 22 || day == 31) {
            personality = "Good for positions in fields of science and technology.Your personality traits reveal that you are highly intellectual. You are sharp , quick witted and clever. You are very adventurous. You like to be energetic and live life at a fast pace. You are good at calculations. You implement what you plan and achieve your goals very aggressively.";
        } else if (day == 5 || day == 14 || day == 23) {
            personality = "You are very joyful in nature. You like to live life to the fullest. You love pampering and connecting with people. You are socially very active.You never wish to live an employee like life. You are the boss of your own Life.";
        } else if (day == 6 || day == 15 || day == 24) {
            personality = "You are obsessed with looks, lifestyle and money. You like thins lavish and luxurious . You are very good at connecting with people. You like to travel and usually are found in career that take you yo different places. You have a strong bonding with life partner";
        } else if (day == 7 || day == 16 || day == 25) {
            personality = "YOu are secretive , spiritual and personally closed off. You enjoy working in fields of research, data science etc.You usually reach at top management postions due to your calm, scholar mind and far sighted appraoch. ";
        } else if (day == 8 || day == 17 || day == 26) {
            personality = "You are a good decision maker. You are a believer of hard work .you are extremely practical and you value your commitments.";
        }
        return personality;
    }
}

