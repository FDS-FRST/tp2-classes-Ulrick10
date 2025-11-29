class Quadrilatere {
    private double longueur;
    private double largeur;

    // Constructeur par défaut
    public Quadrilatere() {
        this.longueur = 1.0;
        this.largeur = 1.0;
    }

    // Constructeur avec paramètres
    public Quadrilatere(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Méthode pour calculer la surface
    public double surface() {
        return longueur * largeur;
    }

    // Méthode pour calculer le périmètre
    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    // Getters et setters (optionnels mais utiles)
    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    // Méthode main pour tester la classe
    public static void main(String[] args) {
        // Création de deux instances de quadrilatères
        Quadrilatere quad1 = new Quadrilatere(); // Constructeur par défaut
        Quadrilatere quad2 = new Quadrilatere(5.0, 3.0); // Constructeur avec paramètres

        // Affichage des surfaces et périmètres
        System.out.println("Quadrilatère 1 (constructeur par défaut):");
        System.out.println("Surface: " + quad1.surface());
        System.out.println("Périmètre: " + quad1.perimetre());

        System.out.println("\nQuadrilatère 2 (constructeur avec paramètres):");
        System.out.println("Surface: " + quad2.surface());
        System.out.println("Périmètre: " + quad2.perimetre());
    }
}
