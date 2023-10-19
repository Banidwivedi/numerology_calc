class Numerology {
    private int destinyNumber;
    private int luckyNumber;
    private String zodiacSign;
    private String personality;
    private String career;
    private String destinyNoDescription;
    private String rulingPlanet;
    private String future;

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

    public String getDestinyNoDescription() {
        return destinyNoDescription;
    }

    public String getFuture() {
        return future;
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

    private int destinyNumber(int day) {
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

    private String destinyNumberDescription() {
        String description = "";
        if (destinyNumber == 1)
            description = "Natural , inbuilt leadership";
        if (destinyNumber == 2)
            description = "Diplomatic capabilities, peacemakers";
        if (destinyNumber == 3)
            description = "Optimistic, confident";
        if (destinyNumber == 4)
            description = "Responsible, practical";
        if (destinyNumber == 5)
            description = "Adventurous , adaptable";
        if (destinyNumber == 6)
            description = "Humanitarian, homely";
        if (destinyNumber == 7)
            description = "Teaching capabilities, thinker";
        if (destinyNumber == 8)
            description = "Ambitious, self controlled";
        if (destinyNumber == 9)
            description = "Compassionate, forgiving";
        return description;
    }

    private int luckyNumber() {
        int veryLuckyNumber = 7; // just because
        final int MAX = 10, MIN = 0;
        int random = (int) (Math.random() * (MAX - MIN)) * MIN;

        if (random % 3 == 0) {
            return veryLuckyNumber;
        } else {
            return random;
        }
    }

    private String zodiacSign(int day, int month) {
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
                zodiacSign = "Gemini";
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

    private String personality(int day) {
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
            personality = "You are obsessed with looks, lifestyle and money. You like lavish and luxurious things . You are very good at connecting with people. You like to travel and usually are found in career that take you to different places. You have a strong bonding with life partner";
        } else if (day == 7 || day == 16 || day == 25) {
            personality = "You are secretive , spiritual and personally closed off. You enjoy working in fields of research, data science etc.You usually reach at top management positions due to your calm, scholar mind and far sighted approach. ";
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
            career = "Best careers for you are arts, acting, fashion designing, painting etc. You are good public speaker as well. You can do best in any kind of entertainment or creativity.";
        } else if (day == 3 || day == 12 || day == 21 || day == 30) {
            career = "Best career options for you can be teacher, consultant, chartered accountant, financial advisor etc. You can do best in finance industry. Retail business is another field worth giving a shot;";
        } else if (day == 4 || day == 13 || day == 22 || day == 31) {
            career = "Best career options for you are astrology, lawyer, scientist, architect, designer etc. You may get attracted to spiritualism as well. You are high risk taker so you may suffer in business.";
        } else if (day == 5 || day == 23 || day == 14) {
            career = "Best career option for you is stock market because you have an ability to make quick decisions and calculations.Technology, sports, marketing or sales are good fields to go in.";
        } else if (day == 6 || day == 15 || day == 24) {
            career = "Professions related to luxury items i.e. cosmetics, painting, music, film industry, interior designing, fine arts etc are quite good for you. You love limelight and have magnetic personality.";
        } else if (day == 7 || day == 17 || day == 25) {
            career = "Best career options for you are research, politics, philosophy, poetry, writing, publishing business, photography. You are simple, straightforward and  a hardworking person. ";
        } else if (day == 8 || day == 16 || day == 26) {
            career = "Sports is the best career option for you. You have a lot of courage so it would be good to go in defence. Real estate business will also suit you.";
        }
        return career;
    }

    private String rulingPlanet() {
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

    /**
     * @return
     */
    private String future() {
        String future;
        future = switch (zodiacSign) {
            case "Aries" ->
                    "You are going to fulfill your dreams and work on your career, personal life and personality as well. You may face some struggle at your workplace and that can cause trouble in your personal life so your are advised to make a balance in your personal as well as professional life.";
            case "Taurus" ->
                    "You like to live a life of comfort and luxury. You will love material happiness. You may become lazy. Financial Condition will be somewhat tight, due to which nothing will stop the work but profit can be delayed.";
            case "Gemini" ->
                    "You will not able to take decisions immediately. You will travel to new places. You will gain money in investments if you do it carefully. The fantasy of getting a house or vehicle will be fulfilled.";
            case "Cancer" ->
                    "You are expected to get new business offer and job opportunities. There are chances that you may get promotion in the current job. ";
            case "Leo" ->
                    "This is the perfect time for you to step up and take charge in your career. Your hard work and dedication will pay off, as you make strides towards your professional goals. Don't be afraid to speak up and make your voice heard - your leadership skills will shine through.";
            case "Virgo" ->
                    "There will be mental stress but from the financial point of view, you are in benefit. There will be chances of getting success in your work and you can also pay off any of your debts but your expenses will be very high.";
            case "Libra" ->
                    "If you plan to make investments in land then taking advice from your parents would help you. You will get a job in the desired place. Don't neglect health problems.";
            case "Scorpio" ->
                    "You have plenty of opportunities to meet new people, and relationships will be taken to the next level.communication will be key. Keep your emotions in check and be honest about your feelings. Financial success is possible.";
            case "Sagittarius" ->
                    "Work life is brimming with exciting changes, opportunities, and challenges, so don't hesitate to put in extra hours. You will face a few obstacles, but remember that hard work will pay off, so it's essential to keep a positive attitude.";
            case "Capricorn" ->
                    "This year is sure to bring a mix of challenges and opportunities for you. You will be ambitious and determined. You may find yourself taking on more responsibility.";
            case "Aquarius" ->
                    "good income and any old transaction will also get relief from ending. Your financial condition will be better than before due to profit in business. If money is needed to invest in a business then that too will be fulfilled";
            case "Pisces" ->
                    "Financial conditions will improve . You  may go on a religious trip. You are going to support your younger siblings.";
            default -> "";
        };
        return future;
    }
}



