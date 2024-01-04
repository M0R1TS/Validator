public class Main {
    public static void main(String[] args) {
        int value = 35;
//        validate(value, new ValidatorImpl());
        validate(value, new Validator() {
            @Override
            public boolean validate(int value) {
                return value >= 40;
            }
        });
    }

    private static void validate(int value, Validator validator) {
        System.out.println("Проверяем переданное значение....");
        boolean isValid = validator.validate(value);
        if (isValid){
            System.out.println("Отлично! Значение верное!");
        } else {
            System.out.println("Упс! Значение не верное!");
        }
    }
}