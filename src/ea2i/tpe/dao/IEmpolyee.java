/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.dao;

import ea2i.tpe.model.MEmployee;
import java.util.ArrayList;

/**
 *
 * @author CELESTIN
 */
public interface IEmpolyee {
    
    //CRUD
    public void createEmployee(MEmployee e);
    public ArrayList<MEmployee> readAllEmployee();
    public void updateEmployee(MEmployee e);
    public void deleteEmployee(MEmployee e);
    
    //research par nom
    public ArrayList<MEmployee> searchEmployee(String name);
}
