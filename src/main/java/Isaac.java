public class Isaac {
    public static void main(String[] args) {
        System.out.println("This is how Git and Github works when team members collaborate");
        successMethod();

    }

    public static void successMethod(){

        int dailyCollaboration=1;
        int successRate=0;

        switch (dailyCollaboration){
            case 1:
                successRate=10;
                break;
            case 2:
                successRate=40;
                break;
            case 3:
                successRate=60;
                break;
            case 4:
                successRate=80;
                break;
            case 5:
                successRate=100;
                break;
            default:
                successRate=-1;
        }
    }


}
