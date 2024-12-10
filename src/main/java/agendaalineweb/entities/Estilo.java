/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendaalineweb.entities;

/**
 *
 * @author Utilizador
 */
public class Estilo {
    private int id;
    private String corPrimaria;
    private String corSecundaria; 
    private String logo;
    private String imagemFundo;
    private String imagemLogin;

    public Estilo(int id, String corPrimaria, String corSecundaria, String logo, String imagemFundo, String imagemLogin) {
        this.id = id;
        this.corPrimaria = corPrimaria;
        this.corSecundaria = corSecundaria;
        this.logo = logo;
        this.imagemFundo = imagemFundo;
        this.imagemLogin = imagemLogin;
    }

    public Estilo(String corPrimaria, String corSecundaria, String logo, String imagemFundo, String imagemLogin) {
        this.corPrimaria = corPrimaria;
        this.corSecundaria = corSecundaria;
        this.logo = logo;
        this.imagemFundo = imagemFundo;
        this.imagemLogin = imagemLogin;
        
        
    }

    public String getImagemLogin() {
        return imagemLogin;
    }

    public void setImagemLogin(String imagemLogin) {
        this.imagemLogin = imagemLogin;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorPrimaria() {
        return corPrimaria;
    }

    public void setCorPrimaria(String corPrimaria) {
        this.corPrimaria = corPrimaria;
    }

    public String getCorSecundaria() {
        return corSecundaria;
    }

    public void setCorSecundaria(String corSecundaria) {
        this.corSecundaria = corSecundaria;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getImagemFundo() {
        return imagemFundo;
    }

    public void setImagemFundo(String imagemFundo) {
        this.imagemFundo = imagemFundo;
    }

    
    
}
