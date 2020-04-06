package Domain.DTO;

public class ReporterDTO {

    private int id;
    private String pseudo ;
    private int credit;

    public ReporterDTO(){
    }

    public ReporterDTO(int id, String pseudo, int credit) {
        this.id = id;
        this.pseudo = pseudo;
        this.credit = credit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "ReporterDTO{" +
                "id=" + id +
                ", pseudo='" + pseudo + '\'' +
                ", credit=" + credit +
                '}';
    }
}
