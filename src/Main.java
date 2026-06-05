import java.util.Scanner;
class Etudiant {
    String nom;
    String prenom;
    String sermestre;
    int nbrdemodule;
    double[] coeff;
    double[] note;
    Etudiant(){

    }
    void saisir(){

        Scanner sc = new Scanner(System.in);
        System.out.print("donner votre nom ;");
        nom= sc.nextLine();
        System.out.print("donner votre prenom:");
        prenom= sc.nextLine();
        System.out.print("donner votre sermestre ");
        sermestre = sc.nextLine();
        System.out.print("donner nombre de modules ");
        nbrdemodule = sc.nextInt();
        note = new double[nbrdemodule];
        coeff = new double [nbrdemodule];
        for (int i = 0; i < nbrdemodule; i++) {
            System.out.print("Donner votre note du module : ");
            note[i] = sc.nextDouble();
            System.out.print("Donner votre coeff du module : ");
            coeff[i] = sc.nextDouble();
        }
    }
    double moyenne(){
        double s=0;
        double t=0;
        for (int i=0 ; i<nbrdemodule ; i++){
            s= s + (note[i]*coeff[i]);
            t=t+coeff[i];
        }
        return s/t;
    }
    void afiicher(){
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Semestre: " + sermestre);
        System.out.printf("Moyenne: %.2f " ,moyenne());
    }



        }
public class Main {

    public static void main(String[] args){

        Etudiant e1 =new Etudiant();
        e1.saisir();
        e1.afiicher();

    }
}
