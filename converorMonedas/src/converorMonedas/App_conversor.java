package converorMonedas;

import javax.swing.JOptionPane;

public class App_conversor {
	public static void main(String[] args) {
		
	try {
		menuConvertir();
	}
	catch (Exception e) {
		JOptionPane.showMessageDialog(null," Valor no valido solo acepta numeros ");

		if (JOptionPane.showConfirmDialog(null, "Quieres hacer otra operacion?", "Cambio de Divisas",
				JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) {
				// yes option
			try {
				menuConvertir();
			}
			catch (Exception i) {
				JOptionPane.showMessageDialog(null," Valor no valido solo acepta numeros ");
			}
				} else {
				// no option
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
					
				}
	}
	
		
	}
	
	public static void menuConvertir() {
		double DollarUS = 17.05;
		double EuroEUR = 18.59;
		double LibraGBP = 21.66;
		double YenJPY = 0.11;
		double wonKWR = 76.56;
		double result;
		double monto;
		
		String valor;
		String opcion [] = {"Conversor de Divisas","Conversor de Temperatura"};
		String opciones[] = {"De MX Pesos a Dólar","De MX Pesos  a Euros","De MX Pesos  a Libras Esterlinas","De MX Pesos  a Yen Japonés","De MX Pesos  a Won sul-coreano",
				"De Dólar a MX Pesos","De Euros a MX Pesos","De Libras Esterlinas a MX Pesos","De Yen Japonés a MX Pesos","De Won sul-coreano a MX Pesos"};
		String temp[] = {"Celsius to Fahrenheit","Celsius to Kelvin","Fahrenheit to Celsius","Fahrenheit to Kelvin","Kelvin to Celsius","Kelvin to Fahrenheit"};
		
		while (true) {
			String op1 = (String) JOptionPane.showInputDialog(null, "Elige el programa a utilizar: ","Menu", JOptionPane.DEFAULT_OPTION,null, opcion, opcion[0]);
			
				
			 
			switch (op1) {
				case "Conversor de Divisas":
					String op = (String) JOptionPane.showInputDialog(null, "Elige el tipo de cambio que quieres realizar: ","Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
					if (op == null) {
						break;
					}
					valor = JOptionPane.showInputDialog("Cual es el monto a convertir: ");
					monto = Double.parseDouble(valor);
					
					switch (op) {
						case "De MX Pesos a Dólar":
						
							result = (double)Math.round((monto/DollarUS)* 100d) / 100d;
							JOptionPane.showMessageDialog(null, "Usted tiene: $" + result +" Dólares");
							break;
						case "De MX Pesos  a Euros":
							result = (double)Math.round((monto/EuroEUR)* 100d) / 100d;
							JOptionPane.showMessageDialog(null, "Usted tiene: $" + result +" Euros");
							break;
						case "De MX Pesos  a Libras Esterlinas":
							result = (double)Math.round((monto/LibraGBP)* 100d) / 100d;
							JOptionPane.showMessageDialog(null, "Usted tiene: $" + result +" Libras Esterlinas");
							break;
						
						case "De MX Pesos  a Yen Japonés":
							result = (double)Math.round((monto/YenJPY)* 100d) / 100d;
							JOptionPane.showMessageDialog(null, "Usted tiene: $" + result +" Yen Japonés");
							break;
						
						case "De MX Pesos  a Won sul-coreano":
							result = (double)Math.round((monto/wonKWR)* 100d) / 100d;
							JOptionPane.showMessageDialog(null, "Usted tiene: $" + result +" Won sul-coreano");
							break;
						
						case "De Dólar a MX Pesos":
							result = (double)Math.round((monto*DollarUS)* 100d) / 100d;
							JOptionPane.showMessageDialog(null, "Usted tiene: $" + result +" Pesos Mx");
							break;
						
						case "De Euros a MX Pesos":
							result = (double)Math.round((monto*EuroEUR)* 100d) / 100d;
							JOptionPane.showMessageDialog(null, "Usted tiene: $" + result +" Pesos  Mx");
							break;
						
						case "De Libras Esterlinas a MX Pesos":
							result = (double)Math.round((monto*LibraGBP)* 100d) / 100d;
							JOptionPane.showMessageDialog(null, "Usted tiene: $" + result +" Pesos Mx");
							break;
						
						case "De Yen Japonés a MX Pesos":
							result = (double)Math.round((monto*YenJPY)* 100d) / 100d;
							JOptionPane.showMessageDialog(null, "Usted tiene: $" + result +" Pesos Mx");
							break;
						
						case "De Won sul-coreano a MX Pesos":
							result = (double)Math.round((monto*wonKWR)* 100d) / 100d;
							JOptionPane.showMessageDialog(null, "Usted tiene: $" + result +" Pesos Mx");
							break;
					}
				default: {
					break;
				}	
				case "Conversor de Temperatura":
					String opt = (String) JOptionPane.showInputDialog(null, "Elije el valor de Temperatura a utilizar: ","Menu", JOptionPane.DEFAULT_OPTION, null, temp, temp[0]);
					if (opt == null) {
						break;
					}
					valor = JOptionPane.showInputDialog("Cual es el valor de temperatura a convertir: ");
					monto = Double.parseDouble(valor);
					
					switch (opt) {
						case "Celsius to Fahrenheit":
							result = (double)Math.round((monto* 9/5 + 32)* 100d) / 100d;
							JOptionPane.showMessageDialog(null,monto+" °Celsius to Fahrenheit es: "+ result +" °F");
							break;
						case "Celsius to Kelvin":
							result = (double)Math.round((monto+ 273.15)* 100d) / 100d;
							JOptionPane.showMessageDialog(null,monto+" °Celsius to Kelvin es: "+ result +" °K");
							break;
							
						case "Fahrenheit to Celsius":
							result = (double)Math.round(((monto - 32) * 5/9)* 100d) / 100d;
							JOptionPane.showMessageDialog(null,monto+" °Fahrenheit to Celsius es: "+ result +" °C");
							break;
						case "Fahrenheit to Kelvin":
							result = (double)Math.round(((monto + 459.67) * 5/9)* 100d) / 100d;
							JOptionPane.showMessageDialog(null,monto+" °Fahrenheit to Kelvin es: "+ result +" °K");
							break;
						case "Kelvin to Celsius":
							result = (double)Math.round((monto - 273.15)* 100d) / 100d;
							JOptionPane.showMessageDialog(null,monto+" °Kelvin to Celsius es: "+ result +" °C");
							break;
						case "Kelvin to Fahrenheit":
							result = (double)Math.round((monto * 9/5 - 459.67)* 100d) / 100d;
							JOptionPane.showMessageDialog(null,monto+" °Kelvin to Fahrenheit es: "+ result +" °F");
							break;
					}
					
			}
			
			
			
			if (JOptionPane.showConfirmDialog(null, "Quieres hacer otra operacion?", "Cambio de Divisas",
					JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) {
					//JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					// yes option
					} else {
					// no option
						JOptionPane.showMessageDialog(null, "Programa Finalizado");
						break;
					} 
			
			
			
		}
		
		
		
		
		
	}
}
