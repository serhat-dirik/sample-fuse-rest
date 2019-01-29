package demo.sd.redhat.com;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.11.fuse-720038
 * 2019-01-29T04:57:29.780+04:00
 * Generated source version: 3.1.11.fuse-720038
 * 
 */
@WebService(targetNamespace = "http://com.redhat.sd.demo/", name = "AccountService")
@XmlSeeAlso({ObjectFactory.class})
public interface AccountService {

    @WebMethod(action = "urn:GetAccount")
    @RequestWrapper(localName = "getAccount", targetNamespace = "http://com.redhat.sd.demo/", className = "demo.sd.redhat.com.GetAccount")
    @ResponseWrapper(localName = "getAccountResponse", targetNamespace = "http://com.redhat.sd.demo/", className = "demo.sd.redhat.com.GetAccountResponse")
    @WebResult(name = "return", targetNamespace = "")
    public demo.sd.redhat.com.Account getAccount(
        @WebParam(name = "id", targetNamespace = "")
        java.lang.String id
    );

    @WebMethod(action = "urn:GetAccounts")
    @RequestWrapper(localName = "getAccounts", targetNamespace = "http://com.redhat.sd.demo/", className = "demo.sd.redhat.com.GetAccounts")
    @ResponseWrapper(localName = "getAccountsResponse", targetNamespace = "http://com.redhat.sd.demo/", className = "demo.sd.redhat.com.GetAccountsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<demo.sd.redhat.com.Account> getAccounts();
}
