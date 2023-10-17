class Numerology {
    private int destinyNumber;
    private int luckyNumber;
    private String zodiacSign;
    private String personality;
    private String career;
    private String rulingPlanet;

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

    public String getCareer() {
        return career;
    }

    public String getRulingPlanet() {
        return rulingPlanet;
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
                zodiacSign = "Sagittarius";
            else
                zodiacSign = "Capricorn";
        } else if (month == 1) {
            if (day < 20)
                zodiacSign = "Capricorn";
            else
                zodiacSign = "Aquarius";
        } else if (month == 2) {
            if (day < 19)
                zodiacSign = "Aquarius";
            else
                zodiacSign = "Pisces";
        } else if (month == 3) {
            if (day < 21)
                zodiacSign = "Pisces";
            else
                zodiacSign = "Aries";
        } else if (month == 4) {
            if (day < 20)
                zodiacSign = "Aries";
            else
                zodiacSign = "Taurus";
        } else if (month == 5) {
            if (day < 21)
                zodiacSign = "Taurus";
            else
                zodiacSign = "Gmini";
        } else if (month == 6) {
            if (day < 21)
                zodiacSign = "Gemini";
            else
                zodiacSign = "Cancer";
        } else if (month == 7) {
            if (day < 23)
                zodiacSign = "Cancer";
            else
                zodiacSign = "Leo";
        } else if (month == 8) {
            if (day < 23)
                zodiacSign = "Leo";
            else
                zodiacSign = "Virgo";
        } else if (month == 9) {
            if (day < 23)
                zodiacSign = "Virgo";
            else
                zodiacSign = "Libra";
        } else if (month == 10) {
            if (day < 23)
                zodiacSign = "Libra";
            else
                zodiacSign = "Scorpio";
        } else if (month == 11) {
            if (day < 22)
                zodiacSign = "Scorpio";
            else
                zodiacSign = "Sagittarius";
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

    private String career(int day) {
        String career = "";

        if (day == 1 || day == 10 || day == 19 || day == 28) {
            career = "Business is the best career for you. You are born leader. You are risk taker which makes you excel in business.";
        } else if (day == 2 || day == 11 || day == 20 || day == 29) {
            career = "Best career for you is arts, acting, fashion designing, painting etc. You are good public speaker as well. You can do best in any kind of entertainment or creativity.";
        } else if (day == 3 || day == 12 || day == 21 || day == 30) {
            career = "Best careers option for you can be teacher, consultant , chartered accountant,finance etc. You can do best in finance industry. Retail business is another field worth giving a shot;";
        } else if (day == 4 || day == 13 || day == 22 || day == 31) {
            career = "Best career options for you are astrology, lawyer , scientist, architect , designer. You may get attracted to spiritualism as well. You are high risk taker so you may suffer in business.";
        } else if (day == 5 || day == 23 || day == 14) {
            career = "Best career option for you is stock market because you have an ability to make quick decisions and calculations.Technology , sports , marketing or sales are good fields to go in.";
        } else if (day == 6 || day == 15 || day == 24) {
            career = "Profession related to luxury items i.e. cosmetics, painting, musician, film industry, interior designer, fine arts etc. You may love limelight and have magnetic personality.";
        } else if (day == 7 || day == 17 || day == 25) {
            career = "Best career options for you is research, politics, philosophy, reformers, poet, writer, publishing business, photography. You are simple, straightforward and  a hardworking person. ";
        } else if (day == 8 || day == 16 || day == 26) {
            career = "Sports is the best career option for you. You have a lot of courage so it would be good to go in defence. real estate business will also suit you.";
        }
        return career;
    }

    public String rulingPlanet() {
        String rulingPlanet = "";
        if (zodiacSign.equals("aries")) {
            rulingPlanet = "Mars";
        } else if (zodiacSign.equals("Taurus")) {
            rulingPlanet = "Venus";
        } else if (zodiacSign.equals("Gemini")) {
            rulingPlanet = "Mercury";
        } else if (zodiacSign.equals("Cancer")) {
            rulingPlanet = "Moon";
        } else if (zodiacSign.equals("Leo")) {
            rulingPlanet = "Sun";
        } else if (zodiacSign.equals("Virgo")) {
            rulingPlanet = "Mercury";
        } else if (zodiacSign.equals("Libra")) {
            rulingPlanet = "Venus";
        } else if (zodiacSign.equals("Scorpio")) {
            rulingPlanet = "Mars";
        } else if (zodiacSign.equals("Sagittarius")) {
            rulingPlanet = "Jupiter";
        } else if (zodiacSign.equals("Capricorn")) {
            rulingPlanet = "Saturn";
        } else if (zodiacSign.equals("Aquarius")) {
            rulingPlanet = "Saturn";
        } else if (zodiacSign.equals("Pisces")) {
            rulingPlanet = "Jupiter";
        }
        return rulingPlanet;
    }
}

