package br.univille.observer;

public class Cliente {
    public static void main(String[] args) {
        var grupoFamilia= new Publisher();

        var shaolinMatador = new ConcreteSubscriber();
        var piolho = new ConcreteSubscriber();
        var chaves = new ConcreteSubscriber();

        grupoFamilia.subscribe(shaolinMatador);
        grupoFamilia.subscribe(piolho);
        grupoFamilia.subscribe(chaves);
        
        grupoFamilia.setMainState("Hoje é dia de feijoada");
        grupoFamilia.notifySubscribers();
    }
}
