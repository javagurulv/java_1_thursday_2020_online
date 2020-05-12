package student_aleksey_kodin.handwriting;

class HandWriting {

    private final String[] arrHandWriting = {"nulle ","viens ","divi ","trīs ","četri ","pieci ","seši ",
                                             "septeņi ","astoņi ","deviņi "};

    private String strHandWriting;
    private String strDigits;
    private String strWholePart;
    private String strCoins;
    private final String THOUSAND = "tūksto";

    HandWriting () {
        strHandWriting = "nulle euro 00.centi";
    }
    HandWriting (String strDigits) {
            this.strDigits = strDigits;
                setHandWriting (strDigits);
    }
    HandWriting (float fDigits) {
            this.strDigits = String.valueOf(fDigits);
                setHandWriting (strDigits);
    }
    HandWriting (double fDigits) {
        this.strDigits = String.valueOf(fDigits);
        setHandWriting (strDigits);
    }

    public String getHandWriting () {
        return strHandWriting;
    }
    public String getDigits () { return strDigits; }
    public void setHandWriting (String strDigits) {

    String CURRENCY = "euro ";

        strHandWriting = "";
        this.strDigits = strDigits;

        getWholePart ();
            switch (strWholePart.length()) {
                case 5 -> {
                    String strHandWritingPart1 = convertToWord(strWholePart.substring(0, 2)).concat(THOUSAND) + "ši ";
                    strHandWriting = "";
                    String strHandWritingPart2 = convertToWord(strWholePart.substring(2,5)).concat(CURRENCY) + strCoins;
                    strHandWriting = "";
                    strHandWriting = strHandWritingPart1.concat(strHandWritingPart2);
                }
                case 6 -> {
                    String strHandWritingPart1 = convertToWord(strWholePart.substring(0, 3)).concat(THOUSAND) + "ši ";
                    strHandWriting = "";
                    String strHandWritingPart2 = convertToWord(strWholePart.substring(3,6)).concat(CURRENCY) + strCoins;
                    strHandWriting = "";
                    strHandWriting = strHandWritingPart1.concat(strHandWritingPart2);
                }
                default -> strHandWriting = convertToWord(strWholePart).concat(CURRENCY) + strCoins;
            }
    }

    private void getWholePart () {
    String CENTI = " centi";
    int iPointIndex;
    int iLength = strDigits.length();

        if ((strDigits.contains(",")))  {
            iPointIndex = strDigits.indexOf(",");
            strWholePart = strDigits.substring(0,iPointIndex);
            strCoins = strDigits.substring(iPointIndex+1,iLength) + CENTI;
        }
        else if (strDigits.contains(".")) {
            iPointIndex = strDigits.indexOf(".");
            strWholePart = strDigits.substring(0,iPointIndex);
            strCoins = strDigits.substring(iPointIndex+1,iLength) + CENTI;
        }
        else {
            strWholePart = strDigits;
            strCoins = "00 centi";
        }
    }
    private String convertToWord(String strPart) {
        String DOZENS = "desmit ";
        String HUNDRED = "simt";


        int iTemp = strPart.length();
        boolean bFlag = false;

        for (int iCounter = 0; iCounter < strPart.length(); iCounter++) {

            switch (strPart.substring(iCounter, iCounter + 1)) {
                case "0":
                    if (strPart.length() == 1) {
                        strHandWriting = arrHandWriting[0];
                    }
                    break;
                case "1":
                    if (iTemp == 1) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[1]);
                    }
                    if (iTemp == 2) {
                        String SPECDOZENS = "padsmit ";
                        switch (strPart.substring(iCounter + 1, iCounter + 2)) {
                            case "0" -> {
                                strHandWriting = strHandWriting.concat(DOZENS);
                                bFlag = true;
                            }
                            case "1" -> {
                                strHandWriting = strHandWriting.concat(arrHandWriting[1].substring(0, arrHandWriting[1].length() - 2)) + SPECDOZENS;
                                bFlag = true;
                            }
                            case "2" -> {
                                strHandWriting = strHandWriting.concat(arrHandWriting[2].substring(0, arrHandWriting[2].length() - 2)) + SPECDOZENS;
                                bFlag = true;
                            }
                            case "3" -> {
                                strHandWriting = strHandWriting.concat(arrHandWriting[3].substring(0,arrHandWriting[3].length()- 1)) + SPECDOZENS;
                                bFlag = true;
                            }
                            case "4" -> {
                                strHandWriting = strHandWriting.concat(arrHandWriting[4].substring(0, arrHandWriting[4].length() - 2)) + SPECDOZENS;
                                bFlag = true;
                            }
                            case "5" -> {
                                strHandWriting = strHandWriting.concat(arrHandWriting[5].substring(0, arrHandWriting[5].length() - 2)) + SPECDOZENS;
                                bFlag = true;
                            }
                            case "6" -> {
                                strHandWriting = strHandWriting.concat(arrHandWriting[6].substring(0, arrHandWriting[6].length() - 2)) + SPECDOZENS;
                                bFlag = true;
                            }
                            case "7" -> {
                                strHandWriting = strHandWriting.concat(arrHandWriting[7].substring(0, arrHandWriting[7].length() - 2)) + SPECDOZENS;
                                bFlag = true;
                            }
                            case "8" -> {
                                strHandWriting = strHandWriting.concat(arrHandWriting[8].substring(0, arrHandWriting[8].length() - 2)) + SPECDOZENS;
                                bFlag = true;
                            }
                            case "9" -> {
                                strHandWriting = strHandWriting.concat(arrHandWriting[9].substring(0, arrHandWriting[9].length() - 2)) + SPECDOZENS;
                                bFlag = true;
                            }
                        }
                    }
                    if (iTemp == 3) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[1]) + HUNDRED + "s ";
                    }
                    if (iTemp == 4) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[1]) + THOUSAND + "tis ";
                    }
                    break;
                case "2":
                    if (iTemp == 1) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[2]);
                    }
                    if (iTemp == 2) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[2].substring(0, arrHandWriting[2].length() - 1)) + DOZENS;
                    }
                    if (iTemp == 3) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[2]) + HUNDRED + "i ";
                    }
                    if (iTemp == 4) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[2]) + THOUSAND + "ši ";
                    }
                    break;
                case "3":
                    if (iTemp == 1) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[3]);
                    }
                    if (iTemp == 2) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[3]) + DOZENS;
                    }
                    if (iTemp == 3) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[3]) + HUNDRED + "i ";
                    }
                    if (iTemp == 4) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[3]) + THOUSAND + "ši ";
                    }
                    break;
                case "4":
                    if (iTemp == 1) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[4]);
                    }
                    if (iTemp == 2) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[4].substring(0, arrHandWriting[4].length() - 1)) + DOZENS;
                    }
                    if (iTemp == 3) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[4]) + HUNDRED + "i ";
                    }
                    if (iTemp == 4) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[4]) + THOUSAND + "ši ";
                    }
                    break;
                case "5":
                    if (iTemp == 1) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[5]);
                    }
                    if (iTemp == 2) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[5].substring(0, arrHandWriting[5].length() - 1)) + DOZENS;
                    }
                    if (iTemp == 3) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[5]) + HUNDRED + "i ";
                    }
                    if (iTemp == 4) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[5]) + THOUSAND + "ši ";
                    }
                    break;
                case "6":
                    if (iTemp == 1) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[6]);
                    }
                    if (iTemp == 2) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[6].substring(0, arrHandWriting[6].length() - 1)) + DOZENS;
                    }
                    if (iTemp == 3) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[6]) + HUNDRED + "i ";
                    }
                    if (iTemp == 4) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[6]) + THOUSAND + "ši ";
                    }
                    break;
                case "7":
                    if (iTemp == 1) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[7]);
                    }
                    if (iTemp == 2) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[7].substring(0, arrHandWriting[7].length() - 1)) + DOZENS;
                    }
                    if (iTemp == 3) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[7]) + HUNDRED + "i ";
                    }
                    if (iTemp == 4) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[7]) + THOUSAND + "ši ";
                    }
                    break;
                case "8":
                    if (iTemp == 1) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[8]);
                    }
                    if (iTemp == 2) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[8].substring(0, arrHandWriting[8].length() - 1)) + DOZENS;
                    }
                    if (iTemp == 3) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[8]) + HUNDRED + "i ";
                    }
                    if (iTemp == 4) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[8]) + THOUSAND + "ši ";
                    }
                    break;
                case "9":
                    if (iTemp == 1) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[9]);
                    }
                    if (iTemp == 2) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[9].substring(0, arrHandWriting[9].length() - 1)) + DOZENS;
                    }
                    if (iTemp == 3) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[9]) + HUNDRED + "i ";
                    }
                    if (iTemp == 4) {
                        strHandWriting = strHandWriting.concat(arrHandWriting[9]) + THOUSAND + "ši ";
                    }
                    break;
            }
            iTemp--;
            if (bFlag) {
                break;
            }
        }
        return strHandWriting;
    }
}
