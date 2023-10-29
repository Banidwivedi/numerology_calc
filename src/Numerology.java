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
    public Numerology(Birthday bd) {
        int day = bd.getDay();
        int month = bd.getMonth();
        int year = bd.getYear();

        destinyNumber = destinyNumber(day);
        luckyNumber = luckyNumber();
        zodiacSign = zodiacSign(day, month);
        rulingPlanet = rulingPlanet(zodiacSign);
        career = career(day);
        personality = personality(day);
        future = future(zodiacSign);
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
        String description = switch (destinyNumber) {
            case 1 -> "Natural , inbuilt leadership";
            case 2 -> "Diplomatic capabilities, peacemakers";
            case 3 -> "Optimistic, confident";
            case 4 -> "Responsible, practical";
            case 5 -> "Adventurous , adaptable";
            case 6 -> "Humanitarian, homely";
            case 7 -> "Teaching capabilities, thinker";
            case 8 -> "Ambitious, self controlled";
            case 9 -> "Compassionate, forgiving";
            default -> "";
        };
        return description;
    }

    private int luckyNumber() {
        int veryLuckyNumber = 7; // just because
        final int MAX = 10, MIN = 1;
        int random = (int) (Math.random() * (MAX - MIN)) * MIN;

        if (random % 3 == 0) {
            return veryLuckyNumber;
        } else {
            return random;
        }
    }

    private String zodiacSign(int day, int month) {
        String zodiacSign = "";

        switch (month) {
            case 12 -> {
                if (day < 22)
                    zodiacSign = "sagittarius";
                else
                    zodiacSign = "capricorn";
            }
            case 1 -> {
                if (day < 20)
                    zodiacSign = "capricorn";
                else
                    zodiacSign = "aquarius";
            }
            case 2 -> {
                if (day < 19)
                    zodiacSign = "aquarius";
                else
                    zodiacSign = "pisces";
            }
            case 3 -> {
                if (day < 21)
                    zodiacSign = "pisces";
                else
                    zodiacSign = "aries";
            }
            case 4 -> {
                if (day < 20)
                    zodiacSign = "aries";
                else
                    zodiacSign = "taurus";
            }
            case 5 -> {
                if (day < 21)
                    zodiacSign = "taurus";
                else
                    zodiacSign = "gemini";
            }
            case 6 -> {
                if (day < 21)
                    zodiacSign = "gemini";
                else
                    zodiacSign = "cancer";
            }
            case 7 -> {
                if (day < 23)
                    zodiacSign = "cancer";
                else
                    zodiacSign = "leo";
            }
            case 8 -> {
                if (day < 23)
                    zodiacSign = "leo";
                else
                    zodiacSign = "virgo";
            }
            case 9 -> {
                if (day < 23)
                    zodiacSign = "virgo";
                else
                    zodiacSign = "libra";
            }
            case 10 -> {
                if (day < 23)
                    zodiacSign = "libra";
                else
                    zodiacSign = "scorpio";
            }
            case 11 -> {
                if (day < 22)
                    zodiacSign = "scorpio";
                else
                    zodiacSign = "sagittarius";
            }
            default -> {
            }
        }
        return zodiacSign;
    }

    private String personality(int day) {
        String personality = "";

        if (day == 1 || day == 10 || day == 19 || day == 28) {
            personality = "Dominating nature, reserved in both your personal and professional life, your vision is clear, you are good in leadership.";
        } else if (day == 2 || day == 11 || day == 20 || day == 29) {
            personality = "You are very emotional, you trust others sometimes quite easily. You may be a kind individual. You value sentimental facts.";
        } else if (day == 3 || day == 12 || day == 21 || day == 30) {
            personality = "You are a very spiritual person and a good advisor. You are blessed with great communication skills.";
        } else if (day == 4 || day == 13 || day == 22 || day == 31) {
            personality = "Good for positions in fields of science and technology. You are sharp highly intellectual, quick witted and clever. You are very adventurous. You live life at a fast pace. You implement what you plan and achieve your goals very aggressively.";
        } else if (day == 5 || day == 14 || day == 23 || day == 9) {
            personality = "You are very joyful in nature. You like to live life to the fullest. You love pampering and connecting with people. You are socially very active. You are the boss of your own Life.";
        } else if (day == 6 || day == 15 || day == 24 || day == 18) {
            personality = "You are obsessed with looks, lifestyle and money. You like lavish and luxurious things. You are very good at connecting with people and like to travel.";
        } else if (day == 7 || day == 16 || day == 25 || day == 27) {
            personality = "You are secretive, spiritual and personally closed off. You enjoy research.You usually reach at top management positions due to your calm, scholar mind and far sighted approach.";
        } else if (day == 8 || day == 17 || day == 26) {
            personality = "You are a good decision maker and a believer of hard work. You are extremely practical and you value your commitments.";
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
        } else if (day == 5 || day == 23 || day == 14 || day == 9) {
            career = "Best career option for you is stock market because you have an ability to make quick decisions and calculations.Technology, sports, marketing or sales are good fields to go in.";
        } else if (day == 6 || day == 15 || day == 24 || day == 18) {
            career = "Professions related to luxury items i.e. cosmetics, painting, music, film industry, interior designing, fine arts etc are quite good for you. You love limelight and have magnetic personality.";
        } else if (day == 7 || day == 17 || day == 25 || day == 27) {
            career = "Best career options for you are research, politics, philosophy, poetry, writing, publishing business, photography. You are simple, straightforward and a hardworking person. ";
        } else if (day == 8 || day == 16 || day == 26) {
            career = "Sports is the best career option for you. You have a lot of courage so it would be good to go in defence. Real estate business will also suit you.";
        }
        return career;
    }

    private String rulingPlanet(String zodiacSign) {
        String rulingPlanet = "";
        switch (zodiacSign) {
            case "aries" -> rulingPlanet = "Mars";
            case "taurus" -> rulingPlanet = "Venus";
            case "gemini" -> rulingPlanet = "Mercury";
            case "cancer" -> rulingPlanet = "Moon";
            case "leo" -> rulingPlanet = "Sun";
            case "virgo" -> rulingPlanet = "Mercury";
            case "libra" -> rulingPlanet = "Venus";
            case "scorpio" -> rulingPlanet = "Mars";
            case "sagittarius" -> rulingPlanet = "Jupiter";
            case "capricorn" -> rulingPlanet = "Saturn";
            case "aquarius" -> rulingPlanet = "Saturn";
            case "pisces" -> rulingPlanet = "Jupiter";
            default -> {
            }
        }
        return rulingPlanet;
    }

    /**
     * @return
     */
    private String future(String zodiacSign) {
        
        String future;
        future = switch (zodiacSign) {
            case "aries" ->
                    "You are going to fulfill your dreams and work on your career, personal life and personality as well. You may face some struggle at your workplace and that can cause trouble in your personal life so your are advised to make a balance in your personal as well as professional life.";
            case "taurus" ->
                    "You like to live a life of comfort and luxury. You will love material happiness. You may become lazy. Financial Condition will be somewhat tight, due to which nothing will stop the work but profit can be delayed.";
            case "gemini" ->
                    "You will not able to take decisions immediately. You will travel to new places. You will gain money in investments if you do it carefully. The fantasy of getting a house or vehicle will be fulfilled.";
            case "cancer" ->
                    "You are expected to get new business offer and job opportunities. There are chances that you may get promotion in the current job. ";
            case "leo" ->
                    "This is the perfect time for you to step up and take charge in your career. Your hard work and dedication will pay off, as you make strides towards your professional goals. Don't be afraid to speak up and make your voice heard - your leadership skills will shine through.";
            case "virgo" ->
                    "There will be mental stress but from the financial point of view, you are in benefit. There will be chances of getting success in your work and you can also pay off any of your debts but your expenses will be very high.";
            case "libra" ->
                    "If you plan to make investments in land then taking advice from your parents would help you. You will get a job in the desired place. Don't neglect health problems.";
            case "scorpio" ->
                    "You have plenty of opportunities to meet new people, and relationships will be taken to the next level.communication will be key. Keep your emotions in check and be honest about your feelings. Financial success is possible.";
            case "sagittarius" ->
                    "Work life is brimming with exciting changes, opportunities, and challenges, so don't hesitate to put in extra hours. You will face a few obstacles, but remember that hard work will pay off, so it's essential to keep a positive attitude.";
            case "capricorn" ->
                    "This year is sure to bring a mix of challenges and opportunities for you. You will be ambitious and determined. You may find yourself taking on more responsibility.";
            case "aquarius" ->
                    "good income and any old transaction will also get relief from ending. Your financial condition will be better than before due to profit in business. If money is needed to invest in a business then that too will be fulfilled";
            case "pisces" ->
                    "Financial conditions will improve. You may go on a religious trip. You are going to support your younger siblings.";
            default -> "";
        };
        return future;
    }
}



