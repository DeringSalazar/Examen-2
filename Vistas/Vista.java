/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Vistas;

import java.util.List;

public interface Vista<Ent> {
    public void show(Ent ent);
    public void showAll(List<Ent> ent);
    public void showMessage(String msg);
    public void showError(String err);
    public void ValidateRequired();
}
