public class main {

    public static void main(String[] args) {
        System.out.println("Hello word");
        firstclass myobject = new firstclass();
        System.out.println(myobject.x);
        firstclass myobject2 = new firstclass();
        System.out.println((myobject2.x) * 2);
        secondclass mySobject = new secondclass();
        System.out.println(mySobject.x);

        Etudiant Fred = new Etudiant();
        System.out.println("Je m'appelle : " + Fred.nom + " " + Fred.prenom + ", j'ai " + Fred.AGE + "ans" + ", mon matricule est " + Fred.matricule + ", je suis de sexe " + Fred.sexe + ", mon numero est le " + Fred.numero + ", je vis a " + Fred.Ville);

        enseignant ben = new enseignant();
        System.out.println("Je m'appelle : " + ben.nom + " " + ben.prenom + ", j'ai " + ben.AGE + "ans" + ", mon matricule est " + ben.matricule + ", je suis de sexe " + ben.sexe + ", mon numero est le " + ben.numero + ", je vis a " + ben.Ville + " et je donne le cours de " + ben.matiere + ".");

        myMethod();

        myStaticMethod();         // Call the static method
        // myPublicMethod(); This would compile an error

        main myObj = new main();   // Create an object of Main
        myObj.myPublicMethod();    // Call the public method on the object

        // Inside main, call the methods on the myCar object
        main myCar = new main();   // Create a myCar object
        myCar.fullThrottle();      // Call the fullThrottle() method
        myCar.speed(200);  // Call the speed() method

    }

    static void myMethod() {
        System.out.println("Hello World!");
    }
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }
    // public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
}
