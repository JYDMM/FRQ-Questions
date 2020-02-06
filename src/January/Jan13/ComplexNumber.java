package January.Jan13;

public class ComplexNumber {
    private int a, b;
    /*
    In Mathematics, a complex number is a number that is composed of both a real component
    and an imaginary component. Complex numbers can be expressed in the form a + bi where a and
    b are real numbers and i is the imaginary number sqrt(-1). In a complex expression, a is
    concidered the 'real part' and b is concidered the 'imaginary part'

    You can add, subtract, multiply, and divide complex numbers. Addition with complex numbers
    involves adding the real parts and the imaginary parts as two separate sums and expressing the
    answer as a new complex number.

    ... bla bla bla ...

    Write the complete ComplexNumber class, including:
     - Any necessary instance variables
     - A constructor that takes two int variables, a and b, representing the components of the
       complex number expressed a + bi
     - The add does adding
     - we get the rest


     */

    public int A() {
        return a;
    }

    public int B() {
        return b;
    }

    public ComplexNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public ComplexNumber add(ComplexNumber toBeAdded) {
        return new ComplexNumber(this.A() + toBeAdded.A(), this.B() + toBeAdded.B());
    }

    public ComplexNumber mult(ComplexNumber toBeMultiplied) {
        return new ComplexNumber(this.A() * toBeMultiplied.A() - this.B() * toBeMultiplied.B(),
                this.A() * toBeMultiplied.B() + this.B() * toBeMultiplied.A());
    }









}
