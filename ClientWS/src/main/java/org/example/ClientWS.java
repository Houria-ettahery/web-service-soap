package org.example;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToDH(10.0));
        Compte cp=proxy.getCompte(7);
        System.out.println("code="+cp.getCode());
        System.out.println("solde="+cp.getSolde());
        System.out.println("dateCreation="+cp.getDateCreation());

        List<Compte> comptelist=proxy.listComptes();
        for (Compte c:comptelist){
            System.out.println("----------------------");
            System.out.println("code="+c.getCode());
            System.out.println("solde="+c.getSolde());
            System.out.println("dateCreation="+c.getDateCreation());

        }


    }
}

