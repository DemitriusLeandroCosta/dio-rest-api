package estudo.aplicationapi.model;

public class Usuario {
    private Integer id;
    private String login;
    private String passaword;

    public Usuario(String login, String passaword) {
        this.login = login;
        this.passaword = passaword;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", passaword='" + passaword + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
