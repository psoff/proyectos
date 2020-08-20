/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

import java.time.LocalDate;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author FRANCO
 */
@Named
@RequestScoped
public class ValidationView {

    private String text;
    private Double money;
    private LocalDate localDate3;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getLocalDate3() {
        return localDate3;
    }

    public void setLocalDate3(LocalDate localDate) {
        this.localDate3 = localDate;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
        public void error() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Cuidado", "Datos erroneos o campos vacios"));
    }
}
