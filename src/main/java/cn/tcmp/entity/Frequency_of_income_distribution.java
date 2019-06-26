package cn.tcmp.entity;

import lombok.Data;

/**
 * frequency_of_income_distribution  generated at 2019-06-26 13:37:47 by: eric
 */
@Data
public class Frequency_of_income_distribution{
	private int Income_Distribution_FrequencyID;
	private String Frequency_Of_IncomeDistribution_Name;

	public void setIncome_Distribution_FrequencyID(int Income_Distribution_FrequencyID){
		this.Income_Distribution_FrequencyID=Income_Distribution_FrequencyID;
	}

	public int getIncome_Distribution_FrequencyID(){
		return Income_Distribution_FrequencyID;
	}

	public void setFrequency_Of_IncomeDistribution_Name(String Frequency_Of_IncomeDistribution_Name){
		this.Frequency_Of_IncomeDistribution_Name=Frequency_Of_IncomeDistribution_Name;
	}

	public String getFrequency_Of_IncomeDistribution_Name(){
		return Frequency_Of_IncomeDistribution_Name;
	}

}
