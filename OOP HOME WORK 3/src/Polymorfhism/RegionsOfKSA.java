package Polymorfhism;

public class RegionsOfKSA {
	// Polymorphism //

		public static void main(String[] args) {
			Regions obj = new Regions();
			
			obj = new CentralRegions();
			obj.Cities();
			
			obj = new WesternRegions();
			obj.Cities();
			
			obj = new EasternRegions();
			obj.Cities();
			
			obj = new SouthernRegions();
			obj.Cities();
			
			obj = new NorthernRegions();
			obj.Cities();
		}

	}

	class Regions {
		// Create an Overriding method//
		void Cities(){
			System.out.println("all regions of kingdom of saudi arabia");
		}

	}
		class CentralRegions extends Regions{
			void Cities(){ // Overriding method//
				super.Cities(); // We Use Super keyword 
				System.out.println("Central Regions in the K.S.A.: ");
				System.out.println("1- Riyadh is the Capital of the K.S.A.");
				System.out.println("2- AlQussim");
		}
	}
		class WesternRegions extends Regions{
			void Cities(){ // Overriding method//
				System.out.println("Western Regions in the K.S.A.: ");
				System.out.println("1- Mecca is the holy capital");
				System.out.println("2- Medina");
				System.out.println("3- Jeddah");
		}
	}
		class EasternRegions extends Regions{
			void Cities(){ // Overriding method//
				System.out.println("Eastern Regions in the K.S.A.: ");
				System.out.println("1- Dammam");
				System.out.println("2- Hasa");
			}
		}
		class SouthernRegions extends Regions{
			void Cities(){ // Overriding method//
				System.out.println("Southern Regions in the K.S.A.: ");
				System.out.println("1- Najran");
				System.out.println("2- Abha");
			}
		}
		class NorthernRegions extends Regions{
			void Cities(){ // Overriding method//
				System.out.println("Northern Regions in the K.S.A.: ");
				System.out.println("1- Tabuk");
				System.out.println("2- AlJawf");


			}
		}
