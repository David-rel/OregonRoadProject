package MainPackage;

import MainTrail.SetTrail.DayEight.GunFight;
import MainTrail.SetTrail.DayEighteen.GunFight2;
import MainTrail.SetTrail.DayElleven.Bank1;
import MainTrail.SetTrail.DayElleven.BankClass;
import MainTrail.SetTrail.DayFifteen.Casino;
import MainTrail.SetTrail.DayFourteen.StopPoint2;
import MainTrail.SetTrail.DayNine.BrokenPart3;
import MainTrail.SetTrail.DayNineteen.DiseaseOutbreak4;
import MainTrail.SetTrail.DaySeventeen.Bank2;
import MainTrail.SetTrail.DaySeventeen.BankClass2;
import MainTrail.SetTrail.DaySixTeen.Waterfall3;
import MainTrail.SetTrail.DayTen.ShopAsk2;
import MainTrail.SetTrail.DayThirteen.SellCategoryItemAsk;
import MainTrail.SetTrail.DayThirteen.SellShop;
import MainTrail.SetTrail.DayThirteen.SellSpecificItemAsk;
import MainTrail.SetTrail.DayTwelve.DiseaseOutbreak3;
import MainTrail.SetTrail.DayTwenty.ShopAsk3;
import MainTrail.SetTrail.DayTwentyOne.StopPoint3;
import MainTrail.SetTrail.DayTwentyTwo.BrokenPart4;
import MainTrail.StartTrail.DayOne.TrailChoice;
import MainTrail.StartTrail.TrailOne.DayFive.BrokenPart;
import MainTrail.StartTrail.TrailOne.DayFour.DiseaseOutBreak;
import MainTrail.StartTrail.TrailOne.DaySeven.GettingFood;
import MainTrail.StartTrail.TrailOne.DaySix.WaterFall1;
import MainTrail.StartTrail.TrailOne.DayThree.StopPoint;
import MainTrail.StartTrail.TrailOne.DayTwo.StrangerMeetUp;
import MainTrail.StartTrail.TrailTwo.DayFive.BrokenPart2;
import MainTrail.StartTrail.TrailTwo.DayFour.DiseaseOutBreak2;
import MainTrail.StartTrail.TrailTwo.DaySix.GettingFood2;
import MainTrail.StartTrail.TrailTwo.DayThree.WaterFall2;
import MainTrail.StartTrail.TrailTwo.DayTwo.FriendMeetUp;
import ShopAsking.*;
import ShopAsking.ShopItemsSpecific.*;
import SubClasses.InsideWagon.InsideWagonStuff;
import SubClasses.MainPlayer.MainPlayerInfo;
import SubClasses.Results.*;
import SubClasses.map.Map;
import java.util.Random;

public class OregonRoadMain {

    //start and day continue
    static boolean START = false;
    static int StartTrail = 1;

    //outputs
    static String difficulty = "";
    static int money = 0;
    static int food = 0;
    static int miles = 2000;
    static int days = 0;

    //day and level checking
    static int check_days = 0;
    static int ResultCall = 0;

    //booleans for shop
    static boolean ShopsBeenAsked = false;
    static boolean SetTrailGetResults = false;
    static boolean SetTrailGetResults2 = false;

    //map data
    static int MapData = 0;
    static int LRT1 = 0;

    //shop items
    static int BandagesMed = 0;
    static int MeaslesMed = 0;
    static int DissentrayMed = 0;
    static int FluMed = 0;
    static int Wheel = 0;
    static int Horse = 0;
    static int Cloth = 0;
    static int Steering = 0;
    static int Shotgun= 0;
    static int Shotgun_ammo= 0;

    //outcomes
    static boolean StrangerMetup;
    static boolean WheelBroken;
    static boolean FabricBroken;
    static boolean clean;
    static boolean friendTeamup;
    static boolean noHealDisease;
    static int knowledge = 0;
    static boolean Hurt = false;

    //bank data
    static int MoneyFromBank = 0;
    static int Loans = 0;

    //random
    static Random r = new Random();


    public static void main(String [] args){

        if(START == false){
            OregonRoadDrawn DrawBegin = new OregonRoadDrawn();
            START = true;
        }
    }

    public static void DrawFirstPicture(){
        Customize FIRST = new Customize();
    }

    public static void JourneyStart(Object Season_choice, Object Food_choice, Object Money_choice){



        if(Season_choice.toString() == "summer(normal)"){
            difficulty = "normal";
        }
        if(Season_choice.toString() == "winter(hard)"){
            difficulty = "hard";
        }
        if(Season_choice.toString() == "spring(normal)"){
            difficulty = "normal";
        }
        if(Season_choice.toString() == "autumn(easy)"){
            difficulty = "easy";
        }
        if (Food_choice.toString() == "normal"){
            food = 300;
        }
        if (Food_choice.toString() == "to much"){
            food = 600;
        }
        if (Food_choice.toString() == "not enough"){
            food = 100;
        }
        if(Money_choice.toString() == "rich"){
            money = 500;
        }
        if(Money_choice.toString() == "poor"){
            money = 100;
        }
        if(Money_choice.toString() == "wealthy"){
            money = 300;
        }

        if(ShopsBeenAsked == false){
            ShopAsk SA = new ShopAsk(money, food, miles, days, difficulty);
            ShopsBeenAsked = true;

        }

    }

    public static void ShopAskAnswer(String choice) {

            if (choice.equals("yes")) {
                ShopItems SI = new ShopItems(money, food, miles, days, difficulty);
            }
            if (choice.equals("no")) {
                days = days + 1;
                TrailChoice TC = new TrailChoice(money, food, miles, days, difficulty);
            }
        }

        public static void ShopAskAnswer2(String choice){
                if (choice.equals("yes")) {
                    ShopItems SI = new ShopItems(money, food, miles, days, difficulty);
                }
                if (choice.equals("no")) {
                    days = days + 1;
                    check_days++;
                    Bank1 B1 = new Bank1(money, food, miles, days, difficulty);
                }
            }

    public static void ShopAskAnswer3(String choice){
        if (choice.equals("yes")) {
            ShopItems SI = new ShopItems(money, food, miles, days, difficulty);
        }
        if (choice.equals("no")) {
            days = days + 1;
            check_days++;
            StopPoint3 SP3 = new StopPoint3(money, food, miles, days, difficulty);
        }
    }
    public static void ShopItemsAnswer(int i, int choice){

        if(choice == 1){
            Ammo_Guns SI = new Ammo_Guns(money, food, miles, days, difficulty);
        }
        if(choice == 2){
            Food TC = new Food(money, food, miles, days, difficulty);
        }
        if(choice == 3){
            Medicine SI = new Medicine(money, food, miles, days, difficulty);
        }
        if(choice == 4){
            WagonParts TC = new WagonParts(money, food, miles, days, difficulty);
        }

    }

    public static void ShopItemBought(int choice, int Descison){
        if(Descison == 1){ // ammo / gun
            if(choice == 1){
                Shotgun++;
                money = money - 40;
            }
            else if(choice == 2){
                Shotgun_ammo = Shotgun_ammo + 20;
                money = money - 25;
            }
            else if(choice == 3){
                Shotgun_ammo = Shotgun_ammo + 15;
                money = money - 20;
            }
            else if(choice == 4){
                Shotgun_ammo = Shotgun_ammo + 30;
                money = money - 30;
            }
        }
        else if(Descison == 2){ // food
            if(choice == 1){
                food = food + 50;
                money = money - 20;
            }
            else if(choice == 2){
                food = food + 125;
                money = money - 50;
            }
            else if(choice == 3){
                food = food + 100;
                money = money - 40;
            }
            else if(choice == 4){
                food = food + 150;
                money = money - 75;
            }
        }
        else if(Descison == 3){ // medicine
            if(choice == 1){
                BandagesMed = BandagesMed + 5;
                money = money - 10;
            }
            else if(choice == 2){
                MeaslesMed++;
                money = money - 20;
            }
            else if(choice == 3){
                DissentrayMed++;
                money = money - 20;
            }
            else if(choice == 4){
                FluMed++;
                money = money - 20;
            }
        }
        else if(Descison == 4){ // wagon parts
            if(choice == 1){
                Wheel++;
                money = money - 25;
            }
            else if(choice == 2){
                Horse++;
                money = money - 50;
            }
            else if(choice == 3){
                Cloth++;
                money = money - 75;
            }
            else if(choice == 4){
                Steering++;
                money = money - 35;
            }
        }
        if(SetTrailGetResults2 == true){
            ShopAsk3 SA3 = new ShopAsk3(money, food, miles, days, difficulty);
        }
        else if(SetTrailGetResults == true){
            ShopAsk2 SA2 = new ShopAsk2(money, food, miles, days, difficulty);
        }else {
            ShopAsk SA = new ShopAsk(money, food, miles, days, difficulty);
        }
    }

    public static void CallSubClassWagon(){
        InsideWagonStuff IWS = new InsideWagonStuff(BandagesMed, MeaslesMed, DissentrayMed, FluMed,
                Wheel, Horse, Cloth, Steering,
                Shotgun, Shotgun_ammo);

    }
    public static void CallSubClassMap(){
        Map M = new Map(MapData, LRT1);

    }

    public static void CallSubClassPlayer(){
        MainPlayerInfo M = new MainPlayerInfo();

    }

    public static void GetResult(int choice, int TrailChoice) {
        ResultCall = ResultCall + 1;
        String info = "";
        if (TrailChoice == 1) {
            if (ResultCall == 1) {
                if (choice == 1) {
                    info = "you successfully cross the river."; //200
                    LRT1 = 1;
                    Result1 R1 = new Result1(info, 1);
                    MapData = 11;
                }
//                else if (choice == 2) {
//                    info = "you continue but finding another bridge takes a while."; //100
//                    Result2 R2 = new Result2(info);
//                    MapData = 12;
//                }
            } else if (ResultCall == 2) {

                if (choice == 1) {
                    info = "He takes the change and walks away, clearly disappointed.";
                    Result1 R1 = new Result1(info, 1);
                    money = money - 10;
                    StrangerMetup = false;
                    MapData = 21;
                } else if (choice == 2) {
                    info = "He takes the money, thankfully.";
                    money = money - 40;
                    Result2 R2 = new Result2(info, 1);
                    StrangerMetup = true;
                    MapData = 22;
                } else if (choice == 3) {
                    info = "He takes the money, surprised at your generosity.";
                    Result1 R3 = new Result1(info, 1);
                    money = money - 70;
                    StrangerMetup = true;
                    MapData = 23;
                } else if (choice == 4) {
                    info = "He steps back and turns around, mad, he'll remember this";
                    Result2 R4 = new Result2(info, 1);
                    StrangerMetup = false;
                    MapData = 24;
                }
            } else if (ResultCall == 3) {
                if (choice == 1) {
                    info = "You stop for a little while";
                    Result1 R1 = new Result1(info, 1);
                    MapData = 31;
                } else if (choice == 2) {
                    info = "You enjoy the view";
                    Result2 R2 = new Result2(info, 1);
                    MapData = 32;
                } else if (choice == 3) {
                    info = "you continue on your way";
                    Result1 R3 = new Result1(info, 1);
                    MapData = 33;

                }
            } else if (ResultCall == 4) {
                if (choice == 1) {
                    if (CheckFlu() == 1) {
                        info = "you successfully heal the flu";
                        noHealDisease = false;
                        Result1 R1 = new Result1(info, 1);

                    } else if (CheckFlu() == 2) {
                        info = "you don't have a flu med and so he dies";
                        noHealDisease = true;
                        Result1 R1 = new Result1(info, 1);


                    }
                    MapData = 41;
                } else if (choice == 2) {
                    int RandChoice = r.nextInt(2);
                    System.out.println(RandChoice);
                    if (RandChoice == 0) {
                        info = "you ignore it and it heals itself";
                        noHealDisease = true;
                        Result2 R2 = new Result2(info, 1);
                    } else if (RandChoice == 1) {
                        info = "you ignore it and someone dies";
                        noHealDisease = true;
                        Result2 R2 = new Result2(info, 1);
                    }
                    MapData = 42;
                }
            } else if (ResultCall == 5) {
                if (choice == 1) {
                    if (CheckWheel() == 1) {
                        info = "you successfully fix the wheel";
                        WheelBroken = false;
                        Result1 R1 = new Result1(info, 1);
                    } else if (CheckWheel() == 2) {
                        info = "you don't have a wheel";
                        WheelBroken = true;
                        Result1 R1 = new Result1(info, 1);
                    }
                    MapData = 51;
                } else if (choice == 2) {
                    info = "you ignore it";
                    WheelBroken = true;
                    Result2 R2 = new Result2(info, 1);
                    MapData = 52;
                }
            } else if (ResultCall == 6) {
                if (choice == 1) {
                    info = "You stop to bathe in it";
                    clean = true;
                    Result1 R1 = new Result1(info, 1);
                    MapData = 61;
                } else if (choice == 2) {
                    info = "You ignore it";
                    clean = false;
                    Result2 R2 = new Result2(info, 1);
                    MapData = 62;
                } else if (choice == 3) {
                    info = "you look at it";
                    clean = false;
                    Result3 R3 = new Result3(info, 1);
                    MapData = 63;
                }
            } else if (ResultCall == 7) {
                if (choice == 1) {
                    if (CheckFoodStuff() == 1) {
                        info = "You get as much as you can carry";
                        food = food + 300;
                        Result1 R1 = new Result1(info, 1);
                        MapData = 71;
                    } else if (CheckFoodStuff() == 2) {
                        food = food + 150;
                        info = "You don't have enough bullets to get al the food but you get some";
                        Result1 R1 = new Result1(info, 1);
                        MapData = 71;
                    } else if (CheckFoodStuff() == 3) {
                        info = "you don't have any bullets to get food";
                        Result1 R1 = new Result1(info, 1);
                        MapData = 71;
                    } else if (CheckFoodStuff() == 4) {
                        info = "you don't have a gun to get the food";
                        Result2 R2 = new Result2(info, 1);
                        MapData = 71;
                    }

                } else if (choice == 2) {
                    if (CheckFoodStuff() == 1) {
                        food = food + 300;
                        info = "You were able to carry more then you expected";
                        Result1 R1 = new Result1(info, 1);
                        MapData = 72;
                    } else if (CheckFoodStuff() == 2) {
                        food = food + 150;
                        info = "You get as much as food as you can carry";
                        Result2 R2 = new Result2(info, 1);
                        MapData = 72;
                    } else if (CheckFoodStuff() == 3) {
                        info = "you don't have any bullets to get food";
                        Result2 R2 = new Result2(info, 1);
                        MapData = 72;
                    } else if (CheckFoodStuff() == 4) {
                        info = "you don't have a gun to get the food";
                        Result2 R2 = new Result2(info, 1);
                        MapData = 72;
                    }

                } else if (choice == 3) {
                    info = "you ignore it";
                    Result3 R3 = new Result3(info, 1);
                    MapData = 73;

                } else if (choice == 4) {
                    int RandChoice = r.nextInt(2);
                    if (RandChoice == 0) {
                        info = "he says yes and brings you back food. you just made a friend";
                        food = food + 100;
                        Result4 R4 = new Result4(info, 1);
                        MapData = 74;
                    } else if (RandChoice == 1) {
                        if (CheckFoodStuff() == 1) {
                            info = "He says no so you go anyway and get lots of food";
                            food = food + 300;
                            Result4 R4 = new Result4(info, 1);
                            MapData = 72;
                        } else if (CheckFoodStuff() == 2) {
                            food = food + 150;
                            info = "He says no so you go get as much food as you can";
                            Result4 R4 = new Result4(info, 1);
                            MapData = 72;
                        } else if (CheckFoodStuff() == 3) {
                            info = "he says no and so you leave";
                            Result4 R4 = new Result4(info, 1);
                            MapData = 72;
                        } else if (CheckFoodStuff() == 4) {
                            info = "he says no and so you leave";
                            Result4 R4 = new Result4(info, 1);
                            MapData = 72;
                        }
                    }
                }

                ResultCall = 0;
            }
        } else if (TrailChoice == 2) {
            check_days = 8;

            if (ResultCall == 1) {
                info = "you continue but finding another bridge takes a while."; //100
                LRT1 = 2;
                Result2 R2 = new Result2(info, 1);
                MapData = 12;
            }
            if (ResultCall == 2) {
                check_days = 9;
                if (choice == 1) {
                    info = "you team up with him, and you share each others stuff";
                    DissentrayMed++;
                    money = money + 250;
                    Wheel++;
                    Horse++;
                    food = food + 300;
                    FluMed++;
                    Shotgun++;
                    Shotgun_ammo = Shotgun_ammo + 20;
                    friendTeamup = true;
                    MapData = 21;
                    Result1 R1 = new Result1(info, 1);
                } else if (choice == 2) {
                    friendTeamup = false;
                    info = "you say hi and have a little chat. He will remember that";
                    MapData = 22;
                    Result2 R2 = new Result2(info, 1);
                } else if (choice == 3) {
                    info = "you ignore him and go on your way";
                    friendTeamup = false;
                    MapData = 23;
                    Result3 R3 = new Result3(info, 1);
                }

            }
            if (ResultCall == 3) {
                check_days = 10;
                if (choice == 1) {
                    info = "You stop to bathe in it";
                    clean = true;
                    MapData = 31;
                    Result1 R1 = new Result1(info, 1);
                } else if (choice == 2) {
                    info = "You ignore it";
                    clean = false;
                    MapData = 32;
                    Result2 R2 = new Result2(info, 1);
                } else if (choice == 3) {
                    info = "you look at it";
                    clean = false;
                    MapData = 33;
                    Result3 R3 = new Result3(info, 1);
                }
            }
            if (ResultCall == 4) {
                check_days = 11;
                if (choice == 1) {
                    if (CheckFlu() == 1) {
                        info = "you successfully heal the flu";
                        MapData = 41;
                        noHealDisease = false;
                        Result1 R1 = new Result1(info, 1);

                    } else if (CheckFlu() == 2) {
                        info = "you don't have a flu med and so he dies";
                        MapData = 41;
                        noHealDisease = true;
                        Result1 R1 = new Result1(info, 1);

                    }
                } else if (choice == 2) {
                    int RandChoice = r.nextInt(2);
                    System.out.println(RandChoice);
                    if (RandChoice == 0) {
                        info = "you ignore it and it heals itself";
                        MapData = 42;
                        noHealDisease = true;
                        Result2 R2 = new Result2(info, 1);
                    } else if (RandChoice == 1) {
                        info = "you ignore it and someone dies";
                        MapData = 42;
                        noHealDisease = true;
                        Result2 R2 = new Result2(info, 1);
                    }
                }
            }
            if (ResultCall == 5) {
                check_days = 12;
                if (choice == 1) {
                    if (CheckWheel() == 1) {
                        info = "you successfully fix the wheel";
                        WheelBroken = false;
                        MapData = 51;
                        Result1 R1 = new Result1(info, 1);
                    } else if (CheckWheel() == 2) {
                        info = "you don't have a wheel";
                        WheelBroken = true;
                        MapData = 51;
                        Result1 R1 = new Result1(info, 1);

                    }
                } else if (choice == 2) {
                    WheelBroken = true;
                    info = "you ignore it";
                    MapData = 52;
                    Result2 R2 = new Result2(info, 1);
                }
            }
            if (ResultCall == 6) {
                check_days = 13;
                if (choice == 1) {
                    if (CheckFoodStuff() == 1) {
                        info = "You get as much as you can carry";
                        food = food + 300;
                        MapData = 61;
                        Result1 R1 = new Result1(info, 1);
                    } else if (CheckFoodStuff() == 2) {
                        food = food + 150;
                        info = "You don't have enough bullets to get al the food but you get some";
                        MapData = 61;
                        Result1 R1 = new Result1(info, 1);
                    } else if (CheckFoodStuff() == 3) {
                        info = "you don't have any bullets to get food";
                        MapData = 61;
                        Result1 R1 = new Result1(info, 1);
                    } else if (CheckFoodStuff() == 4) {
                        info = "you don't have a gun to get the food";
                        MapData = 61;
                        Result2 R2 = new Result2(info, 1);
                    }

                } else if (choice == 2) {
                    if (CheckFoodStuff() == 1) {
                        food = food + 300;
                        info = "You were able to carry more then you expected";
                        MapData = 62;
                        Result1 R1 = new Result1(info, 1);
                    } else if (CheckFoodStuff() == 2) {
                        food = food + 150;
                        info = "You get as much as food as you can carry";
                        MapData = 62;
                        Result2 R2 = new Result2(info, 1);
                    } else if (CheckFoodStuff() == 3) {
                        info = "you don't have any bullets to get food";
                        MapData = 62;
                        Result2 R2 = new Result2(info, 1);
                    } else if (CheckFoodStuff() == 4) {
                        info = "you don't have a gun to get the food";
                        MapData = 62;
                        Result2 R2 = new Result2(info, 1);
                    }

                } else if (choice == 3) {
                    info = "you ignore it";
                    MapData = 63;
                    Result3 R3 = new Result3(info, 1);

                } else if (choice == 4) {
                    int RandChoice = r.nextInt(2);
                    if (RandChoice == 0) {
                        food = food + 100;
                        info = "he says yes and brings you back food. you just made a friend";
                        Result4 R4 = new Result4(info, 1);
                    } else if (RandChoice == 1) {
                        if (CheckFoodStuff() == 1) {
                            info = "He says no so you go anyway and get lots of food";
                            food = food + 300;
                            Result4 R4 = new Result4(info, 1);
                        } else if (CheckFoodStuff() == 2) {
                            info = "He says no so you go get as much food as you can";
                            food = food + 150;
                            Result4 R4 = new Result4(info, 1);
                        } else if (CheckFoodStuff() == 3) {
                            info = "he says no and so you leave";
                            Result4 R4 = new Result4(info, 1);
                        } else if (CheckFoodStuff() == 4) {
                            info = "he says no and so you leave";
                            Result4 R4 = new Result4(info, 1);
                        }
                    }
                    MapData = 64;
                }
                ResultCall = 0;
            }
        }
    }

        public static void GetResultSetTrail(int choice){
            String info = "";
            ResultCall++;
            System.out.println("New Trail " + ResultCall);

                if (ResultCall == 1) {
                    if (choice == 1) {
                        if(StrangerMetup == true){
                            info = "the stranger that you met at the beginning comes by and helps you fight them and you stop them all";
                            Result1 R1 = new Result1(info, 2);
                        }
                        else if(friendTeamup == true){
                            info = "your friend comes by your side and you successfully defend against the mugger";
                            Result1 R1 = new Result1(info, 2);
                        }
                        else if (CheckGunAndAmmo() == 1) {
                            if ((RandChance() == 1) || (RandChance() == 2)) {
                                info = "you kill one of the muggers and the rest of them run off";
                                knowledge++;
                                Result1 R1 = new Result1(info, 2);
                            } else {
                                info = "you try kil the muggers and you fail and they mug you.";
                                money = money / 2;
                                food = food / 2;
                                Hurt = true;
                                knowledge++;
                                Result1 R1 = new Result1(info, 2);
                            }

                        } else if (CheckGunAndAmmo() == 2) {
                            info = "you don't have any bullets and you get mugged";
                            money = money / 2;
                            food = food / 2;
                            Hurt = true;
                            Result1 R1 = new Result1(info, 2);
                        } else if (CheckGunAndAmmo() == 3) {
                            info = "you don't have a gun and you get mugged";
                            money = money / 2;
                            food = food / 2;
                            Hurt = true;
                            Result1 R1 = new Result1(info, 2);
                        }
                    } else if (choice == 2) {
                        if(StrangerMetup == true){
                            info = "the stranger that you met at the beginning comes by and helps you fight them and you stop them all";
                            Result1 R1 = new Result1(info, 2);
                        }
                        else if(friendTeamup == true){
                            info = "your friend comes by your side and you successfully defend against the mugger";
                            Result1 R1 = new Result1(info, 2);
                        }
                        else if (RandChance() == 1) {
                            info = "you successfully hide from them";
                            knowledge++;
                            Result2 R2 = new Result2(info, 2);
                        } else {
                            info = "you get caught and they mug you";
                            money = money / 2;
                            food = food / 2;
                            Hurt = true;
                            knowledge++;
                            Result2 R2 = new Result2(info, 2);
                        }
                    } else if (choice == 3) {
                        if(StrangerMetup == true){
                            info = "the stranger that you met at the beginning comes by and helps you fight them and you stop them all";
                            Result1 R1 = new Result1(info, 2);
                        }
                        else if(friendTeamup == true){
                            info = "your friend comes by your side and you successfully defend against the mugger";
                            Result1 R1 = new Result1(info, 2);
                        }
                        else if (RandChance() == 1) {
                            info = "you run faster then them and escape";
                            knowledge++;
                            Result3 R3 = new Result3(info, 2);
                        } else {
                            info = "you get caught running from them and they mug you";
                            money = money / 2;
                            food = food / 2;
                            Hurt = true;
                            knowledge++;
                            Result3 R3 = new Result3(info,2);
                        }
                    } else if (choice == 4) {
                        if(StrangerMetup == true){
                            info = "the stranger that you met at the beginning comes by and helps you fight them and you stop them all";
                            Result1 R1 = new Result1(info, 2);
                        }
                        else if(friendTeamup == true){
                            info = "your friend comes by your side and you successfully defend against the mugger";
                            Result1 R1 = new Result1(info, 2);
                        }else {
                            info = "they don't want to make peace and they steal your stuff and mug you";
                            money = money / 2;
                            food = food / 2;
                            Hurt = true;
                            knowledge++;
                            Result4 R4 = new Result4(info, 2);
                        }
                    }
                }

                if (ResultCall == 2) {
                    if (choice == 1) {
                        if (CheckCloth() == 1) {
                            info = "you successfully fix the cloth";
                            FabricBroken = false;
                            Result1 R1 = new Result1(info,2);
                        } else if (CheckCloth() == 2) {
                            info = "you don't have any cloth";
                            FabricBroken = true;
                            Result1 R1 = new Result1(info,2);

                        }
                    } else if (choice == 2) {
                        info = "you ignore it";
                        FabricBroken = true;
                        Result2 R2 = new Result2(info,2);
                    }
                }
                if (ResultCall == 3) {
                    System.out.println("thr bank class" + ResultCall);
                    if (choice == 1) {
                        BankClass BK = new BankClass(1, Loans);
                    } else if (choice == 2) {
                        BankClass BK = new BankClass(2, Loans);

                    } else if (choice == 3) {
                        info = "you leave the bank";
                        Result3 R3 = new Result3(info,2);
                    }

                }
                if (ResultCall == 4) {
                    if (choice == 1) {
                        check_days++;
                        if(clean == true){
                            info = "you successfully heal dissentary becasue you were clean";
                            Result1 R1 = new Result1(info,2);
                        }
                        else if (CheckDissentary() == 1) {
                            info = "you successfully heal dissentary";
                            Result1 R1 = new Result1(info,2);

                        } else if (CheckDissentary() == 2) {
                            info = "you don't have a dissentary med and so he dies";
                            Result1 R1 = new Result1(info,2);

                        }
                    }
                    else if (choice == 2) {
                        check_days++;
                        if(clean == true){
                            info = "you successfully heal dissentary becasue you were clean";
                            Result1 R1 = new Result1(info,2);
                        }else {
                            int RandChoice = r.nextInt(2);
                            System.out.println(RandChoice);
                            if (RandChoice == 0) {
                                info = "you ignore it and it heals itself";
                                Result2 R2 = new Result2(info, 2);
                            } else if (RandChoice == 1) {
                                info = "you ignore it and someone dies";
                                Result2 R2 = new Result2(info, 2);
                            }
                        }
                    }
                    clean = false;
                }
                if(ResultCall == 5){
                    if(choice == 1){
                        SellCategoryItemAsk SCIA = new SellCategoryItemAsk();
                    }
                    else if(choice == 2){
                        info = "you ignore it";
                        Result2 R2 = new Result2(info,2);
                    }
                }
                if(ResultCall == 6){
                    if(choice == 1){
                        info = "you go into the stop point for a while";
                        Result1 R1 = new Result1(info,2);
                    }
                    else if(choice == 2){
                        info = "you ignore it";
                        Result2 R2 = new Result2(info,2);
                    }
                }
                if(ResultCall == 7){
                    if(choice == 1){
                        info = "you go into the casino";
                        Result1 R1 = new Result1(info,2);
                    }
                    else if(choice == 2){
                        info = "you ignore it";
                        Result2 R2 = new Result2(info,2);
                    }
                }
                if(ResultCall == 8){
                    if(choice == 1){
                        info = "you go shower in the waterfall";
                        clean = true;
                        Result1 R1 = new Result1(info,2);
                    }
                    else if(choice == 2){
                        info = "you ignore it";
                        clean = false;
                        Result2 R2 = new Result2(info,2);
                    }
                }
                if(ResultCall == 9){
                    if(choice == 1){
                        BankClass2 B2 = new BankClass2(choice, Loans);
                    }
                    else if(choice == 2){
                        info = "you ignore it";
                        Result2 R2 = new Result2(info,2);
                    }
                }
            if (ResultCall == 10) {
                if (choice == 1) {
                    if(friendTeamup == false){
                        int RandInt = r.nextInt(2);
                        if(RandInt == 0){
                            info = "you see your friend but he doesn't help you. you get distracted and they mug you";
                            money = money / 2;
                            food = food / 2;
                            Hurt = true;
                            Result1 R1 = new Result1(info, 2);
                        }else{
                            info = "your friend comes by your side and you successfully defend against the mugger";
                            Result1 R1 = new Result1(info, 2);
                        }
                    }
                    else if (CheckGunAndAmmo() == 1) {
                        if ((RandChance() == 1) || (RandChance() == 2)) {
                            info = "you kill one of the muggers and the rest of them run off";
                            Result1 R1 = new Result1(info, 2);
                        } else {
                            info = "you try kill to one of the muggers and you fail and they kill one of you.";
                            money = money / 2;
                            food = food / 2;
                            Hurt = true;
                            Result1 R1 = new Result1(info, 2);
                        }

                    } else if (CheckGunAndAmmo() == 2) {
                        info = "you don't have any bullets and someone dies";
                        money = money / 2;
                        food = food / 2;
                        Hurt = true;
                        Result1 R1 = new Result1(info, 2);
                    } else if (CheckGunAndAmmo() == 3) {
                        info = "you don't have a gun and someone dies";
                        money = money / 2;
                        food = food / 2;
                        Hurt = true;
                        Result1 R1 = new Result1(info, 2);
                    }
                } else if (choice == 2) {
                    if(friendTeamup == false){
                        int RandInt = r.nextInt(2);
                        if(RandInt == 0){
                            info = "you see your friend but he doesn't help you. you get distracted and they mug you";
                            money = money / 2;
                            food = food / 2;
                            Hurt = true;
                            Result1 R1 = new Result1(info, 2);
                        }else{
                            info = "your friend comes by your side and you successfully defend against the mugger";
                            Result1 R1 = new Result1(info, 2);
                        }
                    }
                    else if (RandChance() == 1) {
                        info = "you successfully hide from them";
                        Result2 R2 = new Result2(info, 2);
                    } else {
                        info = "you get caught and they mug you";
                        money = money / 2;
                        food = food / 2;
                        Hurt = true;
                        Result2 R2 = new Result2(info, 2);
                    }
                } else if (choice == 3) {
                    if(friendTeamup == false){
                        int RandInt = r.nextInt(2);
                        if(RandInt == 0){
                            info = "you see your friend but he doesn't help you. you get distracted and they mug you";
                            money = money / 2;
                            food = food / 2;
                            Hurt = true;
                            Result1 R1 = new Result1(info, 2);
                        }else{
                            info = "your friend comes by your side and you successfully defend against the mugger";
                            Result1 R1 = new Result1(info, 2);
                        }
                    }
                    else if (RandChance() == 1) {
                        info = "you run faster then them and escape";
                        Result3 R3 = new Result3(info, 2);
                    } else {
                        info = "you get caught running from them and they mug you";
                        money = money / 2;
                        food = food / 2;
                        Hurt = true;
                        Result3 R3 = new Result3(info,2);
                    }
                }
                else if (choice == 4) {
                    if(friendTeamup == false){
                        int RandInt = r.nextInt(2);
                        if(RandInt == 0){
                            info = "you see your friend but he doesn't help you. you get distracted and they mug you";
                            money = money / 2;
                            food = food / 2;
                            Hurt = true;
                            Result1 R1 = new Result1(info, 2);
                        }else{
                            info = "your friend comes by your side and you successfully defend against the mugger";
                            Result1 R1 = new Result1(info, 2);
                        }
                    }else {
                        money = money / 2;
                        food = food / 2;
                        Hurt = true;
                        info = "they don't want to make peace and they steal your stuff and hurt you";
                        Result4 R4 = new Result4(info, 2);
                    }
                }
            }
            if (ResultCall == 11) {
                if (choice == 1) {
                    if(clean == true){
                        info = "you heal the measles becasue you were clean";
                        Result1 R1 = new Result1(info,2);
                    }
                    else if (CheckMeasels() == 1) {
                        info = "you successfully heal measles";
                        noHealDisease = false;
                        Result1 R1 = new Result1(info,2);

                    } else if (CheckMeasels() == 2) {
                        info = "you don't have a measels med and so he dies";
                        noHealDisease = true;
                        Result1 R1 = new Result1(info,2);
                    }
                }
                else if (choice == 2) {
                    if (clean == true) {
                        info = "you heal the measles because you were clean";
                        Result1 R1 = new Result1(info, 2);
                    } else {
                        int RandChoice = r.nextInt(2);
                        System.out.println(RandChoice);
                        if (RandChoice == 0) {
                            info = "you ignore it and it heals itself";
                            noHealDisease = true;
                            Result2 R2 = new Result2(info, 2);
                        } else if (RandChoice == 1) {
                            info = "you ignore it and someone dies";
                            noHealDisease = true;
                            Result2 R2 = new Result2(info, 2);
                        }
                    }
                }
            }
            if(ResultCall == 12){
                if(choice == 1){
                    info = "you go into the stop point for a while";
                    Result1 R1 = new Result1(info,2);
                }
                else if(choice == 2){
                    info = "you ignore it";
                    Result2 R2 = new Result2(info,2);
                }
            }

            if (ResultCall == 13) {
                if (choice == 1) {
                    if (CheckHorse() == 1) {
                        info = "you get another horse";
                        Result1 R1 = new Result1(info,2);
                    } else if (CheckHorse() == 2) {
                        info = "you don't have an extra horse";
                        Result1 R1 = new Result1(info,2);

                    }
                } else if (choice == 2) {
                    info = "you ignore it";
                    Result2 R2 = new Result2(info,2);
                }
            }
        }



    public static void CheckDay(){
        check_days = check_days + 1;

        while(StartTrail == 1) {
            if (check_days == 1) {
                days = days + 1;
                StrangerMeetUp SM = new StrangerMeetUp(money, food, miles, days, difficulty);
                break;
            } else if (check_days == 2) {
                days = days + 1;
                StopPoint SP = new StopPoint(money, food, miles, days, difficulty);
                break;
            } else if (check_days == 3) {
                days = days + 1;
                DiseaseOutBreak DOB = new DiseaseOutBreak(money, food, miles, days, difficulty);
                break;
            } else if (check_days == 4) {
                days = days + 1;
                BrokenPart BP = new BrokenPart(money, food, miles, days, difficulty);
                break;
            } else if (check_days == 5) {
                days = days + 1;
                WaterFall1 WF1 = new WaterFall1(money, food, miles, days, difficulty);
                break;
            } else if (check_days == 6) {
                days = days + 1;
                GettingFood GF = new GettingFood(money, food, miles, days, difficulty);
                break;
            }
            else if(check_days == 7){
                check_days = 0;
                CheckDaySetTrail();
                break;
            }
            //---------------------------------------------------------------------------------------------------------
            //this is the start of trail two
            //---------------------------------------------------------------------------------------------------------


            else if(check_days == 9){
                days = days + 1;
                FriendMeetUp FMP = new FriendMeetUp(money, food, miles, days, difficulty);
                break;
            }else if(check_days == 10){
                days = days + 1;
                WaterFall2 WF1 = new WaterFall2(money, food, miles, days, difficulty);
                break;
            }
            else if(check_days == 11){
                days = days + 1;
                DiseaseOutBreak2 DOS = new DiseaseOutBreak2(money, food, miles, days, difficulty);
                break;
            }
            else if(check_days == 12){
                days = days + 1;
                BrokenPart2 BP = new BrokenPart2(money, food, miles, days, difficulty);
                break;
            }
            else if(check_days == 13){
                days = days + 1;
                GettingFood2 GF = new GettingFood2(money, food, miles, days, difficulty);
                break;
            }
            else if(check_days == 14){
                check_days = 0;
                CheckDaySetTrail();
                break;
            }
        }
    }

    public static void CheckDaySetTrail(){
        check_days++;
        System.out.println("New Trail Set Trail " + ResultCall + " and chck days: " + check_days);
        if(check_days == 1){
            GunFight GF = new GunFight(money, food, miles, days, difficulty);
        }
        if(check_days == 2){
            BrokenPart3 GF = new BrokenPart3(money, food, miles, days, difficulty);
        }
        if(check_days == 3){
            SetTrailGetResults = true;
            ShopAsk2 GF = new ShopAsk2(money, food, miles, days, difficulty);
        }
        if(check_days == 4){
            Bank1 GF = new Bank1(money, food, miles, days, difficulty);
            System.out.println("Bank class sent in " + check_days);
        }
        if(check_days == 5){
            SetTrailGetResults = false;
            System.out.println("disease call " + check_days);
            ResultCall++;
            DiseaseOutbreak3 GF = new DiseaseOutbreak3(money, food, miles, days, difficulty);
        }
        if(check_days == 6){
            SellShop GF = new SellShop(money, food, miles, days, difficulty);
        }
        if(check_days == 7){
            StopPoint2 SP2 = new StopPoint2(money, food, miles, days, difficulty);
        }
        if(check_days == 8){
            Casino C = new Casino(money, food, miles, days, difficulty);
        }
        if(check_days == 9){
            ResultCall++;
            Waterfall3 SP2 = new Waterfall3(money, food, miles, days, difficulty);
        }
        if(check_days == 10){
            Bank2 SP2 = new Bank2(money, food, miles, days, difficulty);
        }
        if(check_days == 11){
            GunFight2 SP2 = new GunFight2(money, food, miles, days, difficulty);
        }
        if(check_days == 12){
            DiseaseOutbreak4 SP2 = new DiseaseOutbreak4(money, food, miles, days, difficulty);
        }
        if(check_days == 13){
            SetTrailGetResults2 = true;
            ShopAsk3 SA3 = new ShopAsk3(money, food, miles, days, difficulty);
        }
        if(check_days == 15){
            BrokenPart4 BP4 = new BrokenPart4(money, food, miles, days, difficulty);
        }
        if(check_days == 16){
            SetTrailGetResults2 = false;
            CheckDayFinalTrail();
            check_days = 0;
        }
    }

    public static void CheckDayFinalTrail(){
        System.out.println("last trail");
    }

    public static int CheckFlu(){
        if(FluMed > 0){
            FluMed = FluMed - 1;
            return 1;
        }
        else if(FluMed <= 0){
            return 2;
        }
        return 0;
    }

    public static int CheckMeasels(){
        if(MeaslesMed > 0){
            MeaslesMed = MeaslesMed - 1;
            return 1;
        }
        else if(MeaslesMed <= 0){
            return 2;
        }
        return 0;
    }

    private static int CheckDissentary() {
        if(DissentrayMed > 0){
            DissentrayMed = DissentrayMed - 1;
            return 1;
        }
        else if(DissentrayMed <= 0){
            return 2;
        }
        return 0;
    }



    private static int CheckWheel() {
        if(Wheel > 0){
            Wheel = Wheel - 1;
            return 1;
        }
        else if(Wheel <= 0){
            return 2;
        }

        return 0;
    }

    private static int CheckHorse() {
        if(Horse > 0){
            Horse = Horse - 1;
            return 1;
        }
        else if(Horse <= 0){
            return 2;
        }

        return 0;
    }

    private static int CheckCloth() {
        if(Cloth > 1){
            Cloth = Cloth - 2;
            return 1;
        }
        else if(Cloth <= 1){
            return 2;
        }

        return 0;
    }

    private static int CheckFoodStuff(){

        if(Shotgun > 0){
            if(Shotgun_ammo > 5){
                Shotgun_ammo = Shotgun_ammo - 5;
                food = food + 300;
                return 1;
            }
            else if(Shotgun_ammo > 0 && Shotgun_ammo < 5){
                Shotgun_ammo = Shotgun_ammo - Shotgun_ammo;
                food = food + 100;
                return 2;
            }
            else if(Shotgun_ammo <= 0){
                return 3;
            }
        }
        else if(Shotgun <= 0){
            return 4;
        }
        return 0;
    }

    private static int RandChance(){
        int RandInt = r.nextInt(4);
        if(RandInt == 0){
            return 1;
        }else if(RandInt == 1){
            return 2;
        }else if(RandInt == 2){
            return 3;
        }else if(RandInt == 3){
            return 4;
        }
        return 0;
    }

    private static int CheckGunAndAmmo(){

        if(Shotgun > 1){
            if(Shotgun_ammo > 0){
                return 1;
            }
            else if(Shotgun_ammo <= 0) {
                return 2;
            }
        }
        else if(Shotgun <= 0){
            return 3;
        }
        return 0;
    }

    public static void DoBankThings(int choice, int info){
        System.out.println(choice + " " + info);
        String stuff = "";
        if(choice == 2){
            Bank1 BK = new Bank1(money, food, miles, days, difficulty);
        }
        else if(choice == 1){
            if(info == 1){
                money = money + 50;
                Loans = Loans + 1;
                MoneyFromBank = MoneyFromBank + 50;
                stuff = "you gain " + MoneyFromBank + "$ from the bank and 1 Loan";
                Result6 R1 = new Result6(stuff, 2);
            }
            else if(info == 2){
                money = money + 100;
                Loans = Loans + 1;
                MoneyFromBank = MoneyFromBank + 100;
                stuff = "you gain " + MoneyFromBank + "$ from the bank and 1 Loan";
                Result6 R1 = new Result6(stuff, 2);
            }
            else if(info == 3){
                money = money + 200;
                Loans = Loans + 1;
                MoneyFromBank = MoneyFromBank + 200;
                stuff = "you gain " + MoneyFromBank + "$ from the bank and 1 Loan";
                Result6 R1 = new Result6(stuff, 2);
            }
            else if(info == 4){
                money = money + 250;
                Loans = Loans + 1;
                MoneyFromBank = MoneyFromBank + 250;
                stuff = "you gain " + MoneyFromBank + "$ from the bank and 1 Loan";
                Result6 R1 = new Result6(stuff,2);
            }
        }
        else if(choice == 3){
            if(info == 1){
                money = money - 50;
                MoneyFromBank = MoneyFromBank - 50;
                if(MoneyFromBank <= 0){
                    Loans = Loans - 1;
                }
                stuff = "you give back 50$ to the bank";
                Result6 R1 = new Result6(stuff,2);
            }
            else if(info == 2){
                money = money - 100;
                MoneyFromBank = MoneyFromBank - 100;
                if(MoneyFromBank <= 0){
                    Loans = Loans - 1;
                }
                stuff = "you give back 100$ to the bank";
                Result6 R1 = new Result6(stuff,2);
            }
            else if(info == 3){
                money = money - 200;
                MoneyFromBank = MoneyFromBank - 200;
                if(MoneyFromBank <= 0){
                    Loans = Loans - 1;
                }
                stuff = "you give back 200$ to the bank";
                Result6 R1 = new Result6(stuff,2);
            }
            else if(info == 4){
                money = money - 250;
                MoneyFromBank = MoneyFromBank - 250;
                if(MoneyFromBank <= 0){
                    Loans = Loans - 1;
                }
                stuff = "you give back 250$ to the bank";
                Result6 R1 = new Result6(stuff,2);
            }
        }
        ResultCall++;
    }

    public static void DoBankThings2(int choice, int info){
        System.out.println(choice + " " + info);
        String stuff = "";
        if(choice == 2){
            Bank2 BK2 = new Bank2(money, food, miles, days, difficulty);
        }
        else if(choice == 1){
            if(info == 1){
                money = money + 50;
                Loans = Loans + 1;
                MoneyFromBank = MoneyFromBank + 50;
                stuff = "you gain " + MoneyFromBank + "$ from the bank and 1 Loan";
                Result7 R1 = new Result7(stuff, 2);
            }
            else if(info == 2){
                money = money + 100;
                Loans = Loans + 1;
                MoneyFromBank = MoneyFromBank + 100;
                stuff = "you gain " + MoneyFromBank + "$ from the bank and 1 Loan";
                Result7 R1 = new Result7(stuff, 2);
            }
            else if(info == 3){
                money = money + 200;
                Loans = Loans + 1;
                MoneyFromBank = MoneyFromBank + 200;
                stuff = "you gain " + MoneyFromBank + "$ from the bank and 1 Loan";
                Result7 R1 = new Result7(stuff, 2);
            }
            else if(info == 4){
                money = money + 250;
                Loans = Loans + 1;
                MoneyFromBank = MoneyFromBank + 250;
                stuff = "you gain " + MoneyFromBank + "$ from the bank and 1 Loan";
                Result7 R1 = new Result7(stuff,2);
            }
        }
        else if(choice == 3){
            if(info == 1){
                money = money - 50;
                MoneyFromBank = MoneyFromBank - 50;
                if(MoneyFromBank <= 0){
                    Loans = Loans - 1;
                }
                stuff = "you give back 50$ to the bank";
                Result7 R1 = new Result7(stuff,2);
            }
            else if(info == 2){
                money = money - 100;
                MoneyFromBank = MoneyFromBank - 100;
                if(MoneyFromBank <= 0){
                    Loans = Loans - 1;
                }
                stuff = "you give back 100$ to the bank";
                Result7 R7 = new Result7(stuff,2);
            }
            else if(info == 3){
                money = money - 200;
                MoneyFromBank = MoneyFromBank - 200;
                if(MoneyFromBank <= 0){
                    Loans = Loans - 1;
                }
                stuff = "you give back 200$ to the bank";
                Result7 R1 = new Result7(stuff,2);
            }
            else if(info == 4){
                money = money - 250;
                MoneyFromBank = MoneyFromBank - 250;
                if(MoneyFromBank <= 0){
                    Loans = Loans - 1;
                }
                stuff = "you give back 250$ to the bank";
                Result7 R1 = new Result7(stuff,2);
            }
        }
        ResultCall++;
    }

    public static void CallBank1Class(){
        Bank1 B1 = new Bank1(money, food, miles, days, difficulty);
    }
    public static void CallBank2Class(){
        Bank2 B2 = new Bank2(money, food, miles, days, difficulty);
    }



    public static void CallBankClass1(int choice){
        String info = "";
        if (choice == 1) {
            BankClass BK = new BankClass(1, Loans);
        } else if (choice == 2) {
            BankClass BK = new BankClass(2, Loans);

        } else if (choice == 3) {
            info = "you leave the bank";
            Result3 R3 = new Result3(info,2);
        }
    }
    public static void CallBankClass2(int choice){
        String info = "";
        if (choice == 1) {
            BankClass2 BK2 = new BankClass2(1, Loans);
        } else if (choice == 2) {
            BankClass2 BK2 = new BankClass2(2, Loans);

        } else if (choice == 3) {
            info = "you leave the bank";
            Result3 R3 = new Result3(info,2);
        }
    }

    public static void CheckCategoryItemSellAsk(int choice){
        if(choice == 1){
            SellSpecificItemAsk SSIA = new SellSpecificItemAsk(1);
        }
        else if(choice == 2){
            SellSpecificItemAsk SSIA = new SellSpecificItemAsk(2);

        }
        else if(choice == 3){
            SellSpecificItemAsk SSIA = new SellSpecificItemAsk(3);

        }
        else if(choice == 4){
            SellSpecificItemAsk SSIA = new SellSpecificItemAsk(4);
        }
    }

    public static void GiveItem(String BoughtItem){
        switch (BoughtItem){
            case "wheel":
                Wheel--;
                money = money + 20;
                Result1 R1 = new Result1("you sold a wheel", 2);
                break;

            case "cloth":
                Cloth--;
                money = money + 5;
                Result1 R = new Result1("you sold some cloth", 2);
                break;

            case "horse":
                Horse--;
                money = money + 40;
                Result1 R11 = new Result1("you sold a horse",2 );
                break;

            case "steering":
                Steering--;
                money = money + 10;
                Result1 R12 = new Result1("you sold a steering wheel",2);
                break;



            case "flu":
                FluMed--;
                money = money + 20;
                Result2 R2 = new Result2("you sold a flu med",2);
                break;
            case "measels":
                MeaslesMed--;
                money = money + 25;
                Result2 R22 = new Result2("you sold a measles med",2);
                break;
            case "bandages":
                BandagesMed--;
                money = money + 2;
                Result2 R122 = new Result2("you sold a bandage",2);
                break;
            case "dissentary":
                DissentrayMed--;
                money = money + 25;
                Result2 R21 = new Result2("you sold a dissenatry med",2);
                break;


            case "50 food":
                food = food - 50;
                money = money + 5;
                Result3 R32 = new Result3("you sold 50 food",2);
                break;
            case "100 food":
                food = food - 100;
                money = money + 10;
                Result3 R31 = new Result3("you sold 100 food",2);
                break;
            case "200 food":
                food = food - 200;
                money = money + 15;
                Result3 R33 = new Result3("you sold 200 food",2);
                break;
            case "250 food":
                food = food - 250;
                money = money + 20;
                Result3 R3 = new Result3("you sold 250 food",2);
                break;


            case "shotgun":
                Shotgun--;
                money = money + 60;
                Result4 R4 = new Result4("you sold a shotgun",2);
                break;
            case "5 Shotgun ammo":
                Shotgun_ammo = Shotgun_ammo - 5;
                money = money + 7;
                Result4 R42 = new Result4("you sold 5 Shotgun ammo",2);
                break;
            case "10 Shotgun ammo":
                Shotgun_ammo = Shotgun_ammo - 10;
                money = money + 15;
                Result4 R41 = new Result4("you sold 10 Shotgun ammo",2);
                break;
            case "20 Shotgun ammo":
                Shotgun_ammo = Shotgun_ammo - 20;
                money = money + 30;
                Result4 R44 = new Result4("you sold 20 Shotgun ammo",2);
                break;
        }
    }
}