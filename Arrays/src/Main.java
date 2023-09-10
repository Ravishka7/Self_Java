public class Main {
    public static void main(String[] args){

        String cars[] = {"Bugatti","Koeneigsegg","Lamborghini","Ferrari","Porsche"};

        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }

        int tags[] = new int[5];
        tags[0] = 1;
        tags[1] = 2;
        tags[2] = 3;
        tags[3] = 4;
        tags[4] = 5;

        for(int i=0;i<tags.length;i++){
            System.out.println(tags[i]);
        }


        //2D Arrays
        String[][] vehicles = new String[3][3];

        vehicles[0][0] = "Koeneigsegg";
        vehicles[0][1] = "Bugatti";
        vehicles[0][2] = "Lamborghini";
        vehicles[1][0] = "Ferrari";
        vehicles[1][1] = "Porsche";
        vehicles[1][2] = "Aston Martin";
        vehicles[2][0] = "Mercedes";
        vehicles[2][1] = "BMW";
        vehicles[2][2] = "Audi";

        for(int i=0;i<vehicles.length;i++){
            System.out.println();
            for(int j=0;j<vehicles[i].length;j++){
                System.out.println(vehicles[i][j]+" ");
            }
        }

        int[][] numbers ={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<numbers.length;i++){
            System.out.println();
            for(int j=0;j<numbers[i].length;j++){
                System.out.println(numbers[i][j]+" ");
            }
        }


    }
}
