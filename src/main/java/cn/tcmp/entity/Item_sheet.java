package cn.tcmp.entity;

import lombok.Data;

/**
 * item_sheet  generated at 2019-06-27 15:55:25 by: eric
 */
@Data
/**
 * 项目表
 * */
public class Item_sheet{
	private int ItemID;//主键
	private String Entryname;//项目名称
	private Item_type_table ItemtypeID;//项目类型ID
	private String Englishname;//英文名称
	private String Projectcode;//项目代码
	private int Projectsizelowercase;//项目规模(小写)
	private String Projectsizecapitalization;//项目规模(大写)
	private int Projectduration;//项目期限
	private String TermUnit;//期限单位
	private String Dateofestablishment;//成立日期
	private String MaturityDate;//到期日期
	private String Financers;//融资方
	private Product_classification_table ProductclassificationID;//产品分类ID
	private Channel_list ChanneltableID;//渠道表ID
	private String SourcedockerA;//来源方对接人a
	private String SourcedockerB;//来源方对接人b
	private String SourcedockerC;//来源方对接人c
	private String ProductManagerA;//产品经理A
	private String ProductManagerB;//产品经理B
	private String Custodyaccount;//保管账号
	private String Custodianbank;//保管银行
	private String Custodialhouseholdname;//保管户名
	private String RaisingAccount;//募集账号
	private String Collectinghouseholdnames;//募集户名
	private String RaisingBank;//募集银行
	private String Notes;//备注
	private Currency_list RaiseCurrency;//募集币种
	private Currency_list InvestmentCurrency;//投资币种
	private String Manager;//管理人
	private Investment_direction_table InvestmentDirectionID;//投资方向ID
	private Investments_schedule InvestmentModeID;//投资方式ID
	private Integer IsNotStructure;//是否结构化
	private Distribution_of_income IncomeDistributionID;//收益分配方式ID
	private Frequency_of_income_distribution IncomeDistributionFrequencyID;//收益分配频度ID
	private Asset_management_report amrID;//资产管理报告频度ID
	private String ProjectLocation;//项目所在地
	private String InvestmentConsultan;//投资顾问
	private Asset_management_report amrID;


}
