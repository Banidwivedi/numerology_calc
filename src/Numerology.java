class Numerology {
    int destinyNumber, luckyNumber;
    String zodiacSign, personality;
    public void destinyNumber(int n) {
        int rem, sum = 0;
        while (n > 0 || sum > 9) {
            if (n == 0) {

                n = sum;
                sum = 0;
            }
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;


        }
        destinyNumber = sum;
    }

    public void luckyNumber(int n) {
        int rem, sum = 0;
        sum = 0;
        while (n > 0 || sum > 9) {
            if (n == 0) {

                n = sum;
                sum = 0;
            }
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;


        }


    }

    public String zodiacSign(int date, int month) {
        String zodiacSign = "";

        if (month == 12) {
            if (date < 22)
                zodiacSign = "sagittarius";
            else
                zodiacSign = "capricorn";
        } else if (month == 1) {
            if (date < 20)
                zodiacSign = "capricorn";
            else
                zodiacSign = "aquarius";
        } else if (month == 2) {
            if (date < 19)
                zodiacSign = "aquarius";
            else
                zodiacSign = "pisces";
        } else if (month == 3) {
            if (date < 21)
                zodiacSign = "pisces";
            else
                zodiacSign = "aries";
        } else if (month == 4) {
            if (date < 20)
                zodiacSign = "aries";
            else
                zodiacSign = "taurus";
        } else if (month == 5) {
            if (date < 21)
                zodiacSign = "taurus";
            else
                zodiacSign = "gemini";
        } else if (month == 6) {
            if (date < 21)
                zodiacSign = "gemini";
            else
                zodiacSign = "cancer";
        } else if (month == 7) {
            if (date < 23)
                zodiacSign = "cancer";
            else
                zodiacSign = "leo";
        } else if (month == 8) {
            if (date < 23)
                zodiacSign = "leo";
            else
                zodiacSign = "virgo";
        } else if (month == 9) {
            if (date < 23)
                zodiacSign = "virgo";
            else
                zodiacSign = "libra";
        } else if (month == 10) {
            if (date < 23)
                zodiacSign = "libra";
            else
                zodiacSign = "scorpio";
        } else if (month == 11) {
            if (date < 22)
                zodiacSign = "scorpio";
            else
                zodiacSign = "sagittarius";
        }
        return zodiacSign;
    }

    public String personality(int d) {
        String personality = "";

        if (d == 1 || d == 10 || d == 19 || d == 28) {
            personality = "Dominating nature , reserved in both your personal and professional life,your vision is clear,you are good in leadership.";
        }
        else if(d == 2 || d == 11|| d == 20 || d == 29 )
        {
            personality = "You are very emotional, you trust others sometimes quite easily . You may be a kind individual.You value sentimental facts";
        }
        else if(d == 3 || d == 12 || d==21||d ==30)
        {
            personality = "You are a very spiritual person and a good advisor. You are good at making money by investing in stock market and funds. you are blessed with great communication skills";
        }
        else if(d==4|| d==13|| d==22|| d== 31)
        {
            personality ="Good for positions in fields of science and technology.Your personality traits reveal that you are highly intellectual. You are sharp , quick witted and clever. You are very adventurous. You like to be energetic and live life at a fast pace. You are good at calculations. You implement what you plan and achieve your goals very aggressively.";
        }
        else if(d==5||d==14||d==23)
        {
            personality = "You are very joyful in nature. You like to live life to the fullest. You love pampering and connecting with people. You are socially very active.You never wish to live an employee like life. You are the boss of your own Life.";
        }
        else if(d==6||d==15||d==24)
        {
            personality = "You are obsessed with looks, lifestyle and money. You like thins lavish and luxurious . You are very good at connecting with people. You like to travel and usually are found in career that take you yo different places. You have a strong bonding with life partner";
        }
        else if(d==7||d==16||d==25)
        {
            personality = "YOu are secretive , spiritual and personally closed off. You enjoy working in fields of research, data science etc.You usually reach at top management postions due to your calm, scholar mind and far sighted appraoch. ";
        }
        else if(d==8|| d==17||d==26)
        {
            personality  = "You are a good decision maker. You are a believer of hard work .you are extremely practical and you value your commitments.";
        }
        return personality;
    }
}

