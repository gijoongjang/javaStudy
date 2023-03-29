package lambda;

public class LambdaEx4 {

    interface ValidationStrategy {
        boolean execute(String s);
    }

    public static class IsAllLowerCase implements ValidationStrategy {
        @Override
        public boolean execute(String s) {
            return s.matches("[a-z]+");
        }
    }

    public static class IsNumeric implements ValidationStrategy {
        @Override
        public boolean execute(String s) {
            return s.matches("\\d+");
        }
    }

    public static class Validator {
        private final ValidationStrategy strategy;

        public Validator(ValidationStrategy v) {
            this.strategy = v;
        }

        public boolean validate(String s) {
            return strategy.execute(s);
        }
    }

    public static void main(String[] args) {
        Validator numericValidator = new Validator(new IsNumeric());
        boolean b1 = numericValidator.validate("aaaa");
        System.out.println(b1);
        Validator lowerCaseValidator = new Validator(new IsAllLowerCase());
        boolean b2 = lowerCaseValidator.validate("bbbb");
        System.out.println(b2);

        //lambda
        Validator numericValidatorByLambda = new Validator((String s) -> s.matches("\\d+"));
        boolean b3 = numericValidatorByLambda.validate("aaaa");
        System.out.println(b3);
        Validator lowerCaseValidatorByLambda = new Validator((String s) -> s.matches("[a-z]+"));
        boolean b4 = lowerCaseValidatorByLambda.validate("bbbb");
        System.out.println(b4);
    }
}
