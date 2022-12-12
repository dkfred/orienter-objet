public class main {

    public static void main(String[] args) {
        System.out.println("Hello word");
        firstclass myobject = new firstclass();
        System.out.println(myobject.x);
        firstclass myobject2 = new firstclass();
        System.out.println((myobject2.x)*2);
        secondclass mySobject = new secondclass();
        System.out.println(mySobject.x);

        Etudiant Fred = new Etudiant();
        System.out.println("Je m'appelle : "+Fred.nom+" "+Fred.prenom+" j'ai "+Fred.AGE + ", mon matricule est "+Fred.matricule+", je suis de sexe ,"+"je suis de sexe "+Fred.sexe+",  numero est le "+Fred.numero+", je vis a "+Fred.Ville);
    }

}
