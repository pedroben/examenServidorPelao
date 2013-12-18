package net.daw.bean;

public class UsuarioBean {

    private int id = 0;
    private String login = "";
    private String password = "";
    private String nombre = "";
    private String ape1 = "";
    private String ap2 = "";
    private Enum tipoUsuario = null;

    public UsuarioBean() {

    }

    public UsuarioBean(Integer id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ape1
     */
    public String getApe1() {
        return ape1;
    }

    /**
     * @param ape1 the ape1 to set
     */
    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    /**
     * @return the ap2
     */
    public String getAp2() {
        return ap2;
    }

    /**
     * @param ap2 the ap2 to set
     */
    public void setAp2(String ap2) {
        this.ap2 = ap2;
    }

    /**
     * @return the tipoUsuario
     */
    public Enum getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario the tipoUsuario to set
     */
    public void setTipoUsuario(Enum tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}


