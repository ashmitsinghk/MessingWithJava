// Interface inherits interface
interface Animal {

}

interface Dog extends Animal {

}

// Class inherits interface
class Labrador implements Dog {

}

// Class inherits interfaces
interface Mammal {

}

class Cat implements Animal, Mammal {

}

// Class inherits class
class Automobiles {

}

class TwoWheeler extends Automobiles {
    
}