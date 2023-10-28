package Poly;

// Write a program to create a base class called sports with method called play().
//create three subclasses  football, basketball, and rugby override the play() method in each 
// subclass to paly a specific statement for each sports.

class Sports {
    public void play() {
        System.out.println("Playing game");
    }
}

class Football extends Sports {
    public void play() {
        System.out.println("The players playing football");
    }
}

class Basketball extends Sports {
    public void play() {
        System.out.println("The players playing basketball");
    }

    class Rugby extends Sports {
        public void play() {
            System.out.println("The players playing Rugby");
        }
    }

    public static void main(String[] args) {
        Sports Sports = new Sports();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        Sports.play();
        football.play();
        basketball.play();
        rugby.play();

    }
}
