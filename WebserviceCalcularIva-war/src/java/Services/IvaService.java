
package Services;

import Modelopk.IVA;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(serviceName = "IvaService")
public class IvaService {
    @EJB
    private IVA ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "calcularIva")
   
    public double calcularIva(@WebParam(name = "valor") double valor, @WebParam(name = "porcentaje") double porcentaje) {
        return ejbRef.calcularIva(valor, porcentaje);
    }

    @WebMethod(operationName = "main")
    @Oneway
    public void main(@WebParam(name = "args") String[] args) {
        ejbRef.main(args);
    }
    
}
