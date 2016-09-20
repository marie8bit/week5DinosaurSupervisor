package com.MarieErickson;

public class DinosaurSupervisor
{

    public static void main(String[] args) {
	// write your code here
        Dinosaur t_rex = new Dinosaur();
        Dinosaur velociraptor = new Dinosaur();
        Dinosaur tricerotops = new Dinosaur();
        t_rex.roar("T-Rex");
        velociraptor.roar("Velociraptor");
        tricerotops.roar();
    }
}
