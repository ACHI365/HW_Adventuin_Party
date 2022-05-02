package pgdp.adventuin;

public enum Language {
    ENGLISH,
    GERMAN,
    GEORGIAN;

    public String getLocalizedChristmasGreeting(String greeterName) {
        if (this == ENGLISH)
            return greeterName + " wishes you a Merry Christmas!";
        else if (this == GERMAN)
            return "Fröhliche Weihnachten wünscht dir " + greeterName + "!";
        else if (this == GEORGIAN) return greeterName + " გილოცავს შობა-ახალ წელს!";
        else return null;
    }


}
