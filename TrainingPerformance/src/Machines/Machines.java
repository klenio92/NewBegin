package Machines;

public class  Machines {
    // nome do exercicio/maquina, peso, repetição, descanço tempo, numero da ordem do exercicio  e observações
    public String machine;
    public float wheight;
    public int countDown;
    public int countTime;
    public int scheldule;
    public String obs;

    // Metodo alterar peso, alterar descanço, alterar repetição, alterar ordem e mudar observação
    public void state() {
        System.out.println("Tempo é: " + this.setCountDown());
        System.out.println("Tempo é: " + this.getCountDown());
    }

    public void changeMachine(String t) {
        this.setMachine(t);
    }

    public void changeWheight() {
    }

    public void changeCountDown() {
        if (this.getCountDown() > 0) {
            System.out.println("O tempo de descanso é de:" + getCountDown());
        } else (this.getCountDown() < 0) {
            System.out.println("Tempo invalido");
        }
    }

    public void changeCountTime() {

    }
    public void changeScheldule() {

    }

    public void obs() {

    }
    //...


    public Machines() {

    }

}
