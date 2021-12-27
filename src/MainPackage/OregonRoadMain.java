package MainPackage;

import MainTrail.SetTrail.DayEight.GunFight;
import MainTrail.SetTrail.DayElleven.Bank1;
import MainTrail.SetTrail.DayElleven.BankClass;
import MainTrail.SetTrail.DayNine.BrokenPart3;
import MainTrail.SetTrail.DayTen.ShopAsk2;
import MainTrail.SetTrail.DayThirteen.SellCategoryItemAsk;
import MainTrail.SetTrail.DayThirteen.SellShop;
import MainTrail.SetTrail.DayThirteen.SellSpecificItemAsk;
import MainTrail.SetTrail.DayTwelve.DiseaseOutbreak3;
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
import MainTrail.StartTrail.TrailTwo.DayThree.WaterFall12;
import MainTrail.StartTrail.TrailTwo.DayTwo.FriendMeetUp;
import ShopAsking.*;
import ShopAsking.ShopItemsSpecific.*;
import SubClasses.InsideWagon.InsideWagonStuff;
import SubClasses.MainPlayer.MainPlayerInfo;
import SubClasses.Results.*;
import SubClasses.map.Map;

import java.util.Random;
import java.util.concurrent.Callable;


public class OregonRoadMain {

    static boolean START = false;
    static String difficulty = "";
    static int money = 0;
    static int food = 0;
    static int miles = 2000;
    static int days = 0;
    static boolean ShopsBeenAsked = false;
    static int MapData = 0;
    static int LRT1 = 0;
    static int ShopAsk = 0;
    static int ShopAskA = 0;


    static int ResultCall = 0;

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
    static int check_days = 0;
    static int StartTrail = 1;

    static int MoneyFromBank = 250;
    static int Loans = 1;

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

    public static void ShopAskAnswer(String choice){

        if(ShopAsk == 0) {
            if (choice.equals("yes")) {
                ShopItems SI = new ShopItems(money, food, miles, days, difficulty);
            }
            if (choice.equals("no")) {
                days = days + 1;
                TrailChoice TC = new TrailChoice(money, food, miles, days, difficulty);
                ShopAsk++;
            }
        }
        else if(ShopAsk == 1){
            if (choice.equals("yes")) {
                ShopItems SI = new ShopItems(money, food, miles, days, difficulty);
            }
            if(choice.equals("no")){
                days = days + 1;
                Bank1 B1 = new Bank1(money, food, miles, days, difficulty);
                ShopAsk++;
            }
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
                    Result1 R1 = new Result1(info,1);
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
                    Result1 R1 = new Result1(info,1);
                    MapData = 21;
                } else if (choice == 2) {
                    info = "He takes the money, thankfully.";
                    Result2 R2 = new Result2(info,1);
                    MapData = 22;
                } else if (choice == 3) {
                    info = "He takes the money, surprised at your generosity.";
                    Result1 R3 = new Result1(info,1);
                    MapData = 23;
                } else if (choice == 4) {
                    info = "He steps back and turns around, mad, he'll remember this";
                    Result2 R4 = new Result2(info,1);
                    MapData = 24;
                }
            } else if (ResultCall == 3) {
                if (choice == 1) {
                    info = "You stop for a little while";
                    Result1 R1 = new Result1(info,1);
                    MapData = 31;
                } else if (choice == 2) {
                    info = "You enjoy the view";
                    Result2 R2 = new Result2(info,1);
                    MapData = 32;
                } else if (choice == 3) {
                    info = "you continue on your way";
                    Result1 R3 = new Result1(info,1);
                    MapData = 33;

                }
            } else if (ResultCall == 4) {
                if (choice == 1) {
                    if (CheckFlu() == 1) {
                        info = "you successfully heal the flu";
                        Result1 R1 = new Result1(info,1);

                    } else if (CheckFlu() == 2) {
                        info = "you don't have a flu med and so he dies";
                        Result1 R1 = new Result1(info,1);


                    }
                    MapData = 41;
                } else if (choice == 2) {
                    int RandChoice = r.nextInt(2);
                    System.out.println(RandChoice);
                    if (RandChoice == 0) {
                        info = "you ignore it and it heals itself";
                        Result2 R2 = new Result2(info,1);
                    } else if (RandChoice == 1) {
                        info = "you ignore it and someone dies";
                        Result2 R2 = new Result2(info,1);
                    }
                    MapData = 42;
                }
            } else if (ResultCall == 5) {
                if (choice == 1) {
                    if (CheckWheel() == 1) {
                        info = "you successfully fix the wheel";
                        Result1 R1 = new Result1(info,1);
                    } else if (CheckWheel() == 2) {
                        info = "you don't have a wheel";
                        Result1 R1 = new Result1(info,1);

                    }
                    MapData = 51;
                } else if (choice == 2) {
                    info = "you ignore it";
                    Result2 R2 = new Result2(info,1);
                    MapData = 52;
                }
            } else if (ResultCall == 6) {
                if (choice == 1) {
                    info = "You stop to bathe in it";
                    Result1 R1 = new Result1(info,1);
                    MapData = 61;
                } else if (choice == 2) {
                    info = "You ignore it";
                    Result2 R2 = new Result2(info,1);
                    MapData = 62;
                } else if (choice == 3) {
                    info = "you look at it";
                    Result3 R3 = new Result3(info,1);
                    MapData = 63;
                }
            } else if (ResultCall == 7) {
                if (choice == 1) {
                    if (CheckFoodStuff() == 1) {
                        info = "You get as much as you can carry";
                        Result1 R1 = new Result1(info,1);
                        MapData = 71;
                    } else if (CheckFoodStuff() == 2) {
                        info = "You don't have enough bullets to get al the food but you get some";
                        Result1 R1 = new Result1(info,1);
                        MapData = 71;
                    } else if (CheckFoodStuff() == 3) {
                        info = "you don't have any bullets to get food";
                        Result1 R1 = new Result1(info,1);
                        MapData = 71;
                    } else if (CheckFoodStuff() == 4) {
                        info = "you don't have a gun to get the food";
                        Result2 R2 = new Result2(info,1);
                        MapData = 71;
                    }

                } else if (choice == 2) {
                    if (CheckFoodStuff() == 1) {
                        info = "You were able to carry more then you expected";
                        Result1 R1 = new Result1(info,1);
                        MapData = 72;
                    } else if (CheckFoodStuff() == 2) {
                        info = "You get as much as food as you can carry";
                        Result2 R2 = new Result2(info,1);
                        MapData = 72;
                    } else if (CheckFoodStuff() == 3) {
                        info = "you don't have any bullets to get food";
                        Result2 R2 = new Result2(info,1);
                        MapData = 72;
                    } else if (CheckFoodStuff() == 4) {
                        info = "you don't have a gun to get the food";
                        Result2 R2 = new Result2(info,1);
                        MapData = 72;
                    }

                } else if (choice == 3) {
                    info = "you ignore it";
                    Result3 R3 = new Result3(info,1);
                    MapData = 73;

                } else if (choice == 4) {
                    int RandChoice = r.nextInt(2);
                    if (RandChoice == 0) {
                        info = "he says yes and brings you back food. you just made a friend";
                        Result4 R4 = new Result4(info,1);
                        MapData = 74;
                    } else if (RandChoice == 1) {
                        if (CheckFoodStuff() == 1) {
                            info = "He says no so you go anyway and get lots of food";
                            Result4 R4 = new Result4(info,1);
                            MapData = 72;
                        } else if (CheckFoodStuff() == 2) {
                            info = "He says no so you go get as much food as you can";
                            Result4 R4 = new Result4(info,1);
                            MapData = 72;
                        } else if (CheckFoodStuff() == 3) {
                            info = "he says no and so you leave";
                            Result4 R4 = new Result4(info,1);
                            MapData = 72;
                        } else if (CheckFoodStuff() == 4) {
                            info = "he says no and so you leave";
                            Result4 R4 = new Result4(info,1);
                            MapData = 72;
                        }
                    }
                }

                ResultCall = 7;
            }
        } else if (TrailChoice == 2) {
            check_days = 8;

            if (ResultCall == 1) {
                System.out.println("dumb");
                info = "you continue but finding another bridge takes a while."; //100
                LRT1 = 2;
                Result2 R2 = new Result2(info,1);
                MapData = 12;
            }
            if (ResultCall == 2) {
                check_days = 9;
                if (choice == 1) {
                    info = "you team up with him, and you share each others stuff";
                    MapData = 21;
                    Result1 R1 = new Result1(info,1);
                } else if (choice == 2) {
                    info = "you say hi and have  a little chat. He will remember that";
                    MapData = 22;
                    Result2 R2 = new Result2(info,1);
                } else if (choice == 3) {
                    info = "you ignore him and go on your way";
                    MapData = 23;
                    Result3 R3 = new Result3(info,1);
                }

            }
            if (ResultCall == 3) {
                check_days = 10;

                if (choice == 1) {
                    info = "You stop to bathe in it";
                    MapData = 31;
                    Result1 R1 = new Result1(info,1);
                } else if (choice == 2) {
                    info = "You ignore it";
                    MapData = 32;
                    Result2 R2 = new Result2(info,1);
                } else if (choice == 3) {
                    info = "you look at it";
                    MapData = 33;
                    Result3 R3 = new Result3(info,1);
                }
            }
            if (ResultCall == 4) {
                check_days = 11;
                if (choice == 1) {
                    if (CheckFlu() == 1) {
                        info = "you successfully heal the flu";
                        MapData = 41;
                        Result1 R1 = new Result1(info,1);

                    } else if (CheckFlu() == 2) {
                        info = "you don't have a flu med and so he dies";
                        MapData = 41;
                        Result1 R1 = new Result1(info,1);

                    }
                } else if (choice == 2) {
                    int RandChoice = r.nextInt(2);
                    System.out.println(RandChoice);
                    if (RandChoice == 0) {
                        info = "you ignore it and it heals itself";
                        MapData = 42;
                        Result2 R2 = new Result2(info,1);
                    } else if (RandChoice == 1) {
                        info = "you ignore it and someone dies";
                        MapData = 42;
                        Result2 R2 = new Result2(info,1);
                    }
                }
            }
            if (ResultCall == 5) {
                check_days = 12;
                if (choice == 1) {
                    if (CheckWheel() == 1) {
                        info = "you successfully fix the wheel";
                        MapData = 51;
                        Result1 R1 = new Result1(info,1);
                    } else if (CheckWheel() == 2) {
                        info = "you don't have a wheel";
                        MapData = 51;
                        Result1 R1 = new Result1(info,1);

                    }
                } else if (choice == 2) {
                    info = "you ignore it";
                    MapData = 52;
                    Result2 R2 = new Result2(info,1);
                }
            }
            if (ResultCall == 6) {
                check_days = 13;
                if (choice == 1) {
                    if (CheckFoodStuff() == 1) {
                        info = "You get as much as you can carry";
                        MapData = 61;
                        Result1 R1 = new Result1(info,1);
                    } else if (CheckFoodStuff() == 2) {
                        info = "You don't have enough bullets to get al the food but you get some";
                        MapData = 61;
                        Result1 R1 = new Result1(info,1);
                    } else if (CheckFoodStuff() == 3) {
                        info = "you don't have any bullets to get food";
                        MapData = 61;
                        Result1 R1 = new Result1(info,1);
                    } else if (CheckFoodStuff() == 4) {
                        info = "you don't have a gun to get the food";
                        MapData = 61;
                        Result2 R2 = new Result2(info,1);
                    }

                } else if (choice == 2) {
                    if (CheckFoodStuff() == 1) {
                        info = "You were able to carry more then you expected";
                        MapData = 62;
                        Result1 R1 = new Result1(info,1);
                    } else if (CheckFoodStuff() == 2) {
                        info = "You get as much as food as you can carry";
                        MapData = 62;
                        Result2 R2 = new Result2(info,1);
                    } else if (CheckFoodStuff() == 3) {
                        info = "you don't have any bullets to get food";
                        MapData = 62;
                        Result2 R2 = new Result2(info,1);
                    } else if (CheckFoodStuff() == 4) {
                        info = "you don't have a gun to get the food";
                        MapData = 62;
                        Result2 R2 = new Result2(info,1);
                    }

                } else if (choice == 3) {
                    info = "you ignore it";
                    MapData = 63;
                    Result3 R3 = new Result3(info,1);

                } else if (choice == 4) {
                    int RandChoice = r.nextInt(2);
                    if (RandChoice == 0) {
                        info = "he says yes and brings you back food. you just made a friend";
                        Result4 R4 = new Result4(info,1);
                    } else if (RandChoice == 1) {
                        if (CheckFoodStuff() == 1) {
                            info = "He says no so you go anyway and get lots of food";
                            Result4 R4 = new Result4(info,1);
                        } else if (CheckFoodStuff() == 2) {
                            info = "He says no so you go get as much food as you can";
                            Result4 R4 = new Result4(info,1);
                        } else if (CheckFoodStuff() == 3) {
                            info = "he says no and so you leave";
                            Result4 R4 = new Result4(info,1);
                        } else if (CheckFoodStuff() == 4) {
                            info = "he says no and so you leave";
                            Result4 R4 = new Result4(info,1);
                        }
                    }
                    MapData = 64;
                }
                ResultCall = 7;
            }
        }

        //might make a new class here

        if (TrailChoice == 3) {
            if (ResultCall == 8) {
                if (choice == 1) {
                    if (CheckGunAndAmmo() == 1) {
                        if ((RandChance() == 1) || (RandChance() == 2)) {
                            info = "you kill one of the muggers and the rest of them run off";
                            Result1 R1 = new Result1(info, 2);
                        } else {
                            info = "you try kill to one of the muggers and you fail and they kill one of you.";
                            Result1 R1 = new Result1(info, 2);
                        }

                    } else if (CheckGunAndAmmo() == 2) {
                        info = "you don't have any bullets and someone dies";
                        Result1 R1 = new Result1(info, 2);
                    } else if (CheckGunAndAmmo() == 3) {
                        info = "you don't have a gun and someone dies";
                        Result1 R1 = new Result1(info, 2);
                    }
                } else if (choice == 2) {
                    if (RandChance() == 1) {
                        info = "you successfully hide from them";
                        Result2 R2 = new Result2(info, 2);
                    } else {
                        info = "you get caught and they mug you";
                        Result2 R2 = new Result2(info, 2);
                    }
                } else if (choice == 3) {
                    if (RandChance() == 1) {
                        info = "you run faster then them and escape";
                        Result3 R3 = new Result3(info, 2);
                    } else {
                        info = "you get caught running from them and they mug you";
                        Result3 R3 = new Result3(info,2);
                    }
                } else if (choice == 4) {
                    info = "they don't want to make peace and they steal your stuff and hurt you";
                    Result4 R4 = new Result4(info,2);
                }
            }

            if (ResultCall == 9) {
                if (choice == 1) {
                    if (CheckCloth() == 1) {
                        info = "you successfully fix the cloth";
                        Result1 R1 = new Result1(info,2);
                    } else if (CheckCloth() == 2) {
                        info = "you don't have any cloth";
                        Result1 R1 = new Result1(info,2);

                    }
                } else if (choice == 2) {
                    info = "you ignore it";
                    Result2 R2 = new Result2(info,2);
                }
                ResultCall = 10;
            }
            if (ResultCall == 11) {
                if (choice == 1) {
                    BankClass BK = new BankClass(1, Loans);
                } else if (choice == 2) {
                    BankClass BK = new BankClass(2, Loans);

                } else if (choice == 3) {
                    info = "you ignore it";
                    Result3 R3 = new Result3(info,2);

                }

                System.out.println(ResultCall);
            }
            if (ResultCall == 12) {
                if (choice == 1) {
                    if (CheckDissentary() == 1) {
                        info = "you successfully heal dissentary";
                        Result1 R1 = new Result1(info,2);

                    } else if (CheckDissentary() == 2) {
                        info = "you don't have a dissentary med and so he dies";
                        Result1 R1 = new Result1(info,2);

                    }
                } else if (choice == 2) {
                    int RandChoice = r.nextInt(2);
                    System.out.println(RandChoice);
                    if (RandChoice == 0) {
                        info = "you ignore it and it heals itself";
                        Result2 R2 = new Result2(info,2);
                    }
                    else if (RandChoice == 1) {
                        info = "you ignore it and someone dies";
                        Result2 R2 = new Result2(info,2);
                    }
                }
            }
            if(ResultCall == 13){
                if(choice == 1){
                    SellCategoryItemAsk SCIA = new SellCategoryItemAsk();
                }
                else if(choice == 2){
                    info = "you ignore it";
                    Result2 R2 = new Result2(info,2);
                }
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
                WaterFall12 WF1 = new WaterFall12(money, food, miles, days, difficulty);
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
        System.out.println("test");
        if(check_days == 1){
            GunFight GF = new GunFight(money, food, miles, days, difficulty);
        }
        if(check_days == 2){
            BrokenPart3 GF = new BrokenPart3(money, food, miles, days, difficulty);
        }
        if(check_days == 3){
            ShopAsk2 GF = new ShopAsk2(money, food, miles, days, difficulty);
        }
        if(check_days == 4){
            Bank1 GF = new Bank1(money, food, miles, days, difficulty);
        }
        if(check_days == 5){
            DiseaseOutbreak3 GF = new DiseaseOutbreak3(money, food, miles, days, difficulty);
        }
        if(check_days == 6){
            SellShop GF = new SellShop(money, food, miles, days, difficulty);
        }
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
                Result1 R1 = new Result1(stuff, 2);
            }
            else if(info == 2){
                money = money + 100;
                Loans = Loans + 1;
                MoneyFromBank = MoneyFromBank + 100;
                stuff = "you gain " + MoneyFromBank + "$ from the bank and 1 Loan";
                Result1 R1 = new Result1(stuff, 2);
            }
            else if(info == 3){
                money = money + 200;
                Loans = Loans + 1;
                MoneyFromBank = MoneyFromBank + 200;
                stuff = "you gain " + MoneyFromBank + "$ from the bank and 1 Loan";
                Result1 R1 = new Result1(stuff, 2);
            }
            else if(info == 4){
                money = money + 250;
                Loans = Loans + 1;
                MoneyFromBank = MoneyFromBank + 250;
                stuff = "you gain " + MoneyFromBank + "$ from the bank and 1 Loan";
                Result1 R1 = new Result1(stuff,2);
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
                Result1 R1 = new Result1(stuff,2);
            }
            else if(info == 2){
                money = money - 100;
                MoneyFromBank = MoneyFromBank - 100;
                if(MoneyFromBank <= 0){
                    Loans = Loans - 1;
                }
                stuff = "you give back 100$ to the bank";
                Result1 R1 = new Result1(stuff,2);
            }
            else if(info == 3){
                money = money - 200;
                MoneyFromBank = MoneyFromBank - 200;
                if(MoneyFromBank <= 0){
                    Loans = Loans - 1;
                }
                stuff = "you give back 200$ to the bank";
                Result1 R1 = new Result1(stuff,2);
            }
            else if(info == 4){
                money = money - 250;
                MoneyFromBank = MoneyFromBank - 250;
                if(MoneyFromBank <= 0){
                    Loans = Loans - 1;
                }
                stuff = "you give back 250$ to the bank";
                Result1 R1 = new Result1(stuff,2);
            }
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

/*
finish ups:

1. continue third trail
2. Take out current path 1 day 6 and make path 1 day 7 into path 1 day 6.


Grant:
1. check map
2. continue map
3. put map numbers where I added new days
4. make the next map
*/