/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;


/**
 *
 * @author FRANCO
 */
@Named
@ViewScoped
public class DashboardView implements Serializable{
    private DashboardModel model;
    @PostConstruct
    public void init() {
        model = new DefaultDashboardModel();
        DashboardColumn column1 = new DefaultDashboardColumn();
        DashboardColumn column2 = new DefaultDashboardColumn();
        DashboardColumn column3 = new DefaultDashboardColumn();
         
        column1.addWidget("sports");
        column1.addWidget("finance");
         
        column2.addWidget("lifestyle");
        column2.addWidget("weather");
         
        column3.addWidget("politics");
 
        model.addColumn(column1);
        model.addColumn(column2);
        model.addColumn(column3);
    }
      public DashboardModel getModel() {
        return model;
    }
}
