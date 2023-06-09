/**
Group 3 members
   Name						  ID
Eyob Alebachew 					1404495
Elias Demlie					1404524
Bruktawit Wendmenew				1404995
Bichawerk Amogne				1404613
**/

public class AnsweringMachine {

	private boolean status;
	public Message m_Message;

	public AnsweringMachine(){

	}

	public void finalize() throws Throwable {

	}

	public playBack(){

	}

	public Record(){

	}

	public reset(){

	}

	public set(){

	}

}

public class Message {

	private AudioStream Content;

	public Message(){

	}

	public void finalize() throws Throwable {

	}

}


public class CallerID {

	private int id;

	public CallerID(){

	}

	public void finalize() throws Throwable {

	}

	public display(int n){

	}

	public reset(){

	}

}

public class Line {

	private boolean busy;
	public Telephone m_Telephone;

	public Line(){

	}

	public void finalize() throws Throwable {

	}

	public dial(int n){

	}

	public offHook(){

	}

	public onHook(){

	}

}

public class Ringer {

	private boolean status;

	public Ringer(){

	}

	public void finalize() throws Throwable {

	}

	public reset(){

	}

	public ring(){

	}

}

public class Telephone {

	private int connection = 0;
	private boolean hook = true;
	public Ringer m_Ringer;
	public CallerID m_CallerID;
	public AnsweringMachine m_AnsweringMachine;
	public Line m_Line;

	public Telephone(){

	}

	public void finalize() throws Throwable {

	}
	public dial(int n){

	}

	public offHook(){

	}

	public onHook(){

	}
	public setAnsMachine(boolean status){

	}

	public setCallerID(boolean status){

	}

}


