public class GEEGA {
    // Atributos
    private String[] powers;
    private String games;
    private String[] factions;
    private boolean streams;

    // Construtor
    public GEEGA(String[] powers, String games, String[] factions, boolean streams) {
        this.powers = powers;
        this.games = games;
        this.factions = factions;
        this.streams = streams;}

    // Métodos
    public void playGames() {
        System.out.println("GEEGA está jogando " + games);
    }

    public void usePowers() {
        System.out.println("GEEGA usa seus poderes: ");
        for (String power : powers) {
            System.out.println("- " + power);
        }
    }

    public void ruleFactions() {
        System.out.println("GEEGA governa as facções: ");
        for (String faction : factions) {
            System.out.println("- " + faction);
        }
    }

    public void doStreams() {
        if (streams) {
            System.out.println("GEEGA está fazendo stream agora!");
        } else {
            System.out.println("GEEGA está off-stream no momento.");
        }

	
	}
}