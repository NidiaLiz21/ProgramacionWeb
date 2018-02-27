package Modelopk;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@Stateless
//@Local
@WebService(serviceName="IvaService")

public class IVA implements IvaLocal{

    double resultado;

    public double calcularIva(double valor, double porcentaje) {
        resultado = valor + (valor * (porcentaje / 100));
        return resultado;
    }
    
    public static void main(String args[]) {
        IVA total = new IVA();
        System.out.println(total.calcularIva(100000, 19));
    }
}
