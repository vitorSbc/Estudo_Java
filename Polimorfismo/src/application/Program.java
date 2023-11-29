package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.FuncionarioTercerizado;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> funcionarios = new ArrayList<Employee>();
		
		System.out.print("Entre o numero de funcionarios: ");
		Integer numberEmployee = sc.nextInt();
		for(int i=0;i<numberEmployee;i++) {
			System.out.printf("Funcionario #%d data: \n",i+1);
			System.out.print("Tercerizado (s/n)? ");
			char answer = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
				if (answer == 's') {
					System.out.print("Additional charge: ");
					Double valueAdditional = sc.nextDouble();
					Employee funcionarioTercerizado = new FuncionarioTercerizado(name, hours, valuePerHour, valueAdditional);
					funcionarios.add(funcionarioTercerizado);
				}
				else {
					Employee funcionario = new Employee(name, hours, valuePerHour);
					funcionarios.add(funcionario);
			}
			
		}
		for(Employee c : funcionarios) {
			System.out.println(c);
		}
		
		sc.close();
	}

}
