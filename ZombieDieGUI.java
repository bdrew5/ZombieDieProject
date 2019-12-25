import javafx.geometry.HPos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.geometry.Pos;
import javafx.scene.shape.*;
import javafx.scene.image.*;
import javafx.scene.effect.ImageInput;

public class ZombieDieGUI extends GridPane {
    ZombieDice d1 = new ZombieDice();
    ZombieDice d2 = new ZombieDice();
    private int currentPlayer;
    private Text brainsText1;
    private Text brainsTotalText1;
    private Text shotsText1;
    private Text player1;
    private Text player2;
    private Label player;
    private Label brain1;
    private Label brain2;
    private Label brainTotal1;
    private Label brainTotal2;
    private Label shots1;
    private Label shots2;
    private int type1;
    private int type2;
    private int type3;
    private int side1;
    private int side2;
    private int side3;
    private Image brains;
    private Image shotguns;
    private Image feet;
    private Rectangle bigDie1;
    private Rectangle bigSmallDie1;
    private Rectangle bigDie2;
    private Rectangle bigSmallDie2;
    private Rectangle bigDie3;
    private Rectangle bigSmallDie3;
    private Rectangle smallGreen1;
    private Rectangle smallGreen2;
    private Rectangle smallGreen3;
    private Rectangle smallGreen4;
    private Rectangle smallGreen5;
    private Rectangle smallGreen6;
    private Rectangle smallYellow1;
    private Rectangle smallYellow2;
    private Rectangle smallYellow3;
    private Rectangle smallYellow4;
    private Rectangle smallRed1;
    private Rectangle smallRed2;
    private Rectangle smallRed3;
    private int green;
    private int yellow;
    private int red;
    private boolean isFeet1;
    private boolean isFeet2;
    private boolean isFeet3;
    private Button stop1;
    private Button roll1;
    private Button stop2;
    private Button roll2;




    public ZombieDieGUI() {
        currentPlayer = 1;
        green = 6;
        yellow = 4;
        red = 3;
        isFeet1 = false;
        isFeet2 = false;
        isFeet3 = false;

        brains = new Image("https://ak0.picdn.net/shutterstock/videos/9731240/thumb/1.jpg", true);

        feet = new Image("https://us.123rf.com/450wm/jevgenijavin/jevgenijavin1711/jevgenijavin171100250/89995162-isolated-footprints-of-a-man-leading-upwards-on-a-black-background-diagonally-concept-of-loneliness.jpg?ver=6", true);

        shotguns = new Image("https://cdn4.vectorstock.com/i/1000x1000/15/88/white-icon-on-black-background-military-shotgun-vector-16361588.jpg", true);

        Font font1 = new Font(11);
        Font font2 = new Font(20);

        bigDie1 = new Rectangle(200,400,100,100);
        bigDie1.setFill(Color.WHITE);

        bigSmallDie1 = new Rectangle(250,410,100,60);
        bigSmallDie1.setFill(Color.WHITE);

        bigDie2 = new Rectangle(250,400,100,100);
        bigDie2.setFill(Color.WHITE);

        bigSmallDie2 = new Rectangle(250,410,100,60);
        bigSmallDie2.setFill(Color.WHITE);

        bigDie3 = new Rectangle(300,400,100,100);
        bigDie3.setFill(Color.WHITE);

        bigSmallDie3 = new Rectangle(250,410,100,60);
        bigSmallDie3.setFill(Color.WHITE);

        smallGreen1 = new Rectangle(10, 400, 20, 20);
        smallGreen1.setFill(Color.GREEN);

        smallGreen2 = new Rectangle(40, 400, 20, 20);
        smallGreen2.setFill(Color.GREEN);

        smallGreen3 = new Rectangle(70, 400, 20, 20);
        smallGreen3.setFill(Color.GREEN);

        smallGreen4 = new Rectangle(100, 400, 20, 20);
        smallGreen4.setFill(Color.GREEN);

        smallGreen5 = new Rectangle(130, 400, 20, 20);
        smallGreen5.setFill(Color.GREEN);

        smallGreen6 = new Rectangle(150, 400, 20, 20);
        smallGreen6.setFill(Color.GREEN);

        smallYellow1 = new Rectangle(10, 430, 20, 20);
        smallYellow1.setFill(Color.YELLOW);

        smallYellow2 = new Rectangle(40, 430, 20, 20);
        smallYellow2.setFill(Color.YELLOW);

        smallYellow3 = new Rectangle(70, 430, 20, 20);
        smallYellow3.setFill(Color.YELLOW);

        smallYellow4 = new Rectangle(100, 430, 20, 20);
        smallYellow4.setFill(Color.YELLOW);

        smallRed1 = new Rectangle(10, 460, 20, 20);
        smallRed1.setFill(Color.RED);

        smallRed2 = new Rectangle(40, 460, 20, 20);
        smallRed2.setFill(Color.RED);

        smallRed3 = new Rectangle(70, 460, 20, 20);
        smallRed3.setFill(Color.RED);

        shotsText1 = new Text("Shots: ");

        brainsText1 = new Text("Brains This Round:");
        brainsTotalText1 = new Text("Total Brains:");

        player1 = new Text("Player 1");
        player2 = new Text("Player 2");

        player = new Label("Player 1's Turn");
        player.setFont(font2);
        GridPane.setHalignment(player, HPos.CENTER);


        stop1 = new Button("Stop");
        stop1.setOnAction(this::processStop);

        roll1 = new Button("Roll");
        roll1.setOnAction(this::processRoll);

        stop2 = new Button("Stop");
        stop2.setOnAction(this::processStop);
        stop2.setVisible(false);

        roll2 = new Button("Roll");
        roll2.setOnAction(this::processRoll);
        roll2.setVisible(false);

        Button reset = new Button("New Game");
        reset.setOnAction(this::processReset);

        brain1 = new Label(" ");
        brain1.setFont(font1);
        GridPane.setHalignment(brain1, HPos.CENTER);

        brain2 = new Label(" ");
        brain2.setFont(font1);
        GridPane.setHalignment(brain2, HPos.CENTER);

        brainTotal1 = new Label("0");
        brainTotal1.setFont(font1);
        GridPane.setHalignment(brainTotal1, HPos.CENTER);

        brainTotal2 = new Label("0");
        brainTotal2.setFont(font1);
        GridPane.setHalignment(brainTotal2, HPos.CENTER);

        shots1 = new Label();
        shots1.setFont(font1);
        GridPane.setHalignment(shots1, HPos.CENTER);

        shots2 = new Label();
        shots2.setFont(font1);
        GridPane.setHalignment(shots2, HPos.CENTER);

        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: white");


        add(player1, 0, 1);
        add(player2, 0, 2);
        add(brainsTotalText1,1,0);
        add(brainTotal1,1,1);
        add(brainTotal2,1,2);
        add(brainsText1, 2, 0);
        add(brain1, 2, 1);
        add(brain2, 2, 2);
        add(shotsText1, 3, 0);
        add(shots1, 3, 1);
        add(shots2, 3, 2);
        add(stop1, 5, 1);
        add(roll1, 4, 1);
        add(stop2, 5, 2);
        add(roll2, 4, 2);
        add(player,8,3);
        add(bigDie1,7,6);
        add(bigSmallDie1,7,6);
        add(bigDie2,8,6);
        add(bigSmallDie2,8,6);
        add(bigDie3,9,6);
        add(bigSmallDie3,9,6);
        add(smallGreen1,0,6);
        add(smallGreen2,1,6);
        add(smallGreen3,2,6);
        add(smallGreen4,3,6);
        add(smallGreen5,4,6);
        add(smallGreen6,5,6);
        add(smallYellow1,0,7);
        add(smallYellow2,1,7);
        add(smallYellow3,2,7);
        add(smallYellow4,3,7);
        add(smallRed1,0,8);
        add(smallRed2,1,8);
        add(smallRed3,2,8);
        add(reset, 0,9);
    }

    private void processRoll(ActionEvent event1){
        if (currentPlayer%2 == 1) {

            if (!isFeet1) {
                d1.rollZombie();
                d1.findDieFace();
                type1 = d1.getColor();
                side1 = d1.getSide();
            }
            else {
                d1.setColor(type1);
                d1.rollOnlySide();
                d1.findDieFace();
                side1 = d1.getSide();
            }
            if (!isFeet2){
                d1.rollZombie();
                d1.findDieFace();
                type2 = d1.getColor();
                side2 = d1.getSide();
            }
            else{
                d1.setColor(type2);
                d1.rollOnlySide();
                d1.findDieFace();
                side2 = d1.getSide();
            }
            if(!isFeet3){
                d1.rollZombie();
                d1.findDieFace();
                type3 = d1.getColor();
                side3 = d1.getSide();
            }
            else{
                d1.setColor(type3);
                d1.rollOnlySide();
                d1.findDieFace();
                side3 = d1.getSide();
            }
            int b= d1.getBrains();
            int s= d1.getShots();

            if(type1==3){
                bigDie1.setFill(Color.RED);
                if(red == 3 && side1 <=4){
                    smallRed3.setFill(Color.WHITE);
                    red--;
                }
                else   if (red == 2 && side1 <=4) {
                    smallRed2.setFill(Color.WHITE);
                    red--;
                }
                else  if (red == 1 && side1 <=4) {
                    smallRed1.setFill(Color.WHITE);
                    red--;
                }
                if(side1<=1){
                    bigSmallDie1.setFill(new ImagePattern(brains));
                    isFeet1 = false;
                }
                else if(side1 <=4){
                    bigSmallDie1.setFill(new ImagePattern(shotguns));
                    isFeet1 = false;
                }
                else{
                    bigSmallDie1.setFill(new ImagePattern(feet));
                    isFeet1 = true;
                }
            }
            else if (type1==2){
                bigDie1.setFill(Color.YELLOW);
                if (yellow == 4 && side1 <=4) {
                    smallYellow4.setFill(Color.WHITE);
                    yellow--;
                }
                else  if(yellow == 3 && side1 <=4){
                    smallYellow3.setFill(Color.WHITE);
                    yellow--;
                }
                else  if (yellow == 2 && side1 <=4) {
                    smallYellow2.setFill(Color.WHITE);
                    yellow--;
                }
                else  if (yellow == 1 && side1 <=4) {
                    smallYellow1.setFill(Color.WHITE);
                    yellow--;
                }

                if(side1 <= 2){
                    bigSmallDie1.setFill(new ImagePattern(brains));
                    isFeet1 = false;
                }
                else if(side1 <=4){
                    bigSmallDie1.setFill(new ImagePattern(shotguns));
                    isFeet1 = false;
                }
                else{
                    bigSmallDie1.setFill(new ImagePattern(feet));
                    isFeet1 = true;
                }
            }
            else{
                bigDie1.setFill(Color.GREEN);
                if(green == 6 && side1 <=4){
                    smallGreen6.setFill(Color.WHITE);
                    green--;
                }
                else  if (green == 5 && side1 <=4) {
                    smallGreen5.setFill(Color.WHITE);
                    green--;
                }
                else if (green == 4 && side1 <=4) {
                    smallGreen4.setFill(Color.WHITE);
                    green--;
                }
                else  if(green == 3 && side1 <=4){
                    smallGreen3.setFill(Color.WHITE);
                    green--;
                }
                else if (green == 2 && side1 <=4) {
                    smallGreen2.setFill(Color.WHITE);
                    green--;
                }
                else  if (green == 1 && side1 <=4) {
                    smallGreen1.setFill(Color.WHITE);
                    green--;
                }

                if(side1<=3){
                    bigSmallDie1.setFill(new ImagePattern(brains));
                    isFeet1 = false;
                }
                else if(side1<=4){
                    bigSmallDie1.setFill(new ImagePattern(shotguns));
                    isFeet1 = false;
                }
                else{
                    bigSmallDie1.setFill(new ImagePattern(feet));
                    isFeet1 = true;
                }
            }
            if(type2==3){
                bigDie2.setFill(Color.RED);
                if(red == 3 && side2 <=4){
                    smallRed3.setFill(Color.WHITE);
                    red--;
                }
                else if (red == 2 && side2 <=4) {
                    smallRed2.setFill(Color.WHITE);
                    red--;
                }
                else if (red == 1 && side2 <=4) {
                    smallRed1.setFill(Color.WHITE);
                    red--;
                }
                if(side2<=1){
                    bigSmallDie2.setFill(new ImagePattern(brains));
                    isFeet2 = false;
                }
                else if(side2 <=4){
                    bigSmallDie2.setFill(new ImagePattern(shotguns));
                    isFeet2 = false;
                }
                else{
                    bigSmallDie2.setFill(new ImagePattern(feet));
                    isFeet2 = true;
                }
            }
            else if (type2 == 2){
                bigDie2.setFill(Color.YELLOW);
                if (yellow == 4 && side2 <=4) {
                    smallYellow4.setFill(Color.WHITE);
                    yellow--;
                }
                else if(yellow == 3 && side2 <=4){
                    smallYellow3.setFill(Color.WHITE);
                    yellow--;
                }
                else if (yellow == 2 && side2 <=4) {
                    smallYellow2.setFill(Color.WHITE);
                    yellow--;
                }
                else if (yellow == 1 && side2 <=4) {
                    smallYellow1.setFill(Color.WHITE);
                    yellow--;
                }

                if(side2 <= 2){
                    bigSmallDie2.setFill(new ImagePattern(brains));
                    isFeet2 = false;
                }
                else if(side2 <=4){
                    bigSmallDie2.setFill(new ImagePattern(shotguns));
                    isFeet2 = false;
                }
                else{
                    bigSmallDie2.setFill(new ImagePattern(feet));
                    isFeet2 = true;
                }
            }
            else{
                bigDie2.setFill(Color.GREEN);
                if(green == 6 && side2 <=4){
                    smallGreen6.setFill(Color.WHITE);
                    green--;
                }
                else if (green == 5 && side2 <=4) {
                    smallGreen5.setFill(Color.WHITE);
                    green--;
                }
                else  if (green == 4 && side2 <=4) {
                    smallGreen4.setFill(Color.WHITE);
                    green--;
                }
                else if(green == 3 && side2 <=4){
                    smallGreen3.setFill(Color.WHITE);
                    green--;
                }
                else if (green == 2 && side2 <=4) {
                    smallGreen2.setFill(Color.WHITE);
                    green--;
                }
                else if (green == 1 && side2 <=4) {
                    smallGreen1.setFill(Color.WHITE);
                    green--;
                }
                if(side2<=3){
                    bigSmallDie2.setFill(new ImagePattern(brains));
                    isFeet2 = false;
                }
                else if(side2<=4){
                    bigSmallDie2.setFill(new ImagePattern(shotguns));
                    isFeet2 = false;
                }
                else{
                    bigSmallDie2.setFill(new ImagePattern(feet));
                    isFeet2 = true;
                }
            }
            if(type3==3){
                bigDie3.setFill(Color.RED);
                if(red == 3 && side3 <=4){
                    smallRed3.setFill(Color.WHITE);
                    red--;
                }
                else if (red == 2 && side3 <=4) {
                    smallRed2.setFill(Color.WHITE);
                    red--;
                }
                else if (red == 1 && side3 <=4) {
                    smallRed1.setFill(Color.WHITE);
                    red--;
                }
                if(side3<=1){
                    bigSmallDie3.setFill(new ImagePattern(brains));
                    isFeet3 = false;
                }
                else if(side3 <=4){
                    bigSmallDie3.setFill(new ImagePattern(shotguns));
                    isFeet3 = false;
                }
                else{
                    bigSmallDie3.setFill(new ImagePattern(feet));
                    isFeet3 = true;
                }
            }
            else if (type3==2){
                bigDie3.setFill(Color.YELLOW);
                if (yellow == 4 && side3 <=4) {
                    smallYellow4.setFill(Color.WHITE);
                    yellow--;
                }
                else if(yellow == 3 && side3 <=4){
                    smallYellow3.setFill(Color.WHITE);
                    yellow--;
                }
                else if (yellow == 2 && side3 <=4) {
                    smallYellow2.setFill(Color.WHITE);
                    yellow--;
                }
                else if (yellow == 1 && side3 <=4) {
                    smallYellow1.setFill(Color.WHITE);
                    yellow--;
                }

                if(side3 <= 2){
                    bigSmallDie3.setFill(new ImagePattern(brains));
                    isFeet3 = false;
                }
                else if(side3 <=4){
                    bigSmallDie3.setFill(new ImagePattern(shotguns));
                    isFeet3 = false;
                }
                else{
                    bigSmallDie3.setFill(new ImagePattern(feet));
                    isFeet3 = true;
                }
            }
            else{
                bigDie3.setFill(Color.GREEN);
                if(green == 6 && side3 <=4){
                    smallGreen6.setFill(Color.WHITE);
                    green--;
                }
                else if (green == 5 && side3 <=4) {
                    smallGreen5.setFill(Color.WHITE);
                    green--;
                }
                else if (green == 4 && side3 <=4) {
                    smallGreen4.setFill(Color.WHITE);
                    green--;
                }
                else if(green == 3 && side3 <=4){
                    smallGreen3.setFill(Color.WHITE);
                    green--;
                }
                else if (green == 2 && side3 <=4) {
                    smallGreen2.setFill(Color.WHITE);
                    green--;
                }
                else if (green == 1 && side3 <=4) {
                    smallGreen1.setFill(Color.WHITE);
                    green--;
                }
                if(side3<=3){
                    bigSmallDie3.setFill(new ImagePattern(brains));
                    isFeet3 = false;
                }
                else if(side3<=4){
                    bigSmallDie3.setFill(new ImagePattern(shotguns));
                    isFeet3 = false;
                }
                else{
                    bigSmallDie3.setFill(new ImagePattern(feet));
                    isFeet3 = true;
                }
            }
            if (s>=3){
                stop2.setVisible(false);
                stop1.setVisible(true);
                roll1.setVisible(false);
                roll2.setVisible(false);
                shots1.setText(" ");
                brain1.setText(" ");
            }
            else {
                brain1.setText(b + "");
                shots1.setText(s + "");
            }
        }
        else{

            if (!isFeet1) {
                d2.rollZombie();
                d2.findDieFace();
                type1 = d2.getColor();
                side1 = d2.getSide();
            } else {
                d2.setColor(type1);
                d2.rollOnlySide();
                d2.findDieFace();
                side1 = d2.getSide();
            }
            if (!isFeet2){
                d2.rollZombie();
                d2.findDieFace();
                type2 = d2.getColor();
                side2 = d2.getSide();
            }
            else{
                d2.setColor(type2);
                d2.rollOnlySide();
                d2.findDieFace();
                side2 = d2.getSide();
            }
            if(!isFeet3){
                d2.rollZombie();
                d2.findDieFace();
                type3 = d2.getColor();
                side3 = d2.getSide();
            }
            else{
                d2.setColor(type3);
                d2.rollOnlySide();
                d2.findDieFace();
                side3 = d2.getSide();
            }
            int b= d2.getBrains();
            int s= d2.getShots();
            if(type1==3){
                bigDie1.setFill(Color.RED);
                if(red == 3 && side1 <=4){
                    smallRed3.setFill(Color.WHITE);
                    red--;
                }
                else   if (red == 2 && side1 <=4) {
                    smallRed2.setFill(Color.WHITE);
                    red--;
                }
                else  if (red == 1 && side1 <=4) {
                    smallRed1.setFill(Color.WHITE);
                    red--;
                }
                if(side1<=1){
                    bigSmallDie1.setFill(new ImagePattern(brains));
                    isFeet1 = false;
                }

                else if(side1 <=4){
                    bigSmallDie1.setFill(new ImagePattern(shotguns));
                    isFeet1 = false;
                }
                else{
                    bigSmallDie1.setFill(new ImagePattern(feet));
                    isFeet1 = true;
                }
            }
            else if (type1==2){
                bigDie1.setFill(Color.YELLOW);
                if (yellow == 4 && side1 <=4) {
                    smallYellow4.setFill(Color.WHITE);
                    yellow--;
                }
                else  if(yellow == 3 && side1 <=4){
                    smallYellow3.setFill(Color.WHITE);
                    yellow--;
                }
                else  if (yellow == 2 && side1 <=4) {
                    smallYellow2.setFill(Color.WHITE);
                    yellow--;
                }
                else  if (yellow == 1 && side1 <=4) {
                    smallYellow1.setFill(Color.WHITE);
                    yellow--;
                }

                if(side1 <= 2){
                    bigSmallDie1.setFill(new ImagePattern(brains));
                    isFeet1 = false;
                }
                else if(side1 <=4){
                    bigSmallDie1.setFill(new ImagePattern(shotguns));
                    isFeet1 = false;
                }
                else{
                    bigSmallDie1.setFill(new ImagePattern(feet));
                    isFeet1 = true;
                }
            }
            else{
                bigDie1.setFill(Color.GREEN);
                if(green == 6 && side1 <=4){
                    smallGreen6.setFill(Color.WHITE);
                    green--;
                }
                else  if (green == 5 && side1 <=4) {
                    smallGreen5.setFill(Color.WHITE);
                    green--;
                }
                else if (green == 4 && side1 <=4) {
                    smallGreen4.setFill(Color.WHITE);
                    green--;
                }
                else  if(green == 3 && side1 <=4){
                    smallGreen3.setFill(Color.WHITE);
                    green--;
                }
                else if (green == 2 && side1 <=4) {
                    smallGreen2.setFill(Color.WHITE);
                    green--;
                }
                else  if (green == 1 && side1 <=4) {
                    smallGreen1.setFill(Color.WHITE);
                    green--;
                }

                if(side1<=3){
                    bigSmallDie1.setFill(new ImagePattern(brains));
                    isFeet1 = false;
                }
                else if(side1<=4){
                    bigSmallDie1.setFill(new ImagePattern(shotguns));
                    isFeet1 = false;
                }
                else{
                    bigSmallDie1.setFill(new ImagePattern(feet));
                    isFeet1 = true;

                }
            }
            if(type2==3){
                bigDie2.setFill(Color.RED);
                if(red == 3 && side2 <=4){
                    smallRed3.setFill(Color.WHITE);
                    red--;
                }
                else if (red == 2 && side2 <=4) {
                    smallRed2.setFill(Color.WHITE);
                    red--;
                }
                else if (red == 1 && side2 <=4) {
                    smallRed1.setFill(Color.WHITE);
                    red--;
                }
                if(side2<=1){
                    bigSmallDie2.setFill(new ImagePattern(brains));
                    isFeet2 = false;
                }
                else if(side2 <=4){
                    bigSmallDie2.setFill(new ImagePattern(shotguns));
                    isFeet2 = false;
                }
                else{
                    bigSmallDie2.setFill(new ImagePattern(feet));
                    isFeet2 = true;
                }
            }
            else if (type2==2){
                bigDie2.setFill(Color.YELLOW);
                if (yellow == 4 && side2 <=4) {
                    smallYellow4.setFill(Color.WHITE);
                    yellow--;
                }
                else if(yellow == 3 && side2 <=4){
                    smallYellow3.setFill(Color.WHITE);
                    yellow--;
                }
                else if (yellow == 2 && side2 <=4) {
                    smallYellow2.setFill(Color.WHITE);
                    yellow--;
                }
                else if (yellow == 1 && side2 <=4) {
                    smallYellow1.setFill(Color.WHITE);
                    yellow--;
                }

                if(side2 <= 2){
                    bigSmallDie2.setFill(new ImagePattern(brains));
                    isFeet2 = false;
                }
                else if(side2 <=4){
                    bigSmallDie2.setFill(new ImagePattern(shotguns));
                    isFeet2 = false;
                }
                else{
                    bigSmallDie2.setFill(new ImagePattern(feet));
                    isFeet2 = true;
                }
            }
            else{
                bigDie2.setFill(Color.GREEN);
                if(green == 6 && side2 <=4){
                    smallGreen6.setFill(Color.WHITE);
                    green--;
                }
                else if (green == 5 && side2 <=4) {
                    smallGreen5.setFill(Color.WHITE);
                    green--;
                }
                else  if (green == 4 && side2 <=4) {
                    smallGreen4.setFill(Color.WHITE);
                    green--;
                }
                else if(green == 3 && side2 <=4){
                    smallGreen3.setFill(Color.WHITE);
                    green--;
                }
                else if (green == 2 && side2 <=4) {
                    smallGreen2.setFill(Color.WHITE);
                    green--;
                }
                else if (green == 1 && side2 <=4) {
                    smallGreen1.setFill(Color.WHITE);
                    green--;
                }
                if(side2<=3){
                    bigSmallDie2.setFill(new ImagePattern(brains));
                    isFeet2 = false;
                }
                else if(side2<=4){
                    bigSmallDie2.setFill(new ImagePattern(shotguns));
                    isFeet2 = false;
                }
                else{
                    bigSmallDie2.setFill(new ImagePattern(feet));
                    isFeet2 = true;
                }
            }
            if(type3==3){
                bigDie3.setFill(Color.RED);
                if(red == 3 && side3 <=4){
                    smallRed3.setFill(Color.WHITE);
                    red--;
                }
                else if (red == 2 && side3 <=4) {
                    smallRed2.setFill(Color.WHITE);
                    red--;
                }
                else if (red == 1 && side3 <=4) {
                    smallRed1.setFill(Color.WHITE);
                    red--;
                }
                if(side3<=1){
                    bigSmallDie3.setFill(new ImagePattern(brains));
                    isFeet3 = false;
                }
                else if(side3 <=4){
                    bigSmallDie3.setFill(new ImagePattern(shotguns));
                    isFeet3 = false;
                }
                else{
                    bigSmallDie3.setFill(new ImagePattern(feet));
                    isFeet3 = true;
                }
            }
            else if (type3==2){
                bigDie3.setFill(Color.YELLOW);
                if (yellow == 4 && side3 <=4) {
                    smallYellow4.setFill(Color.WHITE);
                    yellow--;
                }
                else if(yellow == 3 && side3 <=4){
                    smallYellow3.setFill(Color.WHITE);
                    yellow--;
                }
                else if (yellow == 2 && side3 <=4) {
                    smallYellow2.setFill(Color.WHITE);
                    yellow--;
                }
                else if (yellow == 1 && side3 <=4) {
                    smallYellow1.setFill(Color.WHITE);
                    yellow--;
                }

                if(side3 <= 2){
                    bigSmallDie3.setFill(new ImagePattern(brains));
                    isFeet3 = false;
                }
                else if(side3 <=4){
                    bigSmallDie3.setFill(new ImagePattern(shotguns));
                    isFeet3 = false;
                }
                else{
                    bigSmallDie3.setFill(new ImagePattern(feet));
                    isFeet3 = true;
                }
            }
            else{
                bigDie3.setFill(Color.GREEN);
                if(green == 6 && side3 <=4){
                    smallGreen6.setFill(Color.WHITE);
                    green--;
                }
                else if (green == 5 && side3 <=4) {
                    smallGreen5.setFill(Color.WHITE);
                    green--;
                }
                else if (green == 4 && side3 <=4) {
                    smallGreen4.setFill(Color.WHITE);
                    green--;
                }
                else if(green == 3 && side3 <=4){
                    smallGreen3.setFill(Color.WHITE);
                    green--;
                }
                else if (green == 2 && side3 <=4) {
                    smallGreen2.setFill(Color.WHITE);
                    green--;
                }
                else if (green == 1 && side3 <=4) {
                    smallGreen1.setFill(Color.WHITE);
                    green--;
                }
                if(side3<=3){
                    bigSmallDie3.setFill(new ImagePattern(brains));
                    isFeet3 = false;
                }
                else if(side3<=4){
                    bigSmallDie3.setFill(new ImagePattern(shotguns));
                    isFeet3 = false;
                }
                else{
                    bigSmallDie3.setFill(new ImagePattern(feet));
                    isFeet3 = true;
                }
            }
            if (s>=3){
                shots2.setText(" ");
                brain2.setText(" ");
                stop1.setVisible(false);
                stop2.setVisible(true);
                roll2.setVisible(false);
                roll1.setVisible(false);
            }
            else {
                brain2.setText(b + "");
                shots2.setText(s + "");
            }
        }
    }

    private void processStop(ActionEvent event2){
        currentPlayer++;
        green=6;
        yellow=4;
        red=3;
        smallGreen1.setFill(Color.GREEN);
        smallGreen2.setFill(Color.GREEN);
        smallGreen3.setFill(Color.GREEN);
        smallGreen4.setFill(Color.GREEN);
        smallGreen5.setFill(Color.GREEN);
        smallGreen6.setFill(Color.GREEN);
        smallYellow1.setFill(Color.YELLOW);
        smallYellow2.setFill(Color.YELLOW);
        smallYellow3.setFill(Color.YELLOW);
        smallYellow4.setFill(Color.YELLOW);
        smallRed1.setFill(Color.RED);
        smallRed2.setFill(Color.RED);
        smallRed3.setFill(Color.RED);
        bigDie1.setFill(Color.WHITE);
        bigDie2.setFill(Color.WHITE);
        bigDie3.setFill(Color.WHITE);
        bigSmallDie1.setFill(Color.WHITE);
        bigSmallDie2.setFill(Color.WHITE);
        bigSmallDie3.setFill(Color.WHITE);
        isFeet1 = false;
        isFeet2 = false;
        isFeet3 = false;
        if (currentPlayer%2 == 1){
            player.setText("Player 1's Turn");
            d2.endTurn();
            shots2.setText(" ");
            brain2.setText(" ");
            brainTotal2.setText(d2.getTotalBrains() + "");
            stop2.setVisible(false);
            stop1.setVisible(true);
            roll2.setVisible(false);
            roll1.setVisible(true);
        }
        else{
            player.setText("Player 2's Turn");
            d1.endTurn();
            shots1.setText(" ");
            brain1.setText(" ");
            brainTotal1.setText(d1.getTotalBrains() + "");
            stop1.setVisible(false);
            stop2.setVisible(true);
            roll1.setVisible(false);
            roll2.setVisible(true);
        }
        if (d1.getTotalBrains() >=11 || d2.getTotalBrains() >=11){
            stop1.setVisible(false);
            roll1.setVisible(false);
            stop2.setVisible(false);
            roll2.setVisible(false);
            if (currentPlayer%2==0){
                player.setText("Player 1 Has Won The Game");
            }
            else{
                player.setText("Player 2 Has Won The Game");
            }
        }
    }
    private void processReset(ActionEvent event3){
        player.setText("Player 1's Turn");
        green=6;
        yellow=4;
        red=3;
        smallGreen1.setFill(Color.GREEN);
        smallGreen2.setFill(Color.GREEN);
        smallGreen3.setFill(Color.GREEN);
        smallGreen4.setFill(Color.GREEN);
        smallGreen5.setFill(Color.GREEN);
        smallGreen6.setFill(Color.GREEN);
        smallYellow1.setFill(Color.YELLOW);
        smallYellow2.setFill(Color.YELLOW);
        smallYellow3.setFill(Color.YELLOW);
        smallYellow4.setFill(Color.YELLOW);
        smallRed1.setFill(Color.RED);
        smallRed2.setFill(Color.RED);
        smallRed3.setFill(Color.RED);
        bigDie1.setFill(Color.WHITE);
        bigDie2.setFill(Color.WHITE);
        bigDie3.setFill(Color.WHITE);
        bigSmallDie1.setFill(Color.WHITE);
        bigSmallDie2.setFill(Color.WHITE);
        bigSmallDie3.setFill(Color.WHITE);
        shots1.setText(" ");
        brain1.setText(" ");
        brainTotal1.setText("0");
        shots2.setText(" ");
        brain2.setText(" ");
        brainTotal2.setText("0");
        currentPlayer = 1;
        stop1.setVisible(true);
        roll1.setVisible(true);
        stop2.setVisible(false);
        roll2.setVisible(false);
        d1.resetTotal();
        d2.resetTotal();
        isFeet1 = false;
        isFeet2 = false;
        isFeet3 = false;
    }
}


