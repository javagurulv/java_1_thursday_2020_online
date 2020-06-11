package student_vadims_vladisevs.lesson6.day_x.super_task_1;

import java.util.ArrayList;

class Policy {
    ArrayList<Property> propertyList = new ArrayList<>();
    ArrayList<Electronic> electronicsList = new ArrayList<>();
    ArrayList<Double> electronicsPriceList = new ArrayList<>();

    public Policy(){
            }



    public double isTheftElectronics(){
        double sum = 0.0;
        for (double temp : electronicsPriceList){
            sum += temp;
        }

        if (sum >= 2000){
            return sum * 0.02;
        }

        return sum * 0.01;
    }



    public double isFireElectronic(){
        double sum = 0.0;

        for (double temp : electronicsPriceList){
            sum += temp;
        }

        if (sum < 2000) {
            return sum * 0.03;
        }

        return sum * 0.04;
     }

    public double isFireProperty(Property property){
        double cadastralPrice = property.getCadastralPrice();
        boolean isHouse = property.isHouse();
        if (isHouse) {
            return  cadastralPrice * 0.05;

        } else {
            return cadastralPrice * 0.02;
        }
    }

    public void addElectronic(String electronicType, double electronicPrice){
        Electronic electronic = new Electronic(electronicType, electronicPrice);
        electronicsList.add(electronic);
        electronicsPriceList.add(electronic.getElectronicPrice());
    }


    public void addPropertyHouse(String address, double cadastralPrice){
        Property newProperty = new Property(address, cadastralPrice, true);
        propertyList.add(newProperty);
    }

    public void addPropertyFlat(String address, double cadastralPrice){
        Property newProperty = new Property(address, cadastralPrice, false);
        propertyList.add(newProperty);
    }


    public void createClient(String name){
        Client client = new Client(name);
    }




    public void printInfo(String clientName) {
        System.out.println("Client name - " + clientName);

        for (Property property : propertyList) {
            String address = property.getAddress();
            double price = property.getCadastralPrice();

            if (property.isHouse()){
                System.out.println("Property type - House, address - " + address + ", cadastral price - " + price);
            }

            if (!property.isHouse()){
                System.out.println("Property type - Flat, address - " + address + ", cadastral price - " + price);
            }
        }

        for (Electronic electronic : electronicsList){
            String electronicType = electronic.getElectronicType();
            double electronicPrice = electronic.getElectronicPrice();

            System.out.println("Electronic type - " + electronicType + ", price - " + electronicPrice);
        }

    }
}
