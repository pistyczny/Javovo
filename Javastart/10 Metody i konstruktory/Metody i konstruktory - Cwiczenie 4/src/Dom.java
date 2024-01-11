    public class Dom {
        double woda;
        double ropa;

        Dom ( double w, double r){
            woda = w;
            ropa = r;
        }


        String dostarczStatus (){
            return "Ilosc wody: " + woda + " litrow wody, ropa " + ropa + " litrow";
        }

        void wezPrysznic(){
            woda -= 48;
        }

        void wezKapiel(){
            woda = woda - 86;
        }

        void zrobObiad(){
            woda -= 4;
            ropa -= 0.1;
        }

        void zagotujWode(){
            woda -= 0.5;
            ropa -= 0.05;
        }

        void ogladajTv(int godziny){
            double zuzyciePaliwa = godziny * 0.06;
            ropa = ropa - zuzyciePaliwa;

        }
    }
