import Machines.Machines;

public class TrainingPerformance {
    public static void main(String[] args) {
        // deve conter ultima atualização
        // mostrar uma ficha com cada maquina
        // enviar alteração da ficha e guardar os novos dados
        // marcador de quantidade de treino (talvez)
        // criar 4 tipos de listas de divisão de treino
        // tentar fazer TIPO para separar os treinos em A B C D
        // countdown em cada repetição
        // editar uma ficha de maquina já existente e atualizar "ultima atualização"
        Machines p1 = new Machines();
        p1.setCountDown(1);
        p1.changeCountDown(1);

        p1.state();
    }

    //...


        public String getMachine() {
            return machine;
        }

        public void setMachine(String machine) {
            this.machine = machine;
        }

        public float getWheight() {
            return wheight;
        }

        public void setWheight(float wheight) {
            this.wheight = wheight;
        }

        public int getCountDown() {
            return countDown;
        }

        public void setCountDown(int countDown) {
            this.countDown = countDown;
        }

        public int getCountTime() {
            return countTime;
        }

        public void setCountTime(int countTime) {
            this.countTime = countTime;
        }

        public int getScheldule() {
            return scheldule;
        }

        public void setScheldule(int scheldule) {
            this.scheldule = scheldule;
        }

        public String getObs() {
            return obs;
        }

        public void setObs(String obs) {
            this.obs = obs;
        }
    }
}