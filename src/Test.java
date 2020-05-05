public class Test {
    public static void main(String[] args) {
        String[] valid = new String[]{"C0318G"};
        String [] invalid = new String[]{"M0318G, P0323A"};
        ValidateClass validateClass = new ValidateClass();
        for (String x : valid){
            boolean isValid = validateClass.validate(x);
            System.out.println("Name " +x+ " isValid " + isValid);
        }
        for (String x : invalid){
            boolean isValid = validateClass.validate(x);
            System.out.println("Name " +x+ " isValid " + isValid);
        }
    }
}
